package com.example.appkotlin1.ejercicio5

fun ejer5() {
    var hora: Int?
    do {
        print("Ingrese la hora actual (en formato de 24 horas): ")
        hora = readLine()?.toIntOrNull()?:-1

        if(hora < 0 || hora > 24){
            println("digite una hora valida")
        }
    }while(hora!! < 0 || hora > 24)


    when (hora) {
        in 6..12 -> println("Buenos días")
        in 13..20 -> println("Buenas tardes")
        else -> println("Buenas noches")
    }
}