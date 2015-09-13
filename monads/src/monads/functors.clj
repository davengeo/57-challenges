(ns monads.functors)

(defprotocol Functor
	(fmap [functor f] "Maps fn over the functor f"))

(defrecord List [wrapped]
	Functor
	(fmap [functor f]
		(List. (map f (:wrapped functor)))))

(def my-list-functor (List. [1 2 3]))
<