(ns clojure-sample.protocols
  (:require [bla :as bla]))

(defrecord Hero [name lifes]
  (move [this direction]
    (str "Moving player " this " to " direction)))

(defn start-sample []
  (let [hero (->Hero "Greg" 3)]
    (prn (move hero :right))

    #_(prn (move enemy :left))))
