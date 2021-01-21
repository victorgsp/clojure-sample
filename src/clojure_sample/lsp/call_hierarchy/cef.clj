(ns clojure-sample.lsp.call-hierarchy.cef
  (:require [clojure-sample.lsp.call-hierarchy.defe :as d]))

(defn ^:deprecated c-fun-1 []
  (d/d-fun))

(defn c-fun-2 []
  (d/d-fun))
