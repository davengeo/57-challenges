(ns tax-calculator)

(defn read-bigdec [question]
  (println question)
  (bigdec (read-line)))

(defn read-string [question]
  (println question)
  (read-line))

(defn tax [amount state]
  (if (= "ws" state)
    (bigdec (* amount 1, 055))))

(let [amount (read-bigdec "What is the order amount?")
      state (read-string "What is the state?")]
  (println (str "The subtotal is $" amount)
           (println (str "The tax is $" (tax amount state)))))