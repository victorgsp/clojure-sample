(ns clojure-sample.tutorial.start
  (:require [clojure-sample.tutorial.foo-feature :as foo]))











(defn -main
  [& _args]
  (foo/other-function 1))
