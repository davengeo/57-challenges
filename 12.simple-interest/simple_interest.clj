(ns simple-interest)
(defn read-int [question]
        (println question)
        (bigdec (read-line)))

(defn simple-interest [principal rate period]
        (* principal (+ 1.0 (* (/ rate 100) period))))

(let [principal (read-int "Enter the principal:")
      rate (read-int "Enter the rate:")
      period (read-int "Enter the period:")]
  (println (str "After " period " years at " rate "%, the investment will be worth $"
                (simple-interest principal rate period))))