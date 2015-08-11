 (ns room-area)

(defn read-int [dim]
      (println "What is the" dim "of the room in feet?")
      (bigint (read-line)))

(defn calc-area [length width]
  (* length width))

(let  [length (read-int "length")
       width (read-int "width")]
      (println "You entered dimensions of " length  " feet by " width " feet.")
      (println "The area is")
      (println (calc-area length width) "square feet")
      (println "ja"))

; m2 = f2 × 0.09290304
