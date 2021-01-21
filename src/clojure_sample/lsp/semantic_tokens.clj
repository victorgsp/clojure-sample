(ns clojure-sample.lsp.semantic-tokens
  (:require
            [clojure-sample.c :refer [foq] :as c]))

(def foo "123")

(defn bar []
  foo
  foq)

(defmacro some-macro [& body]
  ~body)

;; macro - macro
(some-macro
  ;; refered - function
  foq
  ;; declared function - function
  bar
  ;; declared variable - function
  foo
  ;; alias-reference - type/function
  c/abcd
  ;; alias-reference - type/function
  (c/cdeg))

;; (deftest test-1
;;   (testing "some test"
;;     (is (= 2 2)))
;;   (testing "another test"
;;     (is (= 2 2)))
;;   (testing "other test"
;;     (is (= 2 2))))

;; (deftest test-2
;;   (testing "some test"
;;     (is (= 2 2)))
;;   (testing "another test"
;;     (is (= 2 2)))
;;   (testg "other test"
;;     (is (= 2 2))))

;; (deftest test-3
;;   (testing "some test"
;;     (is (= 2 2)))
;;   (testing "another test"
;;     (is (= 2 2)))
;;   (testing "other test"
;;     (is (= 2 2))))

;; (deftest test-4
;;   (testing "some test"
;;     (is (= 2 2)))
;;   (testing "another test"
;;     (is (= 2 2)))
;;   (testing "other test"
;;     (is (= 2 2))))
