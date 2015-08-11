(ns retirement-calc
  (:require
    [clojure.instant :as instant])
  (:import (java.util Calendar)))
(println "what is your current age?")
(let [my-age (read-line)]
  (prn (str (.. Calendar (getInstance) (get Calendar/YEAR)) my-age))

  )