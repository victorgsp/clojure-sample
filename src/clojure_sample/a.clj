(ns clojure-sample.a
  #_(:require [rewrite-clj.zip :as z]
            [rewrite-clj.parser.core :as rpc]))

(println "asd")


(map identity [])


#_(binding [rpc/*parse-anyway* true]
  (z/of-string "(def a 123) asd/ (def b 345)"))
