val number = 100
	
when (number) {
	in 0..50 -> println("...")
	!in 80..200 -> println("...")
	in 100..200 -> println("yes")
	else -> {
		println("nope")
	}
}