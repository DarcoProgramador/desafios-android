package com.example.appkotlin1.ejercicio22

data class Clase(val profesor: String, val materia: String, val laboratorios: Int, val conferencias: Int)

fun ejer22(){
    val clase1 = Clase("Juan Perez", "Programación", 3, 2)
    val clase2 = Clase("Maria Gomez", "Bases de Datos", 2, 3)

    println("Clase 1: $clase1")
    println("\nClase 2: $clase2")
}
