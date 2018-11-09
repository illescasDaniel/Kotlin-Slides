val danielAndJohn = listOf(
	Person(name = "Daniel", age = 22),
	Person(name = "John", age = 30)
)
val people = People(danielAndJohn) // people = ... NOT allowed
println(people.list[0].name)