(ns saying-hello)

;with vars
(println "What's your name?")
(let [my-input (read-line)]
     (println "Hello, " my-input ". Nice to meet you!"))

;without vars
(do
  (println "What's your name")
  (println "Hello, " (read-line) ". Nice to meet you!")
 )

;different greetings
(do
  (println "What's your name")
  (let [my-input (read-line) greeting nil]
    (if (re-matches #"David" my-input)
      (def greeting "Hola, ")
    )
    (if (re-matches #"Peter" my-input)
      (def greeting "Hello, ")
    )
    (if-not greeting
      (def greeting "Stranger, ")
    )
    (println greeting my-input ". Nice to meet you!")
  )
)