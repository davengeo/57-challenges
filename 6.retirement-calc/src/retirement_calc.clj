(ns retirement-calc
  (:import (java.util Calendar)))

(defn read-int [question]
  (println question)
  (bigint (read-line)))

(def get-year
  (.. Calendar (getInstance) (get Calendar/YEAR)))

(let [my-age (read-int "What is your current age?")
      ret-age (read-int "At what age would you like to retire?")]
  (println "it is" (str get-year) ", but you want to wait until" (int (+ get-year (- ret-age my-age)))))