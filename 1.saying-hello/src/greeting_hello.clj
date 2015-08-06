(ns greeting-hello)

;globals
(def greetings {:spanish "Hola" :english "Hello"})
(def surnames {:spanish '(David, Pedro)
							 :english '(Alistair, Peter)})

(defn print-greeting [greeting my-input]
	(println greeting my-input ".This is a test!"))

(do
	(println "What's your name?")
	(def greeting "Stranger")
	(let [my-input (read-line)]
		(doseq [[k v] surnames]
			(doseq [iter v]
				(if (.contains (re-find #"(\w+)" my-input) (str iter))
					(with-redefs [greeting (k greetings)]
						(print-greeting greeting my-input)
					)
				)
			)
		)
	)
)

;TODO: use an atom to filter the condition