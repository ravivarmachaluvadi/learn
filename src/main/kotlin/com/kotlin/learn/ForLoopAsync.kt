package com.kotlin.learn

import kotlinx.coroutines.*

class ForLoopAsync

fun main(args: Array<String>) = runBlocking {
    println("Main started ${Thread.currentThread().name}")
    for (i in 1..5) {
        val jobDeferred: Deferred<Int> = async {
            println("$i ${Thread.currentThread().name}")
            delay(5000)
            println("$i ${Thread.currentThread().name}")
            i
        }
        //jobDeferred.join()
        val int: Int = jobDeferred.await()
        println(int)
    }
    println("Main ended ${Thread.currentThread().name}")
    Thread.sleep(6000)
}
