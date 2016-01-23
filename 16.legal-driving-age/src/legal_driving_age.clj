(ns legal-driving-age)

(defn read-input [question]
  (println question)
  (bigint (read-line)))

(def LEGAL_AGE 16)

(let [age (read-input "What is your age, kid?")]
  (if (< age LEGAL_AGE)
    (println "You are not old enough to drive, brat")
    (println "You are old enough to drive, Kimi")
    )
  )


