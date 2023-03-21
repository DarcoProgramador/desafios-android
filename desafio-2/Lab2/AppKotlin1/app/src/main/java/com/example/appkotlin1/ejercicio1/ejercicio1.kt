package com.example.appkotlin1.ejercicio1

fun ejer1(){
    var base: Int
    var altura: Int
    var result: Float

    do
    {
        print("Digite la base del triangulo: ")
        base = readLine()?.toIntOrNull() ?:0
        print("Digite la base del altura: ")
        altura = readLine()?.toIntOrNull() ?:0


        result = areaTriangulo(base, altura)
        if(result == -1F){
            println("Error al digitar, digite denuevo")
        }

    }while (result < 0F)

    println("El area de un tríangulo de base: $base, y altura: $altura, es de: $result")
}

fun areaTriangulo(base:Int = 0, altura:Int = 0): Float{
    if (base == 0 || altura == 0){
        return -1F
    }
    val b : Float = base.toFloat()
    val a : Float = altura.toFloat()

    return  (a * b) / 2
}