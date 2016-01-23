(ns legal-driving-age)

(defn read-input [question]
  (println question)
  (read-line))

(defn to-int-or-nil [chs] (if (re-matches #"[0-9]+" chs) (bigint chs) nil))

(def LEGAL_AGE 16)

(let [age (read-input "What is your age, kid?")]
  (if-not (to-int-or-nil age)
    (println "invalid input, brah")
    (if (< (to-int-or-nil age) LEGAL_AGE)
      (println "You are not old enough to drive, brat")
      (println "You are old enough to drive, Kimi"))
    )
  )


