var age = 22
age = 90 // OK, age variable & Int

val name: String

if (age == 22) {
	name = "Daniel"
} else {
	name = "  Name here  ".trim().toLowerCase()
}
// or
val name: String =
	if (age == 22) {
		"Daniel"
	} else {
		"  Name here 33  ".trim().toLowerCase()
	}