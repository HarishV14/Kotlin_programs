fun getNullableStringLength(input: String?): Int {
    return input?.length ?: -1
}

fun main() {
    // Test cases
    val str1: String? = "Hello, Kotlin!"
    val str2: String? = null

    println("Length of str1: ${getNullableStringLength(str1)}")  // Should print the length of the string
    println("Length of str2: ${getNullableStringLength(str2)}")  // Should print -1
}
