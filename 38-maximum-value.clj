(fn mymax ([x] x) ([x y] (if (> x y) x y)) ([x y & more] (reduce mymax (mymax x y) more)))
