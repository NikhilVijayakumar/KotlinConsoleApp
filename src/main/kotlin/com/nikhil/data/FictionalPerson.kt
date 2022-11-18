package com.nikhil.data

data class FictionalPerson(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: Address,
    var gender: String? = null,
    var hasFacebook: Boolean = false,
    var hasTwitter: Boolean = false,
    var occupation: String? = null
)