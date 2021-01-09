(ns clojure-sample.async
  (:require [clojure.core.async :as async :refer [<!! >! >!! <! go chan]]))

(defn fast-crawl []
  (Thread/sleep 4000)
  (println "a")
  {:a 1})

(defn slow-crawl []
  (Thread/sleep 4000)
  (println "b")
  {:b 2})

(defn huge-crawl []
  (Thread/sleep 4000)
  (println "c")
  {:c 3})

(defn normal-crawl []
  (let [fast (fast-crawl)
        slow (slow-crawl)
        huge (huge-crawl)]
    (clojure.core/merge fast slow huge)))

(defn async-crawl-1 []
  (->> [fast-crawl slow-crawl huge-crawl]
       (map (fn [f]
              (async/thread (f))))
       async/merge
       (async/reduce merge {})
       async/<!!))

(defn async-crawl-2 []
  (let [fast (go (fast-crawl))
        slow (go (slow-crawl))
        huge (go (huge-crawl))]
    (println "got " (<!! huge))
    (merge (<!! fast)
           (<!! slow)
           (<!! huge))))

;; (normal-crawl)


;; (time (async-crawl))
(time (async-crawl-2))
