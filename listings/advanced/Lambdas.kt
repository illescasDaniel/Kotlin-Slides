fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
	return operation(a, b)
}

val result = calculate(10, 20) { a, b -> a * b }