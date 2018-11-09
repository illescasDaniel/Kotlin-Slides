fun factorial(n: Long): Long {
	if (n <= 1) {
		return 1
	}
	return n * factorial(n-1)
}