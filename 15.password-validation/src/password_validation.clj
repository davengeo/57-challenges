(ns password-validation)

(defn read-input [question]
  (println question)
  (read-line))


(let [username (read-input "Username:")
      password (read-input "Password:")]
  (if (= password "1234")
    (println "Welcome, motherfucker!")
    (println "Get the fuck out of here, Rimmer!"))
  )