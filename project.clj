(require '[clojure.edn :as edn])

(def +deps+ (-> "deps.edn" slurp edn/read-string))

(defn deps->vec [deps]
  (keep (fn [[dep {:keys [:mvn/version exclusions]}]]
          (when version
            (cond-> [dep version]
              exclusions (conj :exclusions exclusions))))
        deps))

(def dependencies
  (deps->vec (:deps +deps+)))


(defproject clojure-sample "0.1.0-SNAPSHOT"
  :dependencies ~dependencies
  :description "Clojure sample"
  :url "http://github/com/ericdallo/clojure-sample"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main ^:skip-aot clojure-sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
