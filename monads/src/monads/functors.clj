(ns monads.functors)

(defprotocol Functor
	(fmap [functor f] "Maps fn over the functor f"))

(defrecord List [wrapped]
	Functor
	(fmap [functor f]
		(List. (map f (:wrapped functor)))))

(def my-list-functor (List. [1 2 3]))

(fmap my-list-functor #(* 2 %))

(def f #(+ 10 %))
(def g #(* 2 %))

(fmap my-list-functor (comp f g))

(defmulti pure (fn [f _] f))

(defmethod pure List [_ v]
	"Wraps value v in a list"
	(List. [v]))

(defmulti <*> (fn [fs _] (class fs)))

(defmethod <*> List [fs xs]
	"Unwraps the functions in fs,
	applies them to the Functors in xs,
	 wrapping the result at the end"
	(List. (for [f (:wrapped fs)
							 x (:wrapped xs)]
					 (f x))))

(defmethod <*> List [fs xs]
	"Unwraps the functions in fs,
	applies them to the Functors in xs,
	wrapping the result at the end"
	(List. (for [f (:wrapped fs)
							 x (:wrapped xs)]
					 (f x))))

(def fs (List. [#(* 2 %) #(+ 10 %)]))

(def xs (List. [1 2 3]))

(def u (List. [#(* 2 %)]))
(def v (List. [#(+ 10 %)]))
(def w (List. [1 2 3]))


