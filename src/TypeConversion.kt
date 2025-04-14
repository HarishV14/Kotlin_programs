import kotlin.reflect.typeOf

fun main() {
    val largeNumber: Long = 10000000000     // This is a Long value
    val smallNumber: Int = largeNumber.toInt()  // Explicit conversion to Int

    println("Large number (Long): $largeNumber")
    println("Small number (Int): $smallNumber")
}
