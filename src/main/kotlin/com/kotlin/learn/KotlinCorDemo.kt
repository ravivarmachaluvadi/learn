package com.kotlin.learn

import kotlinx.coroutines.*
import org.springframework.boot.runApplication

class KotlinCorDemo

fun main(args: Array<String>) = runBlocking {
    println("Main started ${Thread.currentThread().name}")
    for (i in 1..1) {

        val job: Job = launch {
            println(printMsg("$i start ${Thread.currentThread().name}"))
            //Thread.sleep(5000)
            delay(5000)
            println(printMsg("$i end ${Thread.currentThread().name}"))
        }

        GlobalScope.launch {
            println(printMsg("C2 start ${Thread.currentThread().name}"))
            delay(5000)
            println(printMsg("C2 end ${Thread.currentThread().name}"))
        }
//        job.cancel()
        job.join()
    }
    println("Main ended ${Thread.currentThread().name}")
    Thread.sleep(7000)
    println("Completed")
}

fun printMsg(string: String): String {

    return string
}