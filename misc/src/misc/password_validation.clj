(ns misc.password-validation
  (require [buddy.hashers :as hashers]))

(defn read-input [question]
  (println question)
  (read-line))

(def credentials {
                  :deniss "bcrypt+blake2b-512$42d39b2abc40263ba6080472646c1554$12$8d69e1cc0ee750ea2f8b9b69cfc9fabe478614819eb62acf"
                  :daven  "bcrypt+blake2b-512$42d39b2abc40263ba6080472646c1554$12$8d69e1cc0ee750ea2f8b9b69cfc9fabe478614819eb62acf"
                  }
  )

(let [username (read-input "Username:")
      password (read-input "Password:")]

  (if (and (credentials (keyword username))
           (hashers/check password (credentials (keyword username))))
        (println (str "Welcome, " username "!"))
        (println "Get the fuck out of here, Rimmer!"))
  )