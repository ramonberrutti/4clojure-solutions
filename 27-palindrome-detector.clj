(defn palindrome? [x]
    (if (< (count x) 2)
        true
        (if (= (first x) (last x))
            (palindrome? (drop-last (drop 1 x)))
            false
        )
    ))

(false? (palindrome? '(1 2 3 4 5)))
(true? (palindrome? "racecar"))
(true? (palindrome? [:foo :bar :foo]))
(true? (palindrome? '(1 1 3 3 1 1)))
(false? (palindrome? '(:a :b :c)))
