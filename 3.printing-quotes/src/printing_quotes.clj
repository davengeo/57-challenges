(ns printing-quotes)
(println "What is the quote?")
(let [my-quote (read-line)]
	(println "What is the author?")
	(let [author (read-line)]
		(println (str author " says " "\"" my-quote "\""))))