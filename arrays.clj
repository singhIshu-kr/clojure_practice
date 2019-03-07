(defn filter-odd-numbers [list] (filter odd? list))

(defn filter-even-numbers [list] (filter even? list))

(def odd-elements (partial filter odd?))

(defn sum-of-array [list] (reduce + list))

(defn reverse-of-array [list] (reverse list))

(def get-second-element (partial take-nth 2))

(def get-square (comp (partial reduce *) (partial repeat 2)))


(def drop-first-last (comp rest butlast))
(def remove-first-last-element-list (comp (partial take-while not-empty) (partial iterate drop-first-last)))
(def first-last-same? (comp (partial apply =) (juxt first last)))
(def palindrome? (comp (partial every? first-last-same?) remove-first-last-element-list))

(palindrome? [1 2 1])

(take-while (partial odd?) ((partial iterate inc) 3))

(def foo (comp (juxt inc dec)))

(defn fibo-series
  ([] (fibo-series 0 1))
  ([x y] (lazy-seq (cons x (fibo-series y (+ y x))))))

(defn get-range-till-nth 
  ([] (get-range-till-nth 1))
  ([x] (lazy-seq (cons x (get-range-till-nth (inc x))))))

(defn factorial [number] (reduce * (range 1 (inc number))))

(defn lazy-factorial 
  ([] (lazy-factorial 1))
  ([x] (lazy-seq (cons x (lazy-factorial (inc x))))))

(factorial 3)
(greatest-in-list [1 2 67 4 5] 2)
(take 5 (lazy-factorial))
(take 4 (fibo-series))
(fibonacci-number 1)
(every-second-element [1])
(get-second-element [1 2 3 4 5])
(odd-elements [1 2 34])
(filterEvenNumbers [1 3 2 4])
(filterOddNumbers [1 2 3 4])
(sumOfArray [1 3 4])
(reverseOfArray [1 2 3])
