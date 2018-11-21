(fn implode [y x]
  (if (empty? (rest x))
    x
    (conj (implode y (rest x)) y (first x))
  )
)
