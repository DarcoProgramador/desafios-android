package com.example.appkotlin1.ejercicio12

fun ejer12(){

    var n:Int // Número de filas de la pirámide
    do {
        print("Digite un numero de n:")
        n = readLine()?.toIntOrNull()?:-1
    }while (n < 1)

    for (i in 1..n) {
        // Imprimir espacios en blanco
        for (j in 1..n-i) {
            print("  ")
        }
        // Imprimir números en orden creciente
        for (j in 1..i) {
            print("$j ")
        }
        // Imprimir números en orden decreciente
        for (j in i-1 downTo 1) {
            print("$j ")
        }
        println() // Saltar a la siguiente línea
    }
}