(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest pairs-of-values
   (let [args ["--server" "localhost"
               "--port" "8080"
               "--environment" "production"]]
      (is (= {:server "localhost"
              :port "8080"
              :environment "production"}
              (parse-args args)))))

