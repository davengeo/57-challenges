(ns greeting-hello)

;dictionaries
(def greetings {:spanish "Hola" :english "Hello"})
(def surnames {:spanish '(David, Pedro)
							 :english '(Alistair, Peter)})

(defn print-greeting [greeting my-input]
	(println greeting my-input ".This is a test!"))

(do
	(println "What's your name?")
	(def greeting-flag (atom 0))
	(let [my-input (read-line)]
		(doseq [[k v] surnames]
			(doseq [iter v]
				(if (and (= @greeting-flag 0) (.contains (re-find #"(\w+)" my-input) (str iter)))
					(do
						(print-greeting (k greetings) my-input)
						(swap! greeting-flag inc)
						))))
		;default
		(if (= @greeting-flag 0)
			(print-greeting (:english greetings) my-input)
		)
	)
)

;TODO: use an atom to filter the condition