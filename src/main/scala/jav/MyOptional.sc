trait MyOptional[T] {

  def get: T

  def isEmpty: Boolean

  def isDefined: Boolean = !isEmpty

  def getOrElse(orElse: T): T = if (isEmpty) orElse else get

  def exists(condition: T => Boolean): Boolean = !isEmpty && condition(get)

  def map[R](function: T => R): MyOptional[R] = if (isEmpty) new MyNone[R] else new MySome(function(get))

  def filter(f: T => Boolean): MyOptional[T] = if (exists(f)) new MySome(get) else new MyNone[T]

  def flatMap[K](f: T => MyOptional[K]) = if (isEmpty) new MyNone[K] else f(get)

  def contains(elem: T): Boolean = !isEmpty && exists(_ == elem)

  def forall(condition: T => Boolean): Boolean = if(isEmpty) false else condition(get)

  def foreach[U](function: T => U) { if (isDefined) function(get) }

  def fold[B](sem: => B)(f: T => B): B = if (isEmpty) sem else f(get)

}

object MyOptional {
  def apply[T](x: T): MyOptional[T] = if (x == null) new MyNone[T] else new MySome(x)
}

class MySome[T](value: T) extends MyOptional[T] {

  override def get: T = value

  override def isEmpty = false

}

class MyNone[T] extends MyOptional[T] {

  override def get = throw new RuntimeException("No tengo nada!")

  override def isEmpty = true

}

val figo = new MyNone[Int]

figo.filter({ x => x > 3 })
