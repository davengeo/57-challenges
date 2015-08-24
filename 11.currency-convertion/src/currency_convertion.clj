(ns currency-convertion)

;using the paradigm explained in https://gist.github.com/john-kurkowski/3484356
(defn try-times-wait-millis* [times thunk]
  (let [attemps (first (drop-while #{::fail}
                                   (repeatedly times
                                               #(try
                                                 {::sucess (thunk)}
                                                 (catch Exception _ ::fail)))))]
    (::sucess attemps)))

(defmacro try-times-wait-millis
  [times wait-millis & thunk]
  `(try-times-wait-millis* ~times (fn [] ~@thunk)))


(defn read-number-with-question [question]
  (try-times-wait-millis 3 (do (println question) (bigint (read-line)))))

(let [currency (read-number-with-question "What is the number?")]
  (prn currency))


