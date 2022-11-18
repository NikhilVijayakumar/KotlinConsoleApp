package com.nikhil.com.nikhil.scope

import com.nikhil.data.homer
import com.nikhil.data.marge


fun main() {
   // runReturnExample()
    runNullCheckExample()
}

fun runNullCheckExample() {
    println("exampleNullCheck start : $marge")
    // marge = null

    marge?.run {
        address = homer.address
        gender = "Female"
        hasFacebook = true
        hasTwitter = false
    } ?: println("Whoops, marge is actually null, isn't that bad?")

    println("exampleNullCheck end : $marge")

}

fun runReturnExample() {
    println("exampleRetuened start :$homer")

    val returned = homer.address.run {
        state = "Illinois"
        zipCode = 62629
        this
    }
    println("exampleRetuened after address update :$homer")
    println("exampleRetuened returned type is : $returned")

}

