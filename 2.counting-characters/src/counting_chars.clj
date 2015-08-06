(ns counting-chars)
(loop []
	(println "What's the input string?")
	(let [my-input (read-line)]
		(if (= 0 (count my-input))
			(recur)
			(println my-input "has" (count my-input) "characters")
			)))