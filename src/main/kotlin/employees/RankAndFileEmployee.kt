package employees

import java.time.LocalDate

// Create another class that will extend the Employee Class, name it: RankAndFileEmployee. This class should have an attribute isRankAndFile that has a value of true. And isAdmin that has a value of false.

class RankAndFileEmployee(
    firstName: String,
    lastName: String,
    department: String,
    hiringDate: LocalDate,
    location: LocationDetails
): Employee(
    firstName, lastName, department, hiringDate, location
) {
    val isRankAndFile = true
    val isAdmin = false

    // Return the value of isRankAndFile
    override fun doSomething(): String = isRankAndFile.toString()
}
