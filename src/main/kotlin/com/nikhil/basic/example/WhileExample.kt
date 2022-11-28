package com.nikhil.basic.example

import kotlin.math.pow

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


fun main() {
    var a = 10
    var b:Long = 20L
    var c = 30f
    var d = 40.25

    var result = (a+b) * (c+d)

}

fun amstrongNumber(amstrongNumber:Int){
    var number = amstrongNumber
    var sum = 0
    var mod = 0
    while (number>0){
        mod = number % 10
        number /=10
        sum += mod.toDouble().pow(3).toInt()
    }
    println(if(amstrongNumber == sum) "$amstrongNumber is an AmstrongNumber" else "$amstrongNumber is not Amstrongnumber")


}