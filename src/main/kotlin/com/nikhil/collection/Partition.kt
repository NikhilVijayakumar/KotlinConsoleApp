package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library
import com.nikhil.data.Book
import com.nikhil.data.Genre

fun main() {
    partionExample1()
}

fun partionExample1() {
   val bookCollection:Pair<List<Book>,List<Book>> = Library.bookList.partition { book ->
        book.genres.all{genre ->
            genre is Genre.NonFiction
        }
    }
    println("=================Non Fiction ======================")
    bookCollection.first.forEachIndexed { index, book ->
        println("${index+1} - ${book.title} by ${book.authors.joinToString { it.name }} in ${book.genres.joinToString(" and ")}")
    }
    println("=================Fiction ======================")
    bookCollection.second.forEachIndexed { index, book ->
        println("${index+1} - ${book.title} by ${book.authors.joinToString { it.name }} in ${book.genres.joinToString(" and ")}")
    }
}
