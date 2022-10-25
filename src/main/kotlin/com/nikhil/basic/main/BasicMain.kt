package com.nikhil.basic.main

import com.nikhil.basic.example.Rectangle

//An entry point of a Kotlin application is the main function.

fun main() {
    println("Hello world!")
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

}

//Another form of main accepts a variable number of String arguments.

/*
fun main(args: Array<String>) {
    println(args.contentToString())
}*/
