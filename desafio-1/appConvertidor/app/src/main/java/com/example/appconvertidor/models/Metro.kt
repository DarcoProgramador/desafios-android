package com.example.appconvertidor.models

class Metro : conversion {
    private val medidas: Map<String, Float> = mapOf(
        "kilometro" to 0.001F,
        "metro" to 1.0F,
        "centimetro" to 100.0F
    ).withDefault { 0.0F }

    override fun conversion(num:Float, type:String):Float{
        return (num * medidas[type]!!)
    }
}