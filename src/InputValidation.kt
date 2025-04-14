fun main() {
    print("Enter a number between 1 and 10: ")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number != null && number in 1..10) {
        println("You entered: $number")
    } else {
        println("Error: Please enter a valid number between 1 and 10.")
    }
}
