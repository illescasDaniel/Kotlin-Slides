var abc: String = "abc"
abc = null // compilation error

val daniel = Person(name = "Daniel", age = 22)
val john = Person(name = "John", age = 44)
	
val idPerson = mapOf(0 to daniel, 10 to john)
println(idPerson[0]?.name ?: "unknown") // Elvis operator
	
// optional value
var name: Person? = idPerson[0]
name = null // oK