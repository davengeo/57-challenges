(ns compound-interest)

(defn read-bigdec [question]
  (println question)
  (bigdec (read-line)))

(defn expow [x n]
  (reduce * (repeat n x)))

(defn round2
  "Round a double to the given precision (number of significant digits)"
  [precision d]
  (let [factor (Math/pow 10 precision)]
    (/ (Math/round (* d factor)) factor)))

(defn comp-interest [principal rate period number]
  (* principal (expow (+ 1 (/ (/ rate 100) number)) (* number period))))

(let [principal (read-bigdec "Enter the principal:")
      rate (read-bigdec "Enter the rate:")
      period (read-bigdec "Enter the period:")
      number (read-bigdec "Enter the number of times the interest is compounded per year:")]
  (println (round2 2 (comp-interest principal rate period number))))

