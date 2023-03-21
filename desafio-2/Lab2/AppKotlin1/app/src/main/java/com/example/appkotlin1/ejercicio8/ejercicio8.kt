package com.example.appkotlin1.ejercicio8

fun ejer8(){
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

    val salarioSemanal = calcularSalarioSemanal(horasTrabajadas)
    println("El salario semanal del trabajador es: \$$salarioSemanal")
}

fun calcularSalarioSemanal(horasTrabajadas: Int): Int {
    // Calcular las horas ordinarias y las horas extra
    val horasOrdinarias = if (horasTrabajadas <= 40) horasTrabajadas else 40
    val horasExtra = if (horasTrabajadas > 40) horasTrabajadas - 40 else 0

    // Calcular el salario correspondiente a las horas ordinarias y a las horas extra
    val salarioHorasOrdinarias = horasOrdinarias * 12
    val salarioHorasExtra = horasExtra * 16

    // Calcular el salario semanal total
    val salarioSemanal = salarioHorasOrdinarias + salarioHorasExtra

    // Retornar el salario semanal
    return salarioSemanal
}