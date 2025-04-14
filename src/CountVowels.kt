fun countVowels(input: String): Int {
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in input) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    val inputString = "Kotlin Programming"
    val vowelCount = countVowels(inputString)
    println("The number of vowels in \"$inputString\" is: $vowelCount")
}
