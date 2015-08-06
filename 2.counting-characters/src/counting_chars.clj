(ns counting-chars)
(println "What's the input string?")
(let [my-input (read-line)]
	(println my-input " has " (count my-input) " chracters"))
