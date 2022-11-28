package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library
import kotlin.math.roundToInt

fun main() {
    //reduceExample1()
    //sumExample()
   // sumByExample()
   // averageExample()
   // minExample()
    maxExample()
}

fun maxExample() {
    Library.bookList
        .maxBy { it.price }
        .also { println(it) }

}

fun minExample() {
    Library.bookList
        .minBy { it.price }
        .also { println(it) }
}

fun averageExample() {
    Library.bookList
        .map { it.price }
        .average()
        .roundToInt()
        .also { println(it) }
}

fun sumByExample() {
    Library.bookList
        .sumBy { it.price }
        .also { println(it) }

}

fun sumExample() {
    Library.bookList
        .map { it.price }
        .sum()
        .also { println(it) }

}

fun reduceExample1() {
    Library.bookList
        .map { it.price }
        .reduce { accumulator: Int, price: Int -> accumulator + price }
        .also { println(it) }
}


