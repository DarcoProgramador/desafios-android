package com.example.appconvertidor.models

class Kilometro : conversion{
    private val medidas: Map<String, Float> = mapOf(
        "kilometro" to 1.0F,
        "metro" to 1000.0F,
        "centimetro" to 100000.0F
    ).withDefault { 0.0F }

    override fun conversion(num:Float, type:String):Float{
        return (num * medidas[type]!!)
    }
}