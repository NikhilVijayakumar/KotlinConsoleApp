package com.nikhil.basic.example

class StringTemplate {
    fun printKotlin() {
        val name = "Kotlin"
        println("Variable $name")
        println("Function ${getName(name)}")
    }

    fun getName(name: String): String {
        return name;
    }

//puzzle what will be printed

    fun foo(): String {
        println("Calculating foo")
        return "foo";
    }

    fun puzzleFoo() {
        println("First ${foo()},Second ${foo()}")
    }
}