(ns clojure-sample.lsp.call-hierarchy.defe)

(defn ^:private d-private-func-2 []
  1)

(defn ^:private d-private-fun-1 []
  (d-private-func-2))

(defn d-fun []
  (d-private-fun-1))
