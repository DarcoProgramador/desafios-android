package com.example.appkotlin1.ejercicio21

class Insecto(private val longitud: Float, private val numAlas: Int, private val numPatas: Int, private val color: String, private val numAntenas: Int, private val tipoInsecto: String) {

    fun imprimirValores() {
        println("Longitud: $longitud")
        println("# de Alas: $numAlas")
        println("# de Patas: $numPatas")
        println("Color: $color")
        println("# de Antenas: $numAntenas")
        println("Tipo de Insecto: $tipoInsecto")
    }
}