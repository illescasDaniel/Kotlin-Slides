val sumOfLargeNamesLength = 
	listOf("Daniel", "John", "Juan!")
		.filter { it.length > 4 }
		.map { it.length }
		.reduce { accumulated, next -> accumulated + next}
		
println(sumOfLargeNamesLength) // 11
	
