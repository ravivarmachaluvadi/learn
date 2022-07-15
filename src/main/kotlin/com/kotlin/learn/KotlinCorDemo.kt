package com.kotlin.learn

import kotlinx.coroutines.*;
import org.springframework.boot.runApplication

class KotlinCorDemo

fun main(args: Array<String>) = runBlocking {
    println("Main started ${Thread.currentThread()}")
    for (i in 1..1) {

        GlobalScope.launch {
            println(printMsg("$i start ${Thread.currentThread()}"))
            //Thread.sleep(5000)
            delay(5000)
            println(printMsg("$i end ${Thread.currentThread()}"))
        }

        launch {
            println(printMsg("C2 start ${Thread.currentThread()}"))
            delay(5000)
            println(printMsg("C2 end ${Thread.currentThread()}"))
        }
    }
    println("Main ended ${Thread.currentThread()}")
    Thread.sleep(7000)
    println("Completed")
}

fun printMsg(string: String): String {

    return string
}