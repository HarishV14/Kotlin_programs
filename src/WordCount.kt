fun countWords(input: String): Int {
    // Split the string by spaces and filter out empty strings
    return input.split(" ").filter { it.isNotEmpty() }.size
}

fun main() {
    val inputString = "Kotlin is awesome and fun"
    println("The number of words in the string is: ${countWords(inputString)}")
}
    