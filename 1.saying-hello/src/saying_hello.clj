(ns saying-hello)

;with vars
(println "What's your name?")
(let [my-input (read-line)]
     (println "Hello, " my-input ". Nice to meet you!"))

;without vars
(do
  (println "What's your name")
  (print "Hello, " (read-line) ". Nice to meet you!")
 )

;different greetings

