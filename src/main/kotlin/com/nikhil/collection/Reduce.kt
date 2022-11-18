package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main() {
    reduceExample1()
    reduceExample2()
}

fun reduceExample2() {


}

fun reduceExample1() {
    Library.bookList.map { it.price }.reduce { acc, i -> acc+i }.also { println(it) }
}


