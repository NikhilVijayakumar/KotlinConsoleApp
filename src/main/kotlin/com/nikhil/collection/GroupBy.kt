package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main() {
    //groupByExample1()
    groupByExample2()
}

fun groupByExample2() {
    Library.bookList.map { book ->
        book.genres.map { genre ->
            Pair(genre, book)
        }
    }.flatten()
        .groupBy {
            it.first
    }.forEach { key, value ->
            println("====$key========")
            value.forEachIndexed { index, pair ->
                println("${index+1} - ${pair.second.title} by ${pair.second.authors.joinToString(" and ") { it.name }} in ${pair.first}")
            }
        }

}

fun groupByExample1() {
    Library.bookList.groupBy { book ->
        book.genres
    }.forEach { key, value ->
        println("====$key========")
        value.forEachIndexed { index, book ->
            println("${index + 1} - ${book.title} by ${book.authors.joinToString(" and ") { it.name }}")
        }
    }

}
