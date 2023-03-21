package com.example.appkotlin1.ejercicio11

fun ejer11(){
    val numero = 7 // Número a mostrar la tabla de multiplicar
    for (i in 1..12) {
        println("$numero x $i = ${numero * i}")
    }
}