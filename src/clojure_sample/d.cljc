(ns clojure-sample.d)

(defn blow
  []
  (let [a 1]
    (+ 2 a)
    1))

(defmacro blowert [a b]
  `a)
