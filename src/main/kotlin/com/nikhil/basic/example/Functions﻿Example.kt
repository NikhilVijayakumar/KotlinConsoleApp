@file:JvmName("Utils")
package com.nikhil.basic.example


//Top level function
fun max(firstNumber:Int,secondNumber:Int):Int{
    return if(firstNumber>secondNumber) firstNumber else secondNumber
}


//Local function
fun other(){
    fun local() = 3
}

class FunctionTest{
    var firstNumber:Int = 0
    var secondNumber:Int = 0

    //member function
    fun max():Int{
        return if(firstNumber>secondNumber) firstNumber else secondNumber
    }

}



//A function with two Int parameters and Int return type.
fun sum(a: Int, b: Int): Int {
    return a + b
}

//A function body can be an expression. Its return type is inferred.
fun add(a: Int, b: Int) = a + b

//A function that returns no meaningful value.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

//Unit return type can be omitted.
fun printAdd(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}