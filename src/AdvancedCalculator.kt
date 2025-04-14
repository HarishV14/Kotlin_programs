import kotlin.math.pow

fun main() {
    println("📟 Welcome to the Kotlin Calculator!")

    val num1 = getValidDouble("Enter first number:")
    val num2 = getValidDouble("Enter second number:")
    val operator = getValidOperator("Enter an operator (+, -, *, /, %, ^):")

    val result = calculate(num1, num2, operator)
    println("✅ Result: $result")
}

// Function to get a valid number from user
fun getValidDouble(prompt: String): Double {
    while (true) {
        println(prompt)
        val input = readLine()
        val number = input?.toDoubleOrNull()
        if (number != null) {
            return number
        } else {
            println("❌ Invalid number. Please try again.")
        }
    }
}

// Function to get a valid operator from user
fun getValidOperator(prompt: String): String {
    val validOperators = listOf("+", "-", "*", "/", "%", "^")
    while (true) {
        println(prompt)
        val input = readLine()
        if (input != null && input in validOperators) {
            return input
        } else {
            println("❌ Invalid operator. Allowed operators: ${validOperators.joinToString(", ")}")
        }
    }
}

// Function to calculate result based on operator
fun calculate(num1: Double, num2: Double, operator: String): Double {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("⚠️ Cannot divide by zero.")
                Double.NaN
            } else {
                num1 / num2
            }
        }
        "%" -> {
            if (num2 == 0.0) {
                println("⚠️ Cannot perform modulo with zero.")
                Double.NaN
            } else {
                num1 % num2
            }
        }
        "^" -> num1.pow(num2)
        else -> {
            println("⚠️ Unknown error occurred.")
            Double.NaN
        }
    }
}