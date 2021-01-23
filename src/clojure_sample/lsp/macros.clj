(ns clojure-sample.lsp.macros
  (:require [schema.core :as s]
            ;; [common-graphql.lacinia.sweet :as gql]
            ;; [midje.sweet :refer :all]
            ))

(s/defschema SomeSchema {:a 1})

(s/defn foo :- s/Str
  [a :- SomeSchema
   b :- s/Int]
  (+ (:a a) b))

(defn bar []
  1)
