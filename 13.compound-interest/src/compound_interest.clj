(ns compound-interest)

(defn read-bigdec [question]
  (println question)
  (bigdec (read-line)))

(defn expow [x n]
  (reduce * (repeat n x)))

(defn comp-interest [principal rate period number]
  (* principal (expow (* number period) (+ 1 (/ rate number)))))

(let [principal (read-bigdec "Enter the principal:")
      rate (read-bigdec "Enter the rate:")
      period (read-bigdec "Enter the period:")
      number (read-bigdec "Enter the number of times the interest is compounded per year:")]
  (println (comp-interest principal rate period number))
  (println (expow period number)))
