(ns clojure-sample.core
  (:gen-class)
  (:require [clojure-sample.protocols :as protocols]
            [clojure-sample.references :as references]
            [clojure-sample.a :as a]))

(defn -main
  [& _args]
  (protocols/start-sample)
  (references/start-sample)
  (a/foq))
