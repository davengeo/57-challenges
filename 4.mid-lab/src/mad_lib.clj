(ns mad-lib)

(defn get-part [part]
	(println (str "Enter a " part "?"))
	(read-line))


(let [noun (get-part "noun")]
	(let [verb (get-part "verb")]
		(let [adjective (get-part "adjective")]
			(let [adverb (get-part "adverb")]
				(println (str "Did you " verb " your " adjective " " noun " " adverb "?"))))))

; use this fo improve (def cases '("noun" "verb" "adjective" "adverb"))