(ns clojure-sample.lsp.call-hierarchy.c
  (:require [clojure-sample.lsp.call-hierarchy.d :as d]))

(defn ^:deprecated c-fun-1 []
  (d/d-fun))

(defn c-fun-2 []
  (d/d-fun))
