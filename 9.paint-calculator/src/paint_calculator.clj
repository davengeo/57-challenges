 (ns paint-calculator)
(def ^:dynamic conversion-rate 350)
(defn read-int [dim]
  (println "What is the" dim "of the room in feet?")
  (bigint (read-line)))

(defn paint-gallons [area]
  (/ area conversion-rate))
(let  [length (read-int "length")
       width (read-int "width")
       area (* length width)]
  (println "so we have" area "square feet")
  (println "you are gonna need" (paint-gallons area) "gallons of paint")
)