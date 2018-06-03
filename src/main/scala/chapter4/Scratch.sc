val scores = Map("Carlos" -> 1, "Roberto" -> 6, "Pepe" -> 8)

scores("Roberto")
scores.getOrElse("ASESDE", "No tiene score")

val newScores = scores + ("Carlos" -> 6, "Juanito" -> 4)
val newScoresAgain = scores - "Pepe"

for((key, value) <- scores) println(s"$key hizo $value puntos")

scores.keys
scores.values

val treeScores = scala.collection.immutable.SortedMap(
  "Alice" -> 10,
  "Fred" -> 7,
  "Bob" -> 3,
  "Cindy" -> 8)

val (first, second, _) = ("asd", "asd", 1)

"Hola".partition(_.isLower)

val keys = Array("Juan", "Carlos", "Pedro")
val values = Array(1, 2, 3)

val map = keys.zip(values).toMap

