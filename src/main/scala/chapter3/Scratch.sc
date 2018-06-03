import scala.collection.mutable.ArrayBuffer
import scala.util.Random

val nums = new Array[Int](10)
val a = new Array[String](10)
val s = Array("Hello", "World")

val intArrayBuffer = ArrayBuffer[Int](10, 11, 12, 13)

intArrayBuffer += 1
intArrayBuffer += (1, 2, 3, 4)
intArrayBuffer ++= Array(5, 6, 7)
intArrayBuffer.trimEnd(1)

val b = ArrayBuffer[Int](1, 1, 2)

def printer(s: String) = for (i <- s) println(i + ": ")
printer("asd")

val ints = Array(1, 2, 3, 4, 5, 6)
val result = for (elem <- ints if elem % 2 == 0) yield 2 * elem
ArrayBuffer(2) ++= result.toBuffer

def firstNegative(array: Array[Int]): Int = {

  def loop(head: Int, tail: Array[Int]): Int =
    if (head < 0) head
    else if (tail.isEmpty) 0
    else loop(tail.head, tail.tail)

  loop(array.head, array.tail)

}

// 1
def randomIntsArray(n: Int): Array[Int] = {
  val intArrayBuffer = ArrayBuffer[Int]()
  for (_ <- 0 until n) intArrayBuffer += Random.nextInt
  intArrayBuffer.toArray
}
randomIntsArray(5)

// 2
def adjacentSwap(a: Array[Int]): Array[Int] = {

  val arrayBuffer = ArrayBuffer[Int]()

  for(i <- 0 to (a.length / 2)) arrayBuffer += a(i)

  arrayBuffer.toArray

}



