(ns saying-hello)

;with vars
(println "What's your name?")
(let [my-input (read-line)]
     (println "Hello, " my-input ". Nice to meet you!"))

;without vars
(do
  (println "What's your name?")
  (println "Hello, " (read-line) ". Nice to meet you!")
 )

;different greetings

(defn print-greeting [greeting my-input]
  (println greeting my-input " .This is a test!"))

(do
  (def greeting "Stranger, ")
  (println "What's your name?")
  (let [my-input (read-line)]
    (if (re-find #"David" my-input)
      (with-redefs [greeting "Hola, "]
        (print-greeting greeting my-input))
      ;:else
      (if (re-find #"Peter" my-input)
        (with-redefs [greeting "Hello, "]
          (print-greeting greeting my-input))
        ;else
        (print-greeting greeting my-input)
        )
      )
    )
  )

