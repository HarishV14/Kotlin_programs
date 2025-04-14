fun isPalindrome(input: String): Boolean {
    // Remove non-alphanumeric characters and convert to lowercase
    val sanitizedInput = input.filter { it.isLetterOrDigit() }.lowercase()

    // Check if the string is equal to its reverse
    return sanitizedInput == sanitizedInput.reversed()
}

fun main() {
    val inputString = "A man, a plan, a canal, Panama"
    val result = if (isPalindrome(inputString)) {
        "\"$inputString\" is a palindrome."
    } else {
        "\"$inputString\" is not a palindrome."
    }
    println(result)
}
