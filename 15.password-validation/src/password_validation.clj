(ns password-validation)

(defn read-input [question]
  (println question)
  (read-line))

(def credentials {:deniss "rimmer" :daven "lester"})

(let [username (read-input "Username:")
      password (read-input "Password:")]
  (if (= password (credentials (keyword username)))
    (println (str "Welcome, " username "!"))
    (println "Get the fuck out of here, Rimmer!"))
  )