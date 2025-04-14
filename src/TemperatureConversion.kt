fun main() {
    print("Enter temperature in Celsius: ")
    val input = readLine()
    val celsius = input?.toDoubleOrNull()

    if (celsius != null) {
        val fahrenheit = (celsius * 9 / 5) + 32
        println("Temperature in Fahrenheit: $fahrenheit°F")
    } else {
        println("Error: Please enter a valid number for Celsius.")
    }
}
