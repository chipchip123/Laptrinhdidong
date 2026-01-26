fun main() {

    // Set
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    val setOfNumbers = numbers.toSet()
    println(setOfNumbers)

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 4, 5)
    println(set1.intersect(set2))
    println(set1.union(set2))

    // Map
    val peopleAges = mutableMapOf(
        "Thinh" to 30,
        "An" to 23
    )
    peopleAges["Barbara"] = 42
    peopleAges["Joe"] = 51

    peopleAges.forEach {
        print("${it.key} is ${it.value}, ")
    }
    println()

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    // Other collection operations
    val words = listOf("about", "acute", "balloon", "best", "brief", "class")
    val filteredWords = words
        .filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)

    // Lambda
    val triple: (Int) -> Int = { a -> a * 3 }
    println(triple(5))
}
