(ns clojure-sample.issues.clj-kondo-unknown-var
  (:require [digest :as digest]))

(digest/md5 "foo")
