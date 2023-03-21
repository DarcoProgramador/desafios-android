package com.example.appkotlin1.ejercicio2

import com.example.appkotlin1.ejercicio1.areaTriangulo
import kotlin.math.PI
import kotlin.math.pow

fun ejer2(){
    var radio: Float
    var result: Float
    do
    {
        print("Digite el radio del circulo: ")
        radio = readLine()?.toFloatOrNull() ?:0F

        result = areaCirculo(radio)
        if(result == -1F){
            println("Error al digitar, digite denuevo")
        }
    }while (result < 0F)

    println("El area de un circulo de radio: $radio, es de: $result")
}

fun areaCirculo(radio:Float = 0F): Float{
    if (radio == 0F){
        return -1F
    }

    return  (radio.pow(2) * PI).toFloat()
}