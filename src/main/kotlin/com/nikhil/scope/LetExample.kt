package com.nikhil.com.nikhil.scope

import com.nikhil.data.homer
import com.nikhil.data.marge


fun main() {
      //exampleReturn()
      exampleNullCheck()
    }

fun exampleNullCheck() {
    println("exampleNullCheck start : $marge")
   // marge = null

    marge?.let { person ->
        person.address = homer.address
        person.gender = "Female"
        person.hasFacebook = true
        person.hasTwitter = false
    } ?: println("Whoops, marge is actually null, isn't that bad?")

    println("exampleNullCheck end : $marge")

}

fun exampleReturn() {
    println("exampleRetuened start :$homer")

    val returned = homer.address.let { address ->
        address.state = "Illinois"
        address.zipCode = 62629
        address
       // homer
    }
    println("exampleRetuened after address update :$homer")
    println("exampleRetuened returned type is : $returned")

}
