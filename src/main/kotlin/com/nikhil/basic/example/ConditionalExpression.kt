package com.nikhil.basic.example

class ConditionalExpression {

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun max(a: Int, b: Int) = if (a > b) a else b

}