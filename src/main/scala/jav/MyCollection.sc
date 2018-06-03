case class MyCollection[A](elems: A*) {

  def isEmpty: Boolean = ???

  def contains(elem: A): Boolean = ???

  def exists(condition: A): Boolean = ???

  def filter(function: A => A): MyCollection[A] = ???

}

val myCollectionInts = MyCollection[Int](1, 2, 3)


List(1, 2, 3, 4, 5).fold(List())({
  (filteredList, elem) => if (elem > 2) filteredList :: elem
})