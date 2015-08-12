(ns pizza-party)
(defn read-int [question]
 (println question)
 (bigint (read-line)))

(let [people (read-int "How many people?")
      pizzas (read-int "How many pizzas?")
      slicing (read-int "How many slices per pizza?")]
  (println "So" people "with" pizzas "pizzas...")
  (println "It is " (/ (* pizzas slicing) people) "each person."))