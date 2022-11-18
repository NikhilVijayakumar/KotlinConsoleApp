package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library
import com.nikhil.data.Book
import com.nikhil.data.Genre

fun main() {
  //  associateExample()
    //associateByExample()
    associateWithExample()
}

fun associateWithExample() {
    val genresPair:Map<Book,Genre> = Library.bookList.associateWith {
        it.genres.first()
    }
    genresPair.forEach { (key, value) -> println("$key -- $value")  }

   // Library.bookList.a
}

fun associateByExample() {
    val genresPair:Map<Genre,Book> = Library.bookList.associateBy {
       it.genres.first()
    }
    genresPair.forEach { (key, value) -> println("$key -- $value")  }
}

fun associateExample() {
   val genresPair:Map<Genre,Book> = Library.bookList.associate {
       Pair(it.genres.first(),it)
   }
    genresPair.forEach { (key, value) -> println("$key -- $value")  }
}
