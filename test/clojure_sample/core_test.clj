(ns clojure-sample.core-test
  (:require [clojure.test :refer :all]
            [clojure-sample.core :refer :all]
            [matcher-combinators.test :refer [match?]]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= {:a 2 :b 2}
          {:a 2 :b 2}))))

(deftest b-test
  (testing "FIXME, I fail."
    (is (match? {:a 1 :b 2}
          {:a 1 :b 2}))))

(deftest matcher-test
  (testing "testing matcher report"
    (is (match? {:foo {:bar {:baz 123
                             :qox 456}}}
          {:foo {:bar {:qox 789}}}))))
