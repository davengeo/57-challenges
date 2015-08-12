(ns pizza-party)
(defn read-int [question]
 (println question)
 (biginteger (read-line)))

(let [people (read-int "How many people?")
      pizzas (read-int "How many pizzas?")
      slicing (read-int "How many slices per pizza?")]
  (println "So" people " people and" pizzas "pizzas...")
  (println "Each person gets" (str (quot (* pizzas slicing) people)) " pieces.")
  (println "There are" (str (mod (* pizzas slicing) people)) "leftovers"))
