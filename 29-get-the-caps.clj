(fn getcap [c]
    (apply str (filter (fn isUpperCase? [c]
        (and (>= (int c) (int \A)) (<= (int c) (int \Z)))) (char-array c))))
