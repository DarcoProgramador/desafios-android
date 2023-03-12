package com.example.appconvertidor.models

interface conversion {
    // Recibe el numero a convertir y su tipo de dato
    fun conversion(num:Float, type:String):Float
}