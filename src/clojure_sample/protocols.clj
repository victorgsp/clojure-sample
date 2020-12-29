(ns clojure-sample.protocols)

(defn start-sample
  ([] start-sample nil)
  ([a]
   (do (println "")
       (map identity []))))

(defprotocol Baz
  (quux [this]))

(defmulti greeting
  (fn [x] (get x "language")))

(defmethod greeting "English" [params]
 "Hello!")

(defmethod greeting "French" bla [params]
 "Bonjour!")

