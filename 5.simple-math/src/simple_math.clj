(ns simple-math)

(defn read-int [pos]
	(println "What is the" pos "number?")
	(bigint (read-line)))

(def oper [{:p + :n "+"} {:p - :n "-"} {:p * :n "x"} {:p / :n "/"}])

(let [first (read-int "first")]
	(let [second (read-int "second")]
		(doseq [op oper]
			(println (imstr first (:n op) second "=" ((:p op) first second))))))