data class Address(val street: String, val city: String)
data class Employee(val name: String, val address: Address?)
data class Company(val name: String, val employee: Employee?)

fun getStreetName(company: Company?): String {
    // Use chained safe calls and the Elvis operator to safely access properties
    return company?.employee?.address?.street ?: "Unknown"
}

fun main() {
    // Test case where all objects are non-null
    val address = Address("Baker Street", "London")
    val employee = Employee("John Doe", address)
    val company = Company("TechCorp", employee)
    println(getStreetName(company))  // Should print "Baker Street"

    // Test case where employee is null
    val companyWithNoEmployee = Company("TechCorp", null)
    println(getStreetName(companyWithNoEmployee))  // Should print "Unknown"

    // Test case where employee has no address
    val employeeWithoutAddress = Employee("Jane Doe", null)
    val companyWithEmployeeNoAddress = Company("TechCorp", employeeWithoutAddress)
    println(getStreetName(companyWithEmployeeNoAddress))  // Should print "Unknown"
}
