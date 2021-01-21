(ns clojure-sample.lsp.call-hierarchy.b
  (:require [clojure-sample.lsp.call-hierarchy.cef :as c]))

(defn b-fun-1 []
  (c/c-fun-1)
  (c/c-fun-2))
