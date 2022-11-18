package com.nikhil.com.nikhil.scope

import com.nikhil.data.Address
import com.nikhil.data.FictionalPerson


fun main() {
    val harry = FictionalPerson(
        firstName = "Harry",
        lastName = "Potter",
        age = 39,
        address = Address(
            number = 742,
            street = "Evergreen Terrace",
            city = "Springfield",
            state = "Oregon",
            zipCode = 97475
        )
    ).also { insert(it) }

    println(harry)
}


fun insert(fictionalPerson: FictionalPerson) {
    println("Inserted $fictionalPerson into the database.")
}