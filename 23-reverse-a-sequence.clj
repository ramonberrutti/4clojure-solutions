;; (= ((fn rev [x] (if (empty? x) nil (conj (rev (butlast x)) (last x)))) [1 2 3 4 5] ) [5 4 3 2 1])
(fn rev [x] (if (empty? x) nil (conj (rev (butlast x)) (last x))))
