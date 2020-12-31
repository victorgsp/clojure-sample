(ns clojure-sample.lsp.call-hierarchy.d)

(defn ^:private d-private-fun-2 []
  1)

(defn ^:private d-private-fun-1 []
  (d-private-fun-2))

(defn d-fun []
  (d-private-fun-1))
