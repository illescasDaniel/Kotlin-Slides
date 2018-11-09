enum class Color(val rgb: Int) {
	RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
	val hexString = this.rgb.toHex()
}

fun Int.toHex(): String {
	return java.lang.Integer.toHexString(this)
}

fun String.toColor() = Color.valueOf(this.toUpperCase())

val Int.M: Long
	get() {
		return this.toLong() * 1_000_000
	}
val Int.k get() = this.toLong() * 1_000