(ns clojure-sample.references
  (:require [compojure.core :refer [ANY defroutes GET]]
            [schema.core :as s]))


(defn- baz
  [a b]
  (let [c a
        d b]
    (+ c d)))

(defn foo
  [a b]
  (+ a b))

(defroutes app-routes
  (GET "/" request
       "bla"))

(def app
  app-routes)

(s/defn ^:private another-private-function
  [a b]
  (another-private-function a b))

(let []
  (do
    {1}))

(s/defn another-function
  [a b]
  (another-private-function a b))

(defn start-sample
  []
  (foo 1 2)
  (foo 2 3)
  (baz 3 4)
  app)
