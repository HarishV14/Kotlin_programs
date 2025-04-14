fun main() {
    // Declare two integer variables
    val num1: Int = 60     // Binary: 111100
    val num2: Int = 13     // Binary: 001101

    // Perform bitwise AND operation
    val andResult: Int = num1 and num2

    // Perform bitwise OR operation
    val orResult: Int = num1 or num2

    // Perform bitwise XOR operation
    val xorResult: Int = num1 xor num2

    // Print the results in both binary and decimal format
    println("Bitwise AND:")
    println("Decimal: $andResult")
    println("Binary: ${Integer.toBinaryString(andResult)}\n")

    println("Bitwise OR:")
    println("Decimal: $orResult")
    println("Binary: ${Integer.toBinaryString(orResult)}\n")

    println("Bitwise XOR:")
    println("Decimal: $xorResult")
    println("Binary: ${Integer.toBinaryString(xorResult)}")
}
