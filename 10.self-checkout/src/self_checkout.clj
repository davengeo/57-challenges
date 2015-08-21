 (ns self-checkout)

(defn read-about [word item-num]
  (println "What is the" word "of the item #" item-num "?")
  (bigint (read-line)))

(defn read-price [pos]
  (* (read-about "price" pos) (read-about "quantity" pos)))

(defn gross-price [coll]
  (int (reduce + 0 (map read-price coll))))

(let [total (gross-price (range 3))]
  (println "Total is " total))

