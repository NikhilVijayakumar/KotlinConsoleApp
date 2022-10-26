package com.nikhil.basic.example

//Local type inference
//Statically typed language
//Prefer val over var

val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
//val c: Int   // Type required when no initializer is provided
//c = 3       // deferred assignment

//var x = 5 // `Int` type is inferred
//x += 1


val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}