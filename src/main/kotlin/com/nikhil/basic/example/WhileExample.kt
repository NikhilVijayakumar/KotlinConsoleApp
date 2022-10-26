package com.nikhil.basic.example

class WhileExample {
    fun whileTest(){
        val fruits = listOf("apple", "banana", "kiwifruit")
        var index = 0
        while (index < fruits.size) {
            println("item at $index is ${fruits[index]}")
            index++
        }
    }
}