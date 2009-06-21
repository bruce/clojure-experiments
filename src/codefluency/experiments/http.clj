(ns codefluency.experiments.http
  (:require [clojure.http.client])
  (:refer-clojure))
  
(defn unshorten-url
  "Follow redirects to originating URL"
  [u]
  (let [resp (clojure.http.client/request u "HEAD")]
    (resp :url)))