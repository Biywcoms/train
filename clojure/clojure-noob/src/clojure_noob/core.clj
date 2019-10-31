(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo choo!"))

(+ 1 (* 2) 3 4)


(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's "))

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)
(nil? nil)

(if "bears eat beets"
  "bears beets Battlestar")

(if nil
  "This won't"
  "nil is falsey")

(= 1 1)
(= nil nil)
(= 1 3)
(or false nil nil :why_cant)
(or (= 0 1) (= "yes" "no"))

(and :free_wifi :hot_coffee)
(and :feelin_super_cool nil false)

(def failed-protagonist-names
  ["Larry Potter" "Doreen the Exlorer" "The Incredible Bulk"])

(def severity :mild)
(def error-message "OH GOD! IT'S A DISASTER! WE'ER ")
(if (= severity :mild)
  (def error-message (str error-message "MILDLY INCONVENIENCED!"))
  (def error-message (str error-message "DOOOOOOOOOOMED!")))

(defn error-mesage
  [severity]
  (str "OH GOD! IT'S"
       (if (= severity :mild)
         "MILDLY INCONvenienced!"
         "Doooooooooomed!")))
1/5
(def name "Chewbacca")
(str "\"Uggllglglglglglglglglll\" - " name)

(defn illustrative-function
  []
  (+ 1 304)
  30
  "joe")

(illustrative-function)

(defn number-comment
  [x]
  (if (> x 6)
    "Oh my gosh!"))

(number-comment 5)
(number-comment 7)

(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3))8)


(#(str %& "ddd" ) 8 2 3)

(#(identity %&) 1 "blarg" :yip)

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)


{:first-name "Charlie"
 :last-name "McFishwich"}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :lst "Jingleheimerschmidt"}}

(hash-map :a 1 :b 2)
(get {:a 0 :b 1} :b)
(get {:a 0 :b {:c "ho hum"}} :b)
(get {:a 0 :b 1 } :c )

(get-in {:a 0 :b {:c "ho hum"}} [:b :c ])
(:name {:name "The Human Coffeepot"} )

:a
:34
:rumplestiltsken
:_?

(:d {:a 1 :b 2 :c 3} "No ....")

(rest [3 2 1])

(vector "creey" "full" "moon")
(conj [1 2 3] 4)

'(1 2 3 4)

(nth '(:a :b :c) 0)

(list 1 "two" {3 4})
(conj '(1 2 3) 4)

#{"kurt vonnegut" 20 :icicle}
(hash-set 1 1 3 3)
(conj #{:a :b} :b)

(contains? #{:a :b nil} nil)
(conj #{:a :b} nil)

(:1 #{2 :a} "abc")

(+ 1 2 3 4)
(* 1 2 3 4)

((or nil -)  1 2 3)

((and (= 1 1) +) 1 2 3)

(inc 1.1)

(map inc [0 1 2 3])

(defn multi-arity
  ([x y z]
   (+ x y z))
  ([x y]
   (+ x y))
  ([x]
   (+ x)))


(defn x-chop
  ([name chop-type]
   (str "I " chop-type " cho " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "1111111111")
(x-chop "2222" "1111")

(defn weird-arity
  ([]
   "skdklsklfklsjlfjlkaslkdfj")
  ([number]
   (inc number)))
(weird-arity 1)

(defn codger-com
  [whipp]
  (str "Get of my lawn, " whipp))

(defn codger
  [& whipps]
  (map codger-com whipps))

(codger "Billy\n" "Anne-Marie" "The Incredible Bulk")

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn my-first
  [[[first-thing]]]
  first-thing)

(my-first [["over" "333"] "bike" "war-axe"])

(defn announce
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: "lat))
  (println (str "Treasure lng: " lng)))

(announce {:lat 28.22 :lng 81.33})

(defn announce2
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce2 {:lat 28.22 :lng 81.33})

(defn steer-ship!
  [x]
  (println x))

(defn receive-t
  [{:keys [lat lng] :as treasure-l}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))

  (steer-ship! treasure-l))

(receive-t {:lat 28.22 :lng 81.33})

(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-upper-arm" :size 3}
                             {:name "left-shoulder" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(symmetrize-body-parts asym-hobbit-body-parts)

(let [x 3] 
  x)

(def x 0)
(let [x 2] x)
(println x)

(let [[part & remaining] remaining-asym-parts]
  (recur remaining
         (into final-body-parts
               (set [part (matching-part part)]))))

(into final-body-parts
      (set [part (matching-part part)]))

(into [] (set [:a :a]))

(loop [iteration 0]
  (println (str "Iteration " iteration))
  (if (> iteration 3)
    (println "Goodbye!")
    (recur (inc iteration))))

(defn recursive-printer
  ([]
   (recursive-printer 0))
  ([iteration]
   (println iteration)
   (if (> iteration 3)
     (println "Goodbye!")
     (recursive-printer (inc iteration)))))

(recursive-printer)

(reduce + 15 [1 2 3 4])

(defn my-reduce
  ([f initial coll]
   (loop [result initial
          remaining coll]
     (if (empty? remaining)
       result
       (recur (f result (first remaining)) (rest remaining)))))
  ([f [head & tail]]
   (my-reduce f head tail)))

(defn better-symmetrize-body-parts
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symmetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))

(hit asym-hobbit-body-parts)


(str "str")
(vector 1 2 3)
'(:a :b :c)
(hash-map  :a 1 :b 2 :c 3 :d 4) 
(map inc '(1 2 3 4 4 5 3))
(hash-set 1 2 3 4 4 5 3)
(set '(1 2 3 4 4 5 3))

(reduce +  (range 1 101))

(defn dec-maker
  [x]
  #(- % x))
(def dec9 (dec-maker 9))
(dec9 10)


(defn mapset
  [x lst]
  (set (map x lst)))
(mapset inc [1 1 2 2])

(seq #{1  2  4 3})

(defn titleize
  [topic]
  (str topic " for the Brave and True"))

(map titleize ["Hamsters" "Ragnarok"])

(map titleize {:uncomfortable-thing "Winking"})

(map #(titleize (second %)) {:uncomfortable-thing "Winking"})

(seq '(1 2 3))

(seq [1 2 3])

(seq #{1 2 3})

(into {} (seq {:name "Bill Compton" :occupation "Dead mopey guy"}))

(map str ["a" "b" "c"] ["A" "B" "C" "D"])

(list (str "a" "A") (str "b" "B") (str "c" "C"))

(def human-consumption   [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.2 0.3 1.1])
(defn unify-diet-data
  [human critter]
  {:human human
   :critter critter})

(map unify-diet-data human-consumption critter-consumption)

(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))


(def identities
  [{:alias "batman" :real "bruce wayne"}
   {:alias "spider-man" :real "peter parker"}
   {:alias "santa" :real2 "your mon"}
   {:alias "easter bunny" :real "your dad"}])

(reduce (fn [new-map [key val]]
          (assoc new-map key (inc val)))
        {}
        {:max 30 :min 10})
        
(assoc  (assoc {} :max (inc 30))
        :min (inc 10))

(reduce (fn [opt new-seq]
          (opt new-seq))
        inc
        (1 2 3))

(take 3 [1 2 3 4 5 6 7 8 9 10])
(drop 3 [1 2, 3 4, 5 6, 7 8, 9 10])

(def food-journal
  [{:month 1 :day 1 :human 5.3 :critter 2.3}
   {:month 1 :day 2 :human 5.1 :critter 2.0}
   {:month 2 :day 1 :human 4.9 :critter 2.1}
   {:month 2 :day 2 :human 5.0 :critter 2.5}
   {:month 3 :day 1 :human 4.2 :critter 3.3}
   {:month 3 :day 2 :human 4.0 :critter 3.8}
   {:month 4 :day 1 :human 3.7 :critter 3.9}
   {:month 4 :day 2 :human 3.7 :critter 3.6}])

(take-while #(< (:month %) 3) food-journal)

(drop-while #(< (:month %) 4) food-journal)

(filter #(< (:human %) 5) food-journal)

(filter #(< (:month %) 3) food-journal)

(some #(> (:critter %) 5) food-journal)
(some #(> (:critter %) 3) food-journal)

(some #(and (> (:critter %) 3) %) food-journal)

(sort [1 3 2])
(sort #{1 4 2})
(sort '("1" "10" "2"))
(sort-by count ["aaa" "c" "bb"])

(concat [1 2] [1 4])
(concat '(1 2) '(1 4))
(conj [1 2] [1 4])
(conj '(1 2) '(1 4))
