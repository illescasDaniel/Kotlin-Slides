operator fun String.times(n: Int): String {
	return (0 until n).joinToString(separator = "") { this }
}

operator fun String?.not(): Boolean {
	return this == null || this.isEmpty()
}

fun main(args: Array<String>) {
	println("Hello" * 3) // HelloHelloHello
	val name = " ".trim()
	if (!name) {
		/* ... */
	}
}