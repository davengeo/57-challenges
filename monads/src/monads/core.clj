(ns monads.core
	(:use [clojure.algo.monads]))


(defn clean-address [params]
	"Ensure (params :address) is present"
	(if (empty? (params :address))
		[nil "Please enter your address"]
		[params nil]))


(defn apply-or-error [f [val err]]
	(if (nil? err)
		(f val)
		[nil err]))
;
;(defmacro err->> [val & fns]
;  (let [fns (for [f fns] `(apply-or-error ~f))]
;    `(->> [~val nil]
;          ~@fns)))

(domonad identity-m
				 [a 1
					b (inc a)]
				 (* a b))
