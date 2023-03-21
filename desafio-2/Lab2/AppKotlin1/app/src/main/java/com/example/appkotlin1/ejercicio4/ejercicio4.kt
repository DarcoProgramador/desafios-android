package com.example.appkotlin1.ejercicio4

fun ejer4(){
    val words = listOf(
        "apple" to "manzana",
        "banana" to "plátano",
        "car" to "coche",
        "dog" to "perro",
        "elephant" to "elefante",
        "flower" to "flor",
        "grape" to "uva",
        "house" to "casa",
        "ice cream" to "helado",
        "juice" to "jugo"
    )

    for ((english, spanish) in words) {
        println("${english.padEnd(12)}${spanish}")
    }
}
