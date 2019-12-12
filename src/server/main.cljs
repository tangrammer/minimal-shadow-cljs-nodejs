(ns server.main
  (:require [clojure.set :as set]
            [clojure.string :as str]))

(def value-a 1)

(defonce value-b 2)

(defn reload! []
  (println "Code updated.")
  (println "Trying values:" value-a value-b))

(defn main! []
  (println "App loaded!"))

(defn example [o]
  (let [data (js->clj o :keywordize-keys true)]
    (println data)
    (clj->js data)))


(defn generate-exports []
  #js {:example example})
