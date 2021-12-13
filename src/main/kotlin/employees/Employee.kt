package employees

import java.time.LocalDate

/**
 * This class should have the following attributes:
 * firstName
 * lastName
 * department
 * hiringDate - (cannot be modified)
 */

abstract class Employee (
    override var firstName: String,
    override var lastName: String,
    var department: String,
    val hiringDate: LocalDate,
    var location: LocationDetails
        ) : EmployeeInterface {

    var id: String = ""


    /**
     * Create a function that shows the data of this employee
     * "Employee Name: ___ from ____ department."
     */
    fun showEmployeeData() = println("Employee Name: $firstName $lastName from $department department")

    /**
     * When this class is instantiated, Generate an id, and save as an attribute of this class
     * the id format is: first 2 letters of the firstName + - + first 2 letters of the lastName + - + 8 random digits
     */
    init {
        this.id = "${firstName.substring(0,2).uppercase()}-${lastName.substring(0,2).uppercase()}-${(10000000 until 99999999).random()}"
    }
}

class Person(override var firstName: String, override var lastName: String): EmployeeInterface {
    override fun doSomething(): String {
        TODO("Not yet implemented")
    }

}



