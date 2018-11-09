val square = Square(sidesLength = 90)
println(square.sides)

val rectangle = square as Rectangle
println(rectangle.horizontalLength)

println("First side: ${square.sidesAndLength[1]}")
println(square.sidesAndLength) // {1=90, 2=90, 3=90, 4=90}