abstract class User

case class KnownUser(val name: String) extends User

case class AnonymousUser() extends User

object Test {
	val users = List(KnownUser("Mark"), AnonymousUser(), KnownUser("Phil"))

	def register(user: User): Unit = user match {
		case KnownUser(name) => println("User " + name + " registered")
		case AnonymousUser() => println("Anonymous user can't be registered")
	}

	def main(args: Array[String]) =
		users.foreach( register )
}