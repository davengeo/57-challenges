(ns saying-hello)

(println "What's your name?")
(let [my-input (read-line)]
     (println "Hello " my-input))
