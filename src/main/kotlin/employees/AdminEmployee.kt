package employees

import java.time.LocalDate

// Create another class that will extend the Employee Class, name it: AdminEmployee. This class should have an attribute isRankAndFile that has a value of false. And isAdmin that has a value of true.

class AdminEmployee(
    firstName: String,
    lastName: String,
    department: String,
    hiringDate: LocalDate,
    location: LocationDetails
): Employee(
    firstName,
    lastName,
    department,
    hiringDate,
    location
) {
    val isRankAndFile = false
    val isAdmin = true

    // Return the value of isAdmin
    override fun doSomething(): String = isAdmin.toString()
}