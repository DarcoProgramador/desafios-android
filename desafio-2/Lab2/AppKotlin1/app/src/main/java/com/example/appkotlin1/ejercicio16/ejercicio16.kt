package com.example.appkotlin1.ejercicio16

fun ejer16(){
    val num1 = 5
    val num2 = 10
    val num3 = 15

    println("Numeros a usar: $num1, $num2, $num3")

    val sum = { a: Int, b: Int, c: Int -> a + b + c }
    val product = { a: Int, b: Int, c: Int -> a * b * c }
    val average = { a: Int, b: Int, c: Int -> (a + b + c) / 3 }

    println("Suma: ${sum(num1, num2, num3)}")
    println("Producto: ${product(num1, num2, num3)}")
    println("Promedio: ${average(num1, num2, num3)}")
}