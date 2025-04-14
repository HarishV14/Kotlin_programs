fun main() {
    print("Enter your first name: ")
    val firstName = readLine()

    print("Enter your last name: ")
    val lastName = readLine()

    if (!firstName.isNullOrBlank() && !lastName.isNullOrBlank()) {
        println("Hello, $firstName $lastName!")
    } else {
        println("Please enter valid names.")
    }
}
