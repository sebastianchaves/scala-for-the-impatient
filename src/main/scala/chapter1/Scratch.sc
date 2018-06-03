import java.text.MessageFormat

import scala.math._
import scala.util.Random
import scala.math.BigInt._

"Hola".intersect("chau")

1.to(10)

99.toChar

pow(2, 2)

BigInt.probablePrime(100, Random)

val stringLoco = "soyunstringloco"

stringLoco.apply(0)

"asd".count(_.isUpper)

"Harry".patch(1, "ung", 2)

val squareOfThree = 3

Math.sqrt(3.0)

"crazy" * 3

10 max 2

val dos = 2

dos.pow(1024)

val randomString = probablePrime(100, Random).toString(36)

randomString.charAt(0)
randomString.last
randomString.take(50)
randomString.drop(2)
randomString.takeRight(50)
randomString.dropRight(2)

def abs(x: Int): Int = if (x > 0) x else -x

List(1, 2, 3).map(_ + 1)

for {
  c <- "Hello"
  i <- 0 to 1
} yield (c + i).toChar

for {
  i <- List(1, 2, 3)
} yield i % 3

1 % 3

def factorial(x: Double): Double = {

  def loop(acc: Double, num: Double): Double =
    if (num == 0) acc
    else loop(acc * num, num - 1)

  loop(1, x)

}

def sum(params: Int*) = {
  params.sum
}

def recursiveSum(params: Int*): Int = {

  if(params.head == 0) 0
  else params.head + recursiveSum(params.tail: _*)

}

def safeSqrt(x: Double) =
  if (x >= 0) sqrt(x)
  else throw new IllegalArgumentException("x should not be negative")

safeSqrt(-1)




