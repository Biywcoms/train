(ns fwpd.core
  (:gen-class))
;;(require '[clojure.java.io :as io])

(def filename "resources/suspects.csv")

(slurp filename)

(def vamp-keys [:name :glitter-index])

(defn str->int
[str]
(Integer. str))

(def conversions {:name identity
                  :glitter-index str->int})

(defn convert
[vamp-key value]
((get conversions vamp-key) value))

(convert :glitter-index "3")

(defn parse
  "convert a CSV into rows of columns"
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(parse (slurp filename))          

(defn mapify
  "Return a seq of maps like {:name \"Edward Cullen\" :glitter-index 10}"
  [rows]
  (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
                   (assoc row-map vamp-key (convert vamp-key value)))
                 {}
                 (map vector vamp-keys unmapped-row)))
       rows))

(first (mapify (parse (slurp filename))))

(defn glitter-filter
  [minimun-glitter records]
  (filter #(>= (:glitter-index %) minimun-glitter) records))

(glitter-filter 3 (mapify (parse (slurp filename))))


(defn to-string
  [map-data]
  (clojure.string/join map-data))


