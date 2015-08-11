(ns simple-math)

(defn read-int [pos]
	(println "What is the" pos "number?")
	(bigint (read-line)))

(def oper [{:f + :n "+"} {:f - :n "-"} {:f * :n "x"} {:f / :n "/"}])

(let [first (read-int "first")
			second (read-int "second")]
		(doseq [op oper]
			(println (str first (:n op) second "=" ((:f op) first second)))))