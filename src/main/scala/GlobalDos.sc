val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val evens = for {
  x <- list if x % 2 == 0
} yield x
