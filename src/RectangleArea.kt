fun main() {
    print("Enter the length of the rectangle: ")
    val lengthInput = readLine()
    print("Enter the width of the rectangle: ")
    val widthInput = readLine()

    // Convert input to Double
    val length = lengthInput?.toDoubleOrNull()
    val width = widthInput?.toDoubleOrNull()

    if (length != null && width != null) {
        val area = length * width
        println("The area of the rectangle is $area")
    } else {
        println("Please enter valid numbers for length and width.")
    }
}
