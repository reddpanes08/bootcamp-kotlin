package employees

import java.time.LocalDate

fun main() {
//    val employee2 = AdminEmployee("Brandon", "Cruz", "HR", LocalDate.now()).apply {
//        this.firstName = firstName.uppercase()
//    }

    //with, apply, let, run

//    with(employee2) {
//        println(firstName)
//        println(lastName)
//        println(id)
//        println(department)
//        println(isRankAndFile)
//        println(isAdmin)
//    }
    val address1 = LocationDetails(
        "Makati",
        "Metro Manila",
        "NCR",
        "1124 XYZ Building, Legaspi Village"
    )

    val employee1 = RankAndFileEmployee("Amy", "Carter", "IT", LocalDate.now(), address1)
//    val employee2 = RankAndFileEmployee("Amy", "Carter", "IT", LocalDate.now())
    println(employee1.location)


    val address2 = address1.copy(
        exactAddress = "1623 HJK Building, Salcedo Village"
    )
//    println(address1)
//    println(address2)
}