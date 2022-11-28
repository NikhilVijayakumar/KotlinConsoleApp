package com.nikhil.com.nikhil.scope

import com.nikhil.data.FictionalPerson
import com.nikhil.data.homer
import com.nikhil.data.marge


fun main() {

    println("homer start : $homer")
    val address = moveToIllinois(homer)
    println("homer updated : $address")
    println("marge start : $marge")
    marge?.let {
        moveToIllinois(it)
    }
    println("marge updated : $marge")
}

fun moveToIllinois(fictionalPerson: FictionalPerson) = with(fictionalPerson.address) {
    state = "Illinois"
    zipCode = 62629
    this
}