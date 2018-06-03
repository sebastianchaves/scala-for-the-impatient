import scala.math.pow

// 1
def signum(n: Int) = if (n == 0) n else if (n > 0) 1 else -1

// 2 - Type Unit and value = ()
{}

// 3
var x = ()
var y: Int = 1
x = y = 1

// 4 - for (int i = 10; i >= 0; i--) System.out.println(i);
for (i <- (0 to 10).reverse) println(i)

// 5
def countdown(n: Int) = for (i <- (0 to n).reverse) println(i)
countdown(4)

// 6
def unicodeProductLoop(s: String) = {
  var acum: Long = 1
  for (i <- s) acum *= i.toLong
  acum
}
unicodeProductLoop("Hello")

// 7
def unicodeProduct(s: String) = s.map(_.toLong).product
unicodeProduct("Hello")

// 8
def product(s: String) = s.map(_.toLong).product

// 9
def recursiveProduct(s: String) = {

  def loop(head: Char, tail: String, acum: Long): Long =
    if (tail.isEmpty) acum * head.toLong
    else loop(tail.head, tail.tail, acum * head.toLong)

  loop(s.head, s.tail, 1)

}
recursiveProduct("Hello")

// 10
def powerade(x: Double, n: Int) = {

  if (n % 2 == 0) pow(pow(x, n / 2), 2)
  else if (n % 2 == 1 && n > 0) x * pow(x, n - 1)
  else if (n == 0) 1
  else if (n < 0) 1 / pow(x, -n)

}

