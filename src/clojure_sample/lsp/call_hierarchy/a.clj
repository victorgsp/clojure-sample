(ns clojure-sample.lsp.call-hierarchy.a
  (:require [clojure-sample.lsp.call-hierarchy.b :as b]))

(defn a-fun []
  (b/b-fun-1))
