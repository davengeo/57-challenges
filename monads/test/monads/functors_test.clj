(ns monads.functors-test
	(:require [clojure.test :refer :all]
						[monads.functors :refer :all])
	(:use midje.sweet)
	(:import (monads.functors List)))

(deftest first-test
	(testing "first test"
		(is (= '(2 4 6) (:wrapped (fmap my-list-functor #(* 2 %)))))))


