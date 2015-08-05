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
(do
  (println "What's your name?")
  (let [my-input (read-line) greeting nil]
    (when (re-find #"David" my-input)
      (def greeting "Hola, ")
    )
    (when (re-find #"Peter" my-input)
      (def greeting "Hello, ")
    )
    (when-not greeting
      (def greeting "Stranger, ")
    )
    (println greeting my-input ". Nice to meet you!")
  )
)