package com.nikhil.com.nikhil.kotlinlang.example

class Inheritance {
}

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}



open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")                  // 1

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

