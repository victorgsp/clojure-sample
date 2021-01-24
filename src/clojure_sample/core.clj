(ns clojure-sample.core
  (:gen-class)
  (:require
   [cljfmt.core :as cljfmt]
   [clojure-sample.sqlite :as sqlite]
   [clojure.core.async :as async]
   [digest :as digest]
   [clojure.tools.logging :as log]
   [rewrite-clj.zip :as z])
  (:import
   org.eclipse.lsp4j.Position))

(defn -main
  [& _args]
  (println "running !")
  (async/go
    (println "async worked!"))
  (println "rewrite-clj worked!" (z/string (z/of-string "(+ 1 2)")))
  (println "digest worked:" (digest/md5 "clojure"))
  (println "cljfmt worked:" (cljfmt/reformat-string "(+ 1   2)" {}))
  (println "lsp4j:" (.getLine (Position. 1 2)))
  (println "sqlite worked:" (sqlite/insert-and-select))
  (log/info "logger worked")
  (Thread/sleep 1000)
  (println "finished!"))
