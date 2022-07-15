package com.kotlin.learn

import kotlinx.coroutines.*

class ForLoopLaunch

fun main() = runBlocking {
    println("started ${Thread.currentThread().name}")
    for (int in 1..5) {
        val job:Job = launch {
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