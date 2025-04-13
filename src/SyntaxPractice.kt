// Single-line comment: This file demonstrates basic Kotlin syntax.
// Multi-line comment:
/*
   File: SyntaxPractice.kt
   Purpose: Practice Kotlin syntax, including variables, classes, packages, imports,
   comments, operators, and naming conventions.
*/

import java.util.Date

fun main() {
    // Identifiers
    val userAge: Int = 25
    val _userName: Int = 10
    val itemCount: Int = 5

    // Whitespace and Indentation
    if (userAge > 18) {
        println("User is an adult.")
    }

    // Operators: Calculating average
    val average = (userAge + _userName + itemCount) / 3
    println("Average of the three values: $average")

    // Data Types
    val myInt: Int = 100
    val myDouble: Double = 99.9
    val myString: String = "Kotlin"
    val myBoolean: Boolean = true

    println("Int: $myInt, Double: $myDouble, String: $myString, Boolean: $myBoolean")

    // Using imported class
    val currentDate = Date()
    println("Current date: $currentDate")
    println(Product.DEFAULT_PRICE)  // Prints 9.99
}

// Naming Conventions: Class Product
class Product {
// companion object is a place where you can store things that are the same for all products (like the default price).
    companion object {
        const val DEFAULT_PRICE = 9.99
    }

    var productName: String = "Sample Product"
}
