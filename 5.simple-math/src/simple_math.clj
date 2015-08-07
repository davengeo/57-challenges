(ns simple-math)

(defn to-int [chr]
	(bigint chr))

(defn read-int [pos]
	(println "What is the" pos "number?")
	to-int (read-line))

(let [first-number (read-int "first")]
	(let [second-number (read-int "second")]
		(prn (+ first-number second-number))))
