fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {
    val num1 = 4
    val num2 = 7
    val num3 = 0
    val num4 = -2

    println("$num1 is even: ${num1.isEven()}")   // Output: true
    println("$num2 is even: ${num2.isEven()}")   // Output: false
    println("$num3 is even: ${num3.isEven()}")   // Output: true
    println("$num4 is even: ${num4.isEven()}")   // Output: true
}
