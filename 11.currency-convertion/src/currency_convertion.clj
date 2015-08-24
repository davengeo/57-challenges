(ns currency-convertion)

;using the paradigm explained in https://gist.github.com/john-kurkowski/3484356
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


(defn read-number-with-question [question]
  (try-times 3 (do
                 (println question)
                 (bigint (read-line)))))

(let [currency (read-number-with-question "What is the number?")]
  (prn currency))


