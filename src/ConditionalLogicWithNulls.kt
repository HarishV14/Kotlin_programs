fun getResponse(input: Boolean?): String {
    return when (input) {
        true -> "Agreed"
        false -> "Disagreed"
        null -> "No response"
    }
}

fun main() {
    // Test cases
    println(getResponse(true))    // Output: Agreed
    println(getResponse(false))   // Output: Disagreed
    println(getResponse(null))    // Output: No response
}
