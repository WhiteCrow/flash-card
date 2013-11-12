(ns config.routes
  (:use compojure.core
        views.layout.application
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (index-page))
  (route/resources "/", {:root "/vender"})
  (route/resources "/", {:root "/public"})
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
