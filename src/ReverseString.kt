fun reverseString(input: String): String {
    return input.reversed()
}

fun main() {
    val originalString = "Kotlin"
    val reversedString = reverseString(originalString)
    println("Original String: $originalString")
    println("Reversed String: $reversedString")
}
