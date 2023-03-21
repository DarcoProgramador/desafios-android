package com.example.appkotlin1.ejercicio20

fun ejer20(){
    var formas:Figura

    formas = Circulo(2.0)
    println("El area de un ${formas.nombre} es ${formas.area()}")

    formas = Rectangulo(1.0, 2.0)
    println("El area de un ${formas.nombre} es ${formas.area()}")

    formas = Cuadrado(3.0)
    println("El area de un ${formas.nombre} es ${formas.area()}")

    formas = Triangulo(3.0, 5.0)
    println("El area de un ${formas.nombre} es ${formas.area()}")
}