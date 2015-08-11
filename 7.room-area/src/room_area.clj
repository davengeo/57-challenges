(ns room-area)

(defn read-int [dim]
      (println "What is the" dim "of the room in feet?")
      (bigint (read-line)))

(defn feet-meter [feet]
  (Math/sqrt (* (* feet feet) 0.09290304)))

(defmulti area :type)
(defmethod area :feet [shape]
  (* (:length shape) (:width shape)))
(defmethod area :meters [shape]
  (* (feet-meter (:length shape)) (feet-meter (:width shape))))

(let  [length (read-int "length")
       width (read-int "width")]
      (println "You entered dimensions of " length  " feet by " width " feet.")
      (println "The area is")
      (println (area {:type :feet :length length :width width}) "square feet")
      (println (area {:type :meters :length length :width width}) "square meters"))