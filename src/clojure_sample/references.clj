(ns clojure-sample.references
  (:require [schema.core :as s]))

(defn- baz
  [a b]
  (let [c a
        d b]
    (+ c d)))

(defn foo
  [a b]
  (+ a b))

(def app)

(s/defn ^:private another-private-function
  [a b]
  (another-private-function a b))

(s/defn another-function
  [a b]
  (another-private-function a b))

(defn start-sample
  []
  (foo 1 2)
  (foo 2 3)
  (baz 3 4)
  app)
