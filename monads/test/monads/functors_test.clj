(ns monads.functors-test
	(:require [clojure.test :refer :all]
						[monads.functors :refer :all])
	(:use midje.sweet)
	(:import (monads.functors List)))

;http://www.leonardoborges.com/writings/2012/12/02/monads-in-small-bites-part-ii-applicative-functors/

(deftest first-test
	(testing "first test"
		(is (= '(2 4 6) (:wrapped (fmap my-list-functor #(* 2 %)))))))

(deftest comp-test
	(testing "composing functions over functors"
		(is (= '(12 14 16) (:wrapped (fmap my-list-functor (comp f g)))))))


(deftest comp-inv-test
	(testing "composing functions over functors"
		(is (= '(22 24 26) (:wrapped (fmap my-list-functor (comp g f)))))))


(deftest applicative-test
	(testing "Aplicative functions"
		(is (= '(2 4 6 11 12 13) (:wrapped (<*> fs xs))))))

(deftest applicative-property
	(testing "All applicative functions should respect this"
		(is (= (<*> u (<*> v w))
					 (-> (pure List (fn [x] (partial comp x)))
							 (<*> u)
							 (<*> v)
							 (<*> w))))))

(deftest applicative-property-concrete
	(is (= '() (<*> u (<*> v w)))))