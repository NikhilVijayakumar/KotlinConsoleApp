package com.nikhil.basic.example

class ForExample {
    fun loopTest(){
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }

    fun loopWithIndexTest(){
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }
}