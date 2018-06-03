import scala.util.Random.nextInt

// 1
def randomInts = (0 until nextInt(1000)).toArray
randomInts

// 2
def swapper(ints: Array[Int]) = ints.take(2)