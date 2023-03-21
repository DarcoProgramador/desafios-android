package com.example.appkotlin1.ejercicio9

fun ejer9(){
    var i = 5 // Iniciamos con el número 5
    do {
        if (i % 5 == 0) { // Si es múltiplo de 5, lo imprimimos
            print("$i  ")
        }
        i++ // Aumentamos en 1 la variable de control
    } while (i <= 100) // Seguimos mientras i sea menor o igual que 100
}