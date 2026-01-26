import kotlinx.coroutines.*

fun main() = runBlocking {

    val job: Job = launch {
        val output = getValue()
        println("Output: $output")
    }

    job.join()

    val direction = Direction.WEST
    when (direction) {
        Direction.NORTH -> println("Go North")
        Direction.SOUTH -> println("Go South")
        Direction.WEST -> println("Go West")
        Direction.EAST -> println("Go East")
    }

    try {
        val x = 10 / 0
    } catch (e: Exception) {
        println("Exception caught")
    }
}

// ===== SUSPEND =====
suspend fun getValue(): Double {
    delay(1000)
    return 10.5
}

// ===== ENUM =====
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
