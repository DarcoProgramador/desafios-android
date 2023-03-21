package com.example.appkotlin1.ejercicio15

fun ejer15(){
    val numeros = intArrayOf(2, 5, 8, 10, 15, 22, 28, 31, 37, 42)

    println("arreglo: ${numeros.joinToString()}")
    // Calcula la suma de los elementos del arreglo
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }

    // Calcula el promedio
    val promedio = suma.toDouble() / numeros.size

    // Muestra los resultados por consola
    println("Suma: $suma")
    println("Promedio: $promedio")
}