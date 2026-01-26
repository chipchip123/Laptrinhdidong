fun main() {

    // In văn bản
    println("Hello, VKU!!!")
    println("This is the text to print!")

    // Comment
    // This is a comment line.
    // This is another comment.

    // Biến
    val age = "18"
    val name = "Gia Thinh"

    var roll = 6
    var rolledValue: Int = 4

    // Chuỗi mẫu
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")

    // Gọi hàm không đối số
    printHello()

    // Gọi hàm có đối số
    printBorder("-", 10)

    // Hàm trả về giá trị
    val diceValue = rollDice()
    println("Dice roll: $diceValue")

    // if / else
    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }

    // when
    val luckyNumber = 6
    when (diceValue) {
        luckyNumber -> println("You won!")
        1 -> println("Rolled 1")
        2 -> println("Rolled 2")
        3 -> println("Rolled 3")
        4 -> println("Rolled 4")
        5 -> println("Rolled 5")
        else -> println("Rolled 6")
    }

    // repeat
    printSimpleBorder()

    // repeat lồng nhau
    printCakeBottom(age = 3, layers = 2)

    // Class Dice
    val myFirstDice = Dice(6)
    println("Dice class roll: ${myFirstDice.roll()}")
}

// ===== HÀM =====
fun printHello() {
    println("Hello Kotlin")
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun rollDice(): Int {
    return (1..6).random()
}

fun printSimpleBorder() {
    repeat(23) {
        print("-")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

// ===== CLASS =====
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
