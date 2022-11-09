package com.nikhil.com.nikhil.kotlinlang.main

import com.nikhil.com.nikhil.kotlinlang.example.*;

object KotlinLangMain {

    @JvmStatic fun main(args: Array<String>){
       initFunction();
        initInfixFunction()
        initOperatorFun()
        initVargs()
        initMemberFun()
    }

    private fun initMemberFun() {
        FunctionsExample("Nikhil").foo()

    }

    private fun initVargs() {
        printAll("Hello", "Hallo", "Salut", "Hola", "你好")
        printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "你好",
            prefix = "Greeting: "                                          // 4
        )
    }

    private fun initOperatorFun() {
        println(2 * "Bye ")
        val str = "Always forgive your enemies; nothing annoys them so much."
        println(str[0..14])

    }

    private fun initInfixFunction() {
        println(2 repeat "Bye ")

        val pair = "Ferrari" to "Katrina"
        println(pair)

        val myPair = "McLaren" onto "Lucas"
        println(myPair)

        val sophia = FunctionsExample("Sophia")
        val claudia = FunctionsExample("Claudia")
        sophia likes claudia

    }

    private fun initFunction() {
        printMessage("Hello")
        printMessageWithPrefix("Hello", "Log")
        printMessageWithPrefix("Hello")
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        println(sum(1, 2))
        println(multiply(2, 4))
    }


}