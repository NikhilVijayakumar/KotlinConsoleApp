package com.nikhil.data

import com.nikhil.data.Address
import com.nikhil.data.FictionalPerson

object Person {
    val harry = FictionalPerson(
        firstName = "Homer",
        lastName = "Simpson",
        age = 39,
        address = Address(
            number = 742,
            street = "Evergreen Terrace",
            city = "Springfield",

            state = "Oregon",
            zipCode = 97475
        )
    )

    var hermione : FictionalPerson? = FictionalPerson(
        firstName = "Marge",
        lastName = "Simpson",
        age = 36,
        address = Address(
            number = 742,
            street = "Evergreen Terrace",
            city = "Springfield",
            state = "Oregon",
            zipCode = 97475
        )
    )
}

val homer = Person.harry
val marge = Person.hermione