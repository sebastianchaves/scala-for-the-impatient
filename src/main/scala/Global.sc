val f1:PartialFunction[String, Int] = {
  case "one" => 1
  case "two" => 2
}

f1.isDefinedAt("three")

f1

f1("two")

8 match {
  case 1 => "asd"
  case 2 => 2
  case 8 => true
}


def flip[T, R, N](function: (R, T) => N)(x: R, y: T) = function(y, x)

def suma(i: Int, d: Double): Double = i + d

flip(suma)(2, 2.0)

// flip

// factorial tail recursive

// Pasar a binario con tail recursive

def tailFactorial(x: Double): Double = {

  def loop(acc: Double, num: Double): Double =
    if (num == 0) acc
    else loop(acc * num, num - 1)

  loop(1, x)

}

