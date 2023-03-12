package com.example.appconvertidor.models

class Centimetro : conversion {
    private val medidas: Map<String, Float> = mapOf(
        "kilometro" to 0.00001F,
        "metro" to 0.001F,
        "centimetro" to 1.0F
    ).withDefault { 0.0F }

    override fun conversion(num:Float, type:String):Float{
        return (num * medidas[type]!!)
    }
}