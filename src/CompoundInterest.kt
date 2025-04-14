import kotlin.math.pow

fun main() {
    // Input values: principal, rate of interest, and time period
    print("Enter the principal amount (P): ")
    val principal = readLine()!!.toDouble()

    print("Enter the rate of interest (R) in percentage: ")
    val rateOfInterest = readLine()!!.toDouble()

    print("Enter the time period (T) in years: ")
    val timePeriod = readLine()!!.toDouble()

    // Compound Interest formula: A = P(1 + R/100)^T
    val amount = principal * (1 + rateOfInterest / 100).pow(timePeriod)

    // Compound interest is the total amount minus the principal
    val compoundInterest = amount - principal

    // Print the results
    println("Amount after $timePeriod years: $%.2f".format(amount))
    println("Compound Interest: $%.2f".format(compoundInterest))
}
