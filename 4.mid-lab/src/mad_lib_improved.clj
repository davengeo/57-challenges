(ns mad-lib-improved)
(println "hello")

(def cases
	(seq ["verb" "noun" "adjective" "adverb"]))
(def breakers
	(seq ["Did you" "your" "" ""]))

(defn get-part [part]
	(println (str "Enter a " part "?"))
	(read-line))

(defn get-answer [coll]
	(for [part coll]
		(get-part part)))

(defn process [coll]
	(for [x (range (count coll))]
		(str (nth breakers x) (nth coll x))))

(println (process (get-answer cases)))