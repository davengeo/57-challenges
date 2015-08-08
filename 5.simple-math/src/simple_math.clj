(ns simple-math)

(defn read-int [pos]
	(println "What is the" pos "number?")
	(bigint (read-line)))

(def oper '(+ - * /))

(let [first-number (read-int "first")]
	(let [second-number (read-int "second")]
		(doseq [op oper]
			(println (op first-number second-number)))))