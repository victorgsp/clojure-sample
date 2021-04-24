(ns clojure-sample.lsp.definition.a)

;; (defmulti foo :bar)

;; (defmethod foo :test
;;   [{:keys [a b] :or {a 1 b 2}}]
;;   (let [q (* 10 (dec a))]
;;     (+ b q)))

(fn
  [{:keys [a] :or {a 1}}]
  a)

(b
  (a
    (foo)
    (bar)))
