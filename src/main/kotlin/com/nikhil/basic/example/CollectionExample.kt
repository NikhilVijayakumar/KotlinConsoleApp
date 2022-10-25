package com.nikhil.basic.example

class CollectionExample {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fun iterateList(){
        for (item in fruits) {
            println(item)
        }
    }
    fun inList(){
        when {
            "orange" in fruits -> println("juicy")
            "apple" in fruits -> println("apple is fine too")
        }
    }

    fun filterList(){
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { println(it) }
    }
}