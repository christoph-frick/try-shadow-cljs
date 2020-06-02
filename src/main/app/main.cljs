(ns app.main
  (:require [rum.core :as rum]
            ["antd/es/button" :default Button]))

(rum/defc component []
  (rum/adapt-class Button {:onClick (fn [e] (println "Clicked"))} "Click me"))

(defn root []
  (rum/mount (component) (js/document.getElementById "app")))

(defn main! []
  (println "[main]: loading")
  (root))

(defn reload! []
  (println "[main]: reloading")
  (root))
