(ns clojure-sample.core

  (:gen-class)
  (:require [clojure-sample.protocols :as protocols]
            [clojure-sample.references :as references]))

(defn -main
  [& args]
  (protocols/start-sample)
  (references/start-sample))
