package com.example.appkotlin1.ejercicio6

fun ejer6(){
    var numero:Int
    // Solicitar un número del 1 al 7 al usuario
    do {
        println("Ingrese un número del 1 al 7:")
        numero = readLine()?.toIntOrNull()?:-1
    }while (numero < 1 || numero > 7)

    // Evaluar el número ingresado y escribir el nombre del día correspondiente
    when (numero) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Número inválido")
    }
}