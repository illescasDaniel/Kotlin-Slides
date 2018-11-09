import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun doingSomethingHeavy(): Int {
	delay(1000L)
	return 42
}
suspend fun doingSomethingHeavy2(): Int { /* */ }

fun main() = runBlocking {
	val time = measureTimeMillis {
		val result1 = async { doingSomethingHeavy() }
		val result2 = async { doingSomethingHeavy2() }
		println("Results: ${result1.await() + result2.await()}") // 462
	}
	println("Completed in: ${time.div(1000)}s") // 1s
}