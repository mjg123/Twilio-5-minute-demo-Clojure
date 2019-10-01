(ns clojure-5md.handler
  (:require [compojure.core :refer [defroutes GET POST]]
            [hiccup.core :refer [html]]
            [clojure-5md.secrets :refer [redact ACCOUNT_SID AUTH_TOKEN]]))


;; Phone number: 


(defroutes app-routes

  (GET "/" [From] (do
                    (println (redact From))
                    (html [:Response [:Message "Hello from Clojure Exchange"]])))

  (POST "/call" [] (html [:Response
                          [:Say "Thanks for your attention"]
                          [:Play "https://demo.twilio.com/docs/classic.mp3"]])))




