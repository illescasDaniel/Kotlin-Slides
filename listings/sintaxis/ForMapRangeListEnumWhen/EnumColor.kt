enum class Color(val value: String) {
	RED("FF0000"), GREEN("00FF00"), BLUE("0000FF")
}

fun main(args: Array<String>) {
	
	val myColor = Color.RED
	
	when (myColor) {
		Color.RED -> println(Color.RED.value)
		Color.GREEN, Color.BLUE -> println("Green or blue")
	}
}
