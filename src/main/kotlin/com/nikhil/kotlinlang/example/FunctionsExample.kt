package com.nikhil.com.nikhil.kotlinlang.example

import com.sun.corba.se.impl.orbutil.graph.Graph
import sun.security.provider.certpath.Vertex

//Default Parameter Values and Named Arguments

fun printMessage(message: String) {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


//Infix Functions

class FunctionsExample(val name: String) {
    val likedPeople = mutableListOf<FunctionsExample>()
    infix fun likes(other: FunctionsExample) {
        likedPeople.add(other)
    }
    fun foo() { print(name) }
}

infix fun Int.repeat(str: String) = str.repeat(this)        // 1

infix fun String.onto(other: String) = Pair(this, other)

//Operator Functions
operator fun Int.times(str: String) = str.repeat(this)       // 1
// 2

operator fun String.get(range: IntRange) = substring(range)  // 3


//Functions with vararg Parameters

fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}

//Local functions


/*fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}*/

/*fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}*/
