(ns views.layout.application
  (:use [hiccup core page]))

(defn index-page []
  (xhtml
    [:head
      [:title "Hello World"]
      (include-css "/css/bootstrap.min.css")
      (include-css "/javascript/bootstrap.min.css")
      (include-css "/css/application.css")
      (include-js "/javascript/application.js")]
    [:body
      [:button {:class "btn btn-primary"} "submit"]
      [:h1 "Hello World"]]))
