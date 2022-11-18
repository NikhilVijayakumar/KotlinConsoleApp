package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main(){
   // whileExample()
   // forExample()
   // forEachExample()
    forEachIndexedExample()
}

fun forEachIndexedExample() {
    Library.bookList.forEachIndexed { index, book ->
        println("${index + 1} - $book")
    }

}

fun forEachExample() {
    Library.bookList.forEach { book ->
        println(book)
    }
}

fun forExample() {
    Library.bookList.let { bookList->
        for (book in bookList) {
            println(book)
        }
    }

}

fun whileExample() {
    Library.bookList.iterator().let { iterator ->
        while (iterator.hasNext()) {
            val book = iterator.next()
           println(book)
        }
    }
}
