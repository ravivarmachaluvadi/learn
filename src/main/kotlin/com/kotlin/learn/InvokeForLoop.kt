package com.kotlin.learn

import kotlinx.coroutines.*

class InvokeForLoop

fun main() = runBlocking {
    println("started ${Thread.currentThread().name}")
    for (int in 1..5) {
        val def: Deferred<Int> = async {
            getIntVal(int)
        }
        println(def.await())
    }
    println("ended ${Thread.currentThread().name}")
}

fun getIntVal(int: Int): Int = runBlocking() {
    println("$int ${Thread.currentThread().name}")
    delay(5000)
    println("$int ${Thread.currentThread().name}")
    int
}