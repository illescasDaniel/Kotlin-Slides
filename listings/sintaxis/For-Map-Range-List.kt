val names = listOf("Daniel", "John", "Jack")
for (name in names) {
	println(name)
}

val nameAgeMap = mapOf("Daniel" to 22, "Michael" to 44)
println(nameAgeMap) // {Daniel=22, Michael=44}

for (i in 0 until 100) { /* ... */ }
for (i in 0..100) { /* ... */ }
for (i in 1..15 step 2) { /* ... */ }
for (i in 10 downTo 0) { /* ... */ }

val (name, age) = Person(name = "Daniel", age = 22)
