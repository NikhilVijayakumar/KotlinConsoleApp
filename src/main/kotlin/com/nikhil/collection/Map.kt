package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main(){
   // mapExample1()
   // joinToStringExample()
    indexMapExample()
}

fun indexMapExample() {
    val bookIndexed = Library.bookList.mapIndexed { index, book ->
        val authors = book.authors.joinToString { it.name }
        "${index+1} ${book.title} by $authors"
    }.joinToString("\n")
    println(bookIndexed)

}

fun joinToStringExample() {

    val authorList = Library.bookList.map { book->
        book.authors
    }.map {authors ->
        authors.joinToString { it.name }
    }.joinToString(separator = "\n")

    println(authorList)


}

fun mapExample1() {
   val authorList = Library.bookList.map { book->
        book.authors
    }.onEach { println(it) }

}
