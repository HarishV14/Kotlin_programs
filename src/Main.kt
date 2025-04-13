fun getStringLength(input: String?): Int {
    return input?.length ?: 0
}

fun main() {
    val text1: String? = "Hello, Kotlin"
    val text2: String? = null

    println("Length of text1: ${getStringLength(text1)}")  // Output: 13
    println("Length of text2: ${getStringLength(text2)}")  // Output: 0
}
