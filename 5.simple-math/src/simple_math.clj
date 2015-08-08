(ns simple-math)

(defn read-int [pos]
	(println "What is the" pos "number?")
	(bigint (read-line)))

(def oper [+ - * /])

(let [first-number (read-int "first")]
	(let [second-number (read-int "second")]
		(doseq [op oper]
			(println (str first-number op second-number "=" (op first-number second-number))))))

;how can I get the name of the function?