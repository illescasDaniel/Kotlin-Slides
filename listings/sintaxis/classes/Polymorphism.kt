open class Shape

open class Polygon(val sidesAndLength: Map<Int, Int>): Shape() {
	val sides = this.sidesAndLength.size
}

open class Rectangle(
	val horizontalLength: Int, 
	val verticalLength: Int
): Polygon(sidesAndLength = 
	(1..4).map { 
		it to if (it % 2 == 0) horizontalLength else verticalLength 
	}.toMap()
)

data class Square(val sidesLength: Int): 
	Rectangle(sidesLength, sidesLength)