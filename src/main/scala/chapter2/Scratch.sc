// 1
def signum(num: Int) = if (num > 0) 1 else if (num < 0) -1 else 0

// 2
// Its type Unit
val a = {}

// 3
// Unit type for x
var x = ()
var y: Int = 1
x = y = 1

// 4
def printer = (1 to 10).reverse.map(println)
printer

// 5
def countdown(n: Int) = (0 to n).map(println)
countdown(4)

// 6

// 7
def unicodeProductSimple(string: String) = string.map(_.toLong).product
unicodeProductSimple("Hello")

// 8
def productRecursive(string: String) = {

  val accum = 1

  string.drop(1).charAt(0).toLong * accum

}

// 9


// 10
def specialPow(n: Int, x: Int): Long = ???
