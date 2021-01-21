(ns clojure-sample.lsp.completion.foo
  (:require [schema.core :as s]))

(defmacro abcdefgh []
  1)

(def abcdefgh 45)

(def ^:deprecated foob 123)

(defn abcdefg [a b]
  (+ a b))

(s/defn foo :- s/String
  [some-number :- s/Int
   other-number :- s/Int]
  1)

(defn asd [d a]
  (+ 1 a d))

(defn bla [d e f]
  (let [a 1 b 2 c 3]
    (asd d a)))
