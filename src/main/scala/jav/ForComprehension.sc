// Ejemplo 1
val maybeFirstName: Option[String] = Some("Mark")
val maybeSurname: Option[String] = Some("Colado")

case class Person2(firstName: String, surname: String)

for {
  firstName <- maybeFirstName
  surname <- maybeSurname
} yield Person2(firstName, surname)

val opcional1 = Option(2)
val opcional2 = Option(3)

val result2 = for {
  op1 <- opcional1
  nada <- None
  op2 <- opcional2
} yield op1 + op2

// Ejemplo 2
class Person(val name: String, val age: Int, val info: Option[Info])

class Info(val cbu: Int, val dir: String)

val infoDeJuan = Option(new Info(1234151, "calle falsa 123"))

val juan = new Person("Juan", 45, infoDeJuan)

val personas = juan :: Nil

for {
  juan <- personas.find(x => x.name == "Juan")

  info <- juan.info

  dir = info.dir
} yield juan.name + "" + dir

// Ejemplo 3
val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // 1.to(10).toList
val evens = for { x <- list if x % 2 == 0 } yield x

// Ejemplo 4
for {
  n <- 1 to 5
  variable = n + 10
  _ = println(variable)
} yield variable