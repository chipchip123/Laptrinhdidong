fun main() {

    val squareCabin = SquareCabin(5, 1)
    println("Material: ${squareCabin.buildingMaterial}")
    println("Floor area: ${squareCabin.floorArea()}")

    // List read-only
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.size)
    println(numbers[0])
    println(listOf("red", "blue", "green").reversed())

    // Mutable list
    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    entrees[0] = "lasagna"
    entrees.remove("lasagna")
    println(entrees)

    // for loop
    for (element in numbers) {
        println(element)
    }

    // while loop
    var index = 0
    while (index < numbers.size) {
        println(numbers[index])
        index++
    }

    // String
    val name = "Android"
    println(name.length)

    val number = 5
    val groups = 2
    println("$number people")
    println("${number * groups} people")
}

//  ABSTRACT
abstract class Dwelling {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

// PEN CLASS
open class RoundHut(val residents: Int)

// CHILD CLASS
class SquareCabin(private val side: Int, private val floors: Int) : Dwelling() {
    override val buildingMaterial = "Wood"

    override fun floorArea(): Double {
        return side * side * floors.toDouble()
    }
}
