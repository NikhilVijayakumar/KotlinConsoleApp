package com.nikhil.basic.example

class ForExample {

    val fruits = listOf("apple", "banana", "kiwifruit")
    fun loopTest(){

        for (item in fruits) {
            println(item)
        }
    }

    fun loopWithIndexTest(){
        for (index in fruits.indices) {
            println("item at $index is ${fruits[index]}")
        }
    }
}