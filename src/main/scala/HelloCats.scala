package catscorner

import cats.Functor
import cats.implicits._

object HelloCats extends App {
  val maybeNumber: Option[Int] = Some(3)
  val incremented: Option[Int] = Functor[Option].map(maybeNumber)(_ + 1)

  println(s"Incremented value: $incremented")
}
