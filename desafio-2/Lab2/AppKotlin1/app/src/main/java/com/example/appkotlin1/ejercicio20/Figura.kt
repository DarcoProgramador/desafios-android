package com.example.appkotlin1.ejercicio20

import kotlin.math.PI

abstract class Figura(val nombre: String) {
    abstract fun area(): Double
}

class Triangulo(private val base: Double, private val altura: Double) : Figura("Triangulo") {
    override fun area(): Double = base * altura / 2
}

class Cuadrado(private val lado: Double) : Figura("Cuadrado") {
    override fun area(): Double = lado * lado
}

class Circulo(private val radio: Double) : Figura("Circulo") {
    override fun area(): Double = PI * radio * radio
}

class Rectangulo(private val base: Double, private val altura: Double) : Figura("Rectangulo") {
    override fun area(): Double = base * altura
}