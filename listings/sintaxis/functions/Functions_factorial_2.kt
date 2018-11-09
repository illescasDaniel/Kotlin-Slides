fun factorial(n: Long): Long =
	if (n <= 1) 1
	else n * factorial(n-1)