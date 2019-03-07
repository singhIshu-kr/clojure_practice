(defn getlargestOfTwo [num1 num2]
  (if (> num1 num2)
    (do
      (prn "num1 is largest")
      num1
      )
    num2))

(getlargestOfTwo 8 7)


(into #{} {:a 1 :b 2})
(hash-map :a 2)
(seq? (seq [1 2 3]))

(lazy-seq)
(cycle)
(apply + [1 3 4 ])
-->  

(macroexpand)


Macro
partial
comp
lazy-seq
transduce
defmacro
