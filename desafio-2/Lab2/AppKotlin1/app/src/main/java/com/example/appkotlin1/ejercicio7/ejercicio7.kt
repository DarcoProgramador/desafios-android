package com.example.appkotlin1.ejercicio7

fun ejer7(){
    val num1 = 3
    val num2 = 1
    val num3 = 2
    println("Numeros sin ordenar: $num1, $num2, $num3")
    val numerosOrdenados = ordenarNumeros(num1, num2, num3)
    println("Los números ordenados son: ${numerosOrdenados.joinToString(", ")}")
}

fun ordenarNumeros(num1: Int, num2: Int, num3: Int): Array<Int> {
    // Crear un array con los tres números
    val numeros = arrayOf(num1, num2, num3)

    // Ordenar los números utilizando la función sort()
    numeros.sort()

    // Retornar el array ordenado
    return numeros
}