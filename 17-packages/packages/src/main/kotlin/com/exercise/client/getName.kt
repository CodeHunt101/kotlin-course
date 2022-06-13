package com.exercise.client

import com.exercise.hello.sayHi

fun getName() {
    println("Enter client's name:")
    sayHi(readLine()?:"")
}