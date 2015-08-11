(ns room-area)

(defn read-int [dim]
      (println "What is the" dim "of the room in feet?")
      (bigint (read-line)))

(defn calc-area [length width]
  (* length width))

(defn feet-meter [feet]
  (Math/sqrt (* (* feet feet) 0.09290304)))

(let  [length (read-int "length")
       width (read-int "width")]
      (println "You entered dimensions of " length  " feet by " width " feet.")
      (println "The area is")
      (println (calc-area length width) "square feet")
      (println (calc-area (feet-meter length) (feet-meter width)) "square meters"))

; m2 = f2 × 0.09290304
