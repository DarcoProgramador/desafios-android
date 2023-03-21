package com.example.appkotlin1.ejercicio19

class Persona(val nombres: String, val apellidos: String, val cedula: String, val sexo: Char, val añoNacimiento: Int) {
    fun verAtributos(){
        println("Nombres: $nombres")
        println("Apellidos: $apellidos")
        println("Cedula: $cedula")
        println("Sexo: $sexo")
        println("Año de nacimiento: $añoNacimiento")
    }
}