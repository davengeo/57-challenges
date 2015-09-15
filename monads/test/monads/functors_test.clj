(ns monads.functors-test
	(:require [clojure.test :refer :all]
						[monads.functors :refer :all])
	(:use midje.sweet)
	(:import (monads.functors List)))

(deftest first-test
	(testing "first test"
		(is (= '(2 4 6) (:wrapped (fmap my-list-functor #(* 2 %)))))))

(deftest comp-test
	(testing "composing functions over functors"
		(is (= '(12 14 16) (:wrapped (fmap my-list-functor (comp f g)))))))


(deftest comp-inv-test
	(testing "composing functions over functors"
		(is (= '(22 24 26) (:wrapped (fmap my-list-functor (comp g f)))))))
