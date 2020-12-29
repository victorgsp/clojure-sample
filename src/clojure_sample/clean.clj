(ns clojure-sample.clean
  (:require [clojure.set :as bla]
            [clojure.set :as blow]))

(def ^:private bla 1)

(defn bar
  []
  blow/set?)

(def hello "hello")

(def abcde 1)
(def abcde 2)
(def abcde 3)
(def abcde 4)

(comment
  `bar)
