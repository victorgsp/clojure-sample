(ns clojure-sample.core
  (:gen-class)
  (:require [cljfmt.core :as cljfmt]
            [clojure-sample.sqlite :as sqlite]
            [clojure.core.async :as async]
            [digest :as digest]))

(defn -main
  [& _args]
  (println "running !")
  (async/go
    (println "async worked!"))
  (println "digest worked:" (digest/md5 "clojure"))
  (println "cljfmt worked:" (cljfmt/reformat-string
                      "(+ 1   2)"
                      {}))
  (println "sqlite worked:" (sqlite/insert-and-select))
  (Thread/sleep 1000)
  (println "finished!"))
