(ns clojure-sample.lsp.signature-help.foo)

(defn other-func
  ([a] 1)
  ([a & more] 1))





(defn some-func [a b]
  (let [c 1
        d 2]
    (with-out-str
      (+ 1 3 3 4 6)
      (other-func 1 2))))
