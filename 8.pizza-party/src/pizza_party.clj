(ns pizza-party)
(defn read-int [question]
 (println question)
 (biginteger (read-line)))

(let [people (read-int "How many people?")
      pizzas (read-int "How many pizzas?")
      slicing (read-int "How many slices per pizza?")]
  (println "So" people " people and" pizzas "pizzas...")
  (println "It is " (str (quot (* pizzas slicing) people)) " slices each person.")
  (println "There is " (str (mod (* pizzas slicing) people)) "leftovers"))
