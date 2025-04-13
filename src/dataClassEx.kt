data class Person(
    val name: String,
    val age: Int,
    val email: String
)

fun main() {
    // Creating a person
    val person1 = Person("Alice", 25, "alice@example.com")

    // Auto-generated toString()
    println(person1)

    // Using copy() to create a new instance with slight modification
    val person2 = person1.copy(name = "Bob")

    // Destructuring
    val (name, age, email) = person2
    println("Name: $name, Age: $age, Email: $email")

    // Equality check (auto-generated equals())
    println("Are they equal? ${person1 == person2}")

    // Hash code
    println("HashCode: ${person1.hashCode()}")
}
