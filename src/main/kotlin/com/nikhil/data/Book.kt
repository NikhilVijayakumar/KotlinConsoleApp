package com.nikhil.data

data class Book(val title: String, val authors: List<Author>, val genres: List<Genre>, val price: Int) {
    constructor(title: String, author: Author, genre: Genre, price: Int) : this(title, listOf(author), listOf(genre), price)
    constructor(title: String, authors: List<Author>, genre: Genre, price: Int) : this (title, authors, listOf(genre), price)
    constructor(title: String, author: Author, genres: List<Genre>, price: Int) : this(title, listOf(author), genres, price)
}