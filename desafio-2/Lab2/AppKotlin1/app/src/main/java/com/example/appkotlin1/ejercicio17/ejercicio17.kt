package com.example.appkotlin1.ejercicio17

fun ejer17(){
    val num1 = 220
    val num2 = 284

    println("números ingresados: $num1, $num2")

    if (sonAmigos(num1, num2)) {
        println("$num1 y $num2 son números amigos")
    } else {
        println("$num1 y $num2 no son números amigos")
    }
}

fun sonAmigos(num1: Int, num2: Int): Boolean {
    return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1
}

fun sumaDivisores(num: Int): Int {
    var suma = 0
    for (i in 1 until num) {
        if (num % i == 0) {
            suma += i
        }
    }
    return suma
}