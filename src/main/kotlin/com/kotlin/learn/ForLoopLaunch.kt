package com.kotlin.learn

import kotlinx.coroutines.*

class ForLoopLaunch

fun main() = runBlocking {
    println("started ${Thread.currentThread().name}")
<<<<<<< HEAD
    for (int in 1..10) {
        val job: Job = launch {
=======
    for (int in 1..15) {
        val job:Job = launch {
>>>>>>> 34964a23fc5b271616e6ef34d943ec8e655c9b83
            getIntValue(int)
        }
    }

    println("ended ${Thread.currentThread().name}")
}

fun getIntValue(int: Int) = runBlocking() {
    println("$int ${Thread.currentThread().name}")
    delay(5000)
    println("$int ${Thread.currentThread().name}")
}
