(fn tailorder [x y]
  (if (or (nil? (first x)) (nil? (first y)))
    nil
    (conj (tailorder (rest x) (rest y)) (first y) (first x))
  ))
