(ns clojure-sample.tutorial.bar-feature
  (:require [clojure-sample.tutorial.foo-feature :as foo]))

(defn bar []
  (foo/sum 1 2))
