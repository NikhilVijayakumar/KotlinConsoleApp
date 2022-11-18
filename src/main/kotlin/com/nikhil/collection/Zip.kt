package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main() {
       // zipExample()
        unzipExample()
}

fun unzipExample() {
    val genre = Library.bookList.map { it.genres }.flatten()
    val authors = Library.bookList.map { it.authors }.flatten()
    val authorGenre =  authors.zip(genre)
    authorGenre.unzip().also {
        println("${it.first} : ${it.second}")
    }

}

fun zipExample() {
    val genre = Library.bookList.map { it.genres }.flatten()
    val authors = Library.bookList.map { it.authors }.flatten()

  val authorGenre =  authors.zip(genre).forEachIndexed { index, pair -> println("${index+1} -- ${pair.first} : ${pair.second}") }

}
