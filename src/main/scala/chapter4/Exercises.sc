import java.util.Calendar._

import scala.collection.mutable

// 6
val weekdays = mutable.LinkedHashMap("Monday" -> MONDAY,
  "Saturday" -> SATURDAY,
  "Thursday" -> THURSDAY,
                   "Sunday" -> SUNDAY)

// 8
def minmax(values: Array[Int]) = (values.min, values.max)
minmax(Array(35, 9, 11, 44))

// 9
def lessEqualGreater(values: Array[Int], v: Int) =
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
lessEqualGreater(Array(1, 2, 3, 4, 6, 6, 6, 10, 66, 2), 6)

// 10
"hello".zip("hello").toMap.getOrElse('c', "Not found").toString
