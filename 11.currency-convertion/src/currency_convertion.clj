(ns currency-convertion)

;using the case explained in https://gist.github.com/john-kurkowski/3484356
(defn try-times* [times thunk]
  (let [attemps (first (drop-while #{::fail}
                                   (repeatedly times
                                               #(try
                                                 {::sucess (thunk)}
                                                 (catch Exception _ ::fail)))))]
    (::sucess attemps)))

(defmacro try-times
  [times & thunk]
  `(try-times* ~times (fn [] ~@thunk)))


(defn maybe? [f & args]
  (let [value (apply f args)]
    (if (nil? value)
      (System/exit -1)
      (eval value))))

(defn read-number-with-question [question]
  (->>   #(try-times 3
                     (do
                      (println question)
                      (bigint (read-line))))
          (maybe?)))

(def conversion-rates {'eur 1.1147 'bpd 1.51695})

(defn read-currency [question]
  (->> #((symbol (println question) (read-line)) conversion-rates)
       (maybe?)))

(let [amount (read-number-with-question "How many bucks?")
      currency (read-currency "Which currency?")]
  (println "These are ..." (* ((symbol currency) conversion-rates) amount) "us dollars, dude"))




