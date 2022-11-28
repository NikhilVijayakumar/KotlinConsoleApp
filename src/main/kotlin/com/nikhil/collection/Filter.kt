package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library
import com.nikhil.data.Genre

fun main() {
     // filterExample1()
    //  filterExample2()
     // filterExample3()
     filterExample4()
    //filterExample5()

}

fun filterExample5() {
    Library.bookList.filter { book ->
        book.genres.all { genre ->
            genre is Genre.Fiction
        }
    }.filterNot { book ->
        book.authors.all { author ->
            author.name.equals("J.K. Rowling")
        }
    }.onEach { println(it) }

}
//Function all returns true if all elements in collection match the given predicate.
fun filterExample4() {
    Library.bookList.filter { book ->
        book.genres.all { genre ->
            genre is Genre.NonFiction
        }
    }.onEach { println(it) }

}
//Function none returns true if there are no elements that match the given predicate in the collection.
fun filterExample3() {
    Library.bookList.filter { book ->
        book.genres.none { genre ->
            genre is Genre.NonFiction
        }
    }.onEach {
        println(it)
    }

}
//Function any returns true if the collection contains at least one element that matches the given predicate.
fun filterExample2() {
    Library.bookList.filter { book ->
        book.genres.any { genre ->
            genre is Genre.NonFiction
        }
    }.onEach {
        println(it)
    }

}

fun filterExample1() {
    Library.bookList.filter { book ->
        book.authors.size > 1
    }.map { book ->
        "${book.title} by ${book.authors.joinToString { it.name }}"
    }.onEach { println(it) }

}
