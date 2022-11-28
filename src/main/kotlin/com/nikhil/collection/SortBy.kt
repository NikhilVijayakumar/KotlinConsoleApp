package com.nikhil.com.nikhil.collection

import com.nikhil.com.nikhil.data.Library

fun main() {
    //sortExample1()
   // sortExample2()
  // sortExample3()
  //  sortExample4()
    sortExample5()
}

fun sortExample5() {
    Library.bookList
        .sortedBy {
            it.title
        }
        .shuffled()
        .forEach{ println(it.title) }

}

fun sortExample4() {
    Library.bookList
        .forEach{ println(it.title) }
    println("===========")
    Library.bookList
        .reversed()
        .forEach{ println(it.title) }


}

fun sortExample3() {
    Library.bookList
        .sortedByDescending{
            it.title
        }.forEach{ println(it.title) }
}

fun sortExample2() {
    Library.bookList
        .sortedBy {
        it.title
    }.forEach{ println(it.title) }

}

//Sorted required to implement compairable
fun sortExample1() {
    listOf(10,12,3,6,7,25,-5,122,-14,1).sorted().also { println(it) }

}
