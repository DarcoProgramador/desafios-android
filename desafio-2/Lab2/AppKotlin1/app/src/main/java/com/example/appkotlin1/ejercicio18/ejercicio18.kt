package com.example.appkotlin1.ejercicio18

fun ejer18(){
    val array = arrayOf(1, 2, 3, 2, 4, 5, 3, 6, 6)

    println("Elementos del array: ${array.joinToString().split(", ")}")
    val set = mutableSetOf<Int>()

    for (element in array) {
        if (!set.add(element)) {
            println("Elemento duplicado: $element")
        }
    }
}