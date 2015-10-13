(ns simple-interest)
(defn read-int [question]
        (println question)
        (bigdec (read-line)))

(defn simple-int [principal rate period]
        (* principal (+ 1.0 (* rate period))))

(let [principal (read-int "Enter the principal:")
      rate (read-int "Enter the rate:")
      period (read-int "Enter the period:")]
        (prn (simple-int principal rate period)))

