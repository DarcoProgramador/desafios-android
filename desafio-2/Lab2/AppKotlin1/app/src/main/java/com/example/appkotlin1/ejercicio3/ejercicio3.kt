package com.example.appkotlin1.ejercicio3

fun ejer3() {
    val tarifaHora = 12
    var horasTrabajadas: Int

    do{
        print("Ingrese las horas trabajadas esta semana: ")
        horasTrabajadas = readLine()?.toIntOrNull() ?: -1

        if (horasTrabajadas > 168){
            println("No es posible trabajar mas de 168 horas en una semana, vuelva a digitar")
        }

        if (horasTrabajadas < 0){
            println("No es posible trabajar menos de 0 horas en una semana, vuelva a digitar")
        }
    }while (horasTrabajadas > 168 || horasTrabajadas < 0)

    val salario = tarifaHora * horasTrabajadas

    println("El salario semanal del colaborador es: $salario dólares")
}