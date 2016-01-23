(ns misc.core
  (require [buddy.hashers :as hashers]))

(defn read-input [question]
  (println question)
  (read-line))

(def credentials {
                  :deniss "bcrypt+sha512e62ca34cbafcae6129b08c7e3732b143$12$936443f5be1481bf81562a431cc0dabb3a8fbe7d18581802"
                  :daven  "bcrypt+blake2b-512$42d39b2abc40263ba6080472646c1554$12$8d69e1cc0ee750ea2f8b9b69cfc9fabe478614819eb62acf"
                  }
  )

(defn encrypted [text] (hashers/encrypt text {:alg :bcrypt+sha512}))


(let [username (read-input "Username:")
      password (read-input "Password:")]
  (do (if (hashers/check password (credentials (keyword username)))
        (println (str "Welcome, " username "!"))
        (println "Get the fuck out of here, Rimmer!"))
      (println (encrypted password))
      ))
