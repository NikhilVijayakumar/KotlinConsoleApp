package com.nikhil.collection

import com.nikhil.com.nikhil.data.Library
import com.nikhil.data.Author

fun main(){
    flatmapExample()

}

fun flatmapExample() {
    println("===authors====")
    val authors:List<List<Author>> = Library.bookList.map { book -> book.authors  }.also {
        print(it)
    }
    println("\n===authorList====")


    val authorList:List<Author> = authors.flatten().also { authorAlso->authorAlso.forEachIndexed { index, author ->println("${index+1} - $author")  }  }


    println("\n===Name====")
    val authorName:List<String> = authors.flatMap {
        it.map { author -> author.name  }
    }.onEach {
      println(it)
  }

}
