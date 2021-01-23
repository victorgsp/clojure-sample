(ns clojure-sample.sqlite
  (:require
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   ;; [next.jdbc :as jdbc]
   ;; [next.jdbc.result-set :as rs]
   ))

;; (defn make-spec [project-root]
;;   (let [lsp-db (io/file (str project-root) "" ".my-test.db")]
;;     {:dbtype "sqlite"
;;      :dbname (.getAbsolutePath lsp-db)}))

;; (defn insert []
;;   (let [db-spec (make-spec "some-project")]
;;     (io/make-parents (:dbname db-spec))
;;     (with-open [conn (jdbc/get-connection db-spec)]
;;       (jdbc/execute! conn ["drop table if exists project;"])
;;       (jdbc/execute! conn ["create table project (version text, root text unique, hash text, classpath text, analysis text);"])
;;       (jdbc/execute! conn ["insert or replace into project
;;                             (version, root, hash, classpath, analysis)
;;                             values (?,?,?,?,?);" "1" "some-project" "some-hash" "some-classpath" "a lot of analysis"]))))

;; (defn select []
;;   (try
;;     (with-open [conn (jdbc/get-connection (make-spec "some-project"))]
;;       (let [project-row
;;             (-> (jdbc/execute! conn
;;                                ["select root, hash, classpath, analysis from project where version = ?"
;;                                 "1"]
;;                                {:builder-fn rs/as-unqualified-lower-maps})
;;                 (nth 0))]
;;         {:analysis (edn/read-string (:analysis project-row))
;;          :classpath (edn/read-string (:classpath project-row))
;;          :project-hash (:hash project-row)}))
;;     (catch Throwable e
;;       (println "Could not load db" (.getMessage e)))))

;; (defn insert-and-select []
;;   (insert)
;;   #_(select))
