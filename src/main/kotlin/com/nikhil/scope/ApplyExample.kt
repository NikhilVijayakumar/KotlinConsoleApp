package com.nikhil.com.nikhil.scope

import com.nikhil.data.homer

fun main(){

    println("homer start : $homer")
    val returned = homer.apply {
        address.state = "Illinois"
        address.zipCode = 62629
        println("Homer Has Moved To Illinois")
        gender = "Male"
        hasFacebook = true
        hasTwitter = false
        occupation = "Nuclear Safety Inspector"
        println("Optional Values Have Been Applied")
    }

    println("homer after apply : $homer")
    println("Returned : $returned")
}