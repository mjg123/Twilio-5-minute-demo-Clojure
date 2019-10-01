(defproject clojure-5md "0.1.0-SNAPSHOT"
          :description "5 Minute Demo in Clojure"
          :min-lein-version "2.0.0"
          :dependencies [[org.clojure/clojure "1.10.0"]
                         [compojure "1.6.1"]
                         [ring/ring-defaults "0.3.2"]

                         [com.twilio.sdk/twilio "7.39.0"]
                         [hiccup "1.0.5"]]
  
          :plugins [[lein-ring "0.12.5"]]
          :ring {:handler clojure-5md.app/my-app}
          :profiles
          {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                [ring/ring-mock "0.3.2"]]}})
