(ns clojure-sample.component-example
  (:require [com.stuartsierra.component :as component]
            [schema.core :as s]))

(s/defrecord CircuitBreaker []

             component/Lifecycle
             (start [this]
                    this)

             (stop [this]
                   this))

(defn new-component-test []
  (map->CircuitBreaker {}))
