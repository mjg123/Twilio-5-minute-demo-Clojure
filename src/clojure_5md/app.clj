(ns clojure-5md.app
  (:require [clojure-5md.handler :as handler]
            [compojure.core :refer [defroutes ANY]]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def my-app
  (-> handler/app-routes
      (wrap-defaults (assoc-in site-defaults [:security :anti-forgery] false))))
