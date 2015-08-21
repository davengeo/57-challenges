(ns self-checkout)
(def tax-rate 0.055)

(defn read-about [word item-num]
  (println "What is the" word "of the item #" item-num "?")
  (bigint (read-line)))

(defn read-price [pos]
  (* (read-about "price" pos) (read-about "quantity" pos)))

(defn gross-price [coll]
  (int (reduce + 0 (map read-price coll))))

(defn tax [price]
  (* price tax-rate))

(let [total (gross-price (range 3))]
  (println "Subtotal:" total)
  (println "Taxes:" (tax total))
  (println "Total:" (+ total (tax total))))

