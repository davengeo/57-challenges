(ns simple-math)

(defn read-int [pos]
	(println "What is the" pos "number?")
	(bigint (read-line)))

(def oper [{:p + :n "+"} {:p - :n "-"} {:p * :n "x"} {:p / :n "/"}])

(let [first-number (read-int "first")]
	(let [second-number (read-int "second")]
		(doseq [op oper]
			(println (str first-number (:n op) second-number "=" ((:p op) first-number second-number))))))