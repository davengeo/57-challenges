(ns mad-lib-improved)
(def cases
	(seq ["verb" "noun" "adjective" "adverb"]))
(def breakers
	(seq ["Did you " "your " " " " "]))

(defn get-part [part]
	(println (str "Enter a " part "?"))
	(read-line))

(defn get-answers [coll]
	(for [part coll]
		(get-part part)))

(defn process-all [coll]
	(for [x (range (count coll))]
		(str (nth breakers x) (nth coll x))))

;(println (process-all (get-answers cases)))

(->>
	(get-answers cases)
	(process-all)
	(println))