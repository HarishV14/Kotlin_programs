fun sumOfNonNullIntegers(numbers: List<Int?>): Int {
    return numbers.filterNotNull().sum()
}

fun main() {
    // Example list with nullable integers
    val numbers = listOf(1, null, 3, 4, null, 6)

    // Call the function and print the result
    val result = sumOfNonNullIntegers(numbers)
    println("The sum of non-null integers is: $result")
}
