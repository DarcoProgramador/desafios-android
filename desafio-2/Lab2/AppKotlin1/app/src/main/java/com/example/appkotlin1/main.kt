package com.example.appkotlin1

import com.example.appkotlin1.ejercicio1.ejer1
import com.example.appkotlin1.ejercicio10.ejer10
import com.example.appkotlin1.ejercicio11.ejer11
import com.example.appkotlin1.ejercicio12.ejer12
import com.example.appkotlin1.ejercicio13.ejer13
import com.example.appkotlin1.ejercicio14.ejer14
import com.example.appkotlin1.ejercicio15.ejer15
import com.example.appkotlin1.ejercicio16.ejer16
import com.example.appkotlin1.ejercicio17.ejer17
import com.example.appkotlin1.ejercicio18.ejer18
import com.example.appkotlin1.ejercicio19.ejer19
import com.example.appkotlin1.ejercicio2.ejer2
import com.example.appkotlin1.ejercicio20.ejer20
import com.example.appkotlin1.ejercicio21.ejer21
import com.example.appkotlin1.ejercicio22.ejer22
import com.example.appkotlin1.ejercicio3.ejer3
import com.example.appkotlin1.ejercicio4.ejer4
import com.example.appkotlin1.ejercicio5.ejer5
import com.example.appkotlin1.ejercicio6.ejer6
import com.example.appkotlin1.ejercicio7.ejer7
import com.example.appkotlin1.ejercicio8.ejer8
import com.example.appkotlin1.ejercicio9.ejer9

fun main() {
    when(menu()) {
        1 -> ejer1()
        2 -> ejer2()
        3 -> ejer3()
        4 -> ejer4()
        5 -> ejer5()
        6 -> ejer6()
        7 -> ejer7()
        8 -> ejer8()
        9 -> ejer9()
        10 -> ejer10()
        11 -> ejer11()
        12 -> ejer12()
        13 -> ejer13()
        14 -> ejer14()
        15 -> ejer15()
        16 -> ejer16()
        17 -> ejer17()
        18 -> ejer18()
        19 -> ejer19()
        20 -> ejer20()
        21 -> ejer21()
        22 -> ejer22()
        else -> println("Opción inválida")
    }
}

fun menu(): Int {
    println("Selecciona una opción:")
    println("1. Ejercicio 1")
    println("2. Ejercicio 2")
    println("3. Ejercicio 3")
    println("4. Ejercicio 4")
    println("5. Ejercicio 5")
    println("6. Ejercicio 6")
    println("7. Ejercicio 7")
    println("8. Ejercicio 8")
    println("9. Ejercicio 9")
    println("10. Ejercicio 10")
    println("11. Ejercicio 11")
    println("12. Ejercicio 12")
    println("13. Ejercicio 13")
    println("14. Ejercicio 14")
    println("15. Ejercicio 15")
    println("16. Ejercicio 16")
    println("17. Ejercicio 17")
    println("18. Ejercicio 18")
    println("19. Ejercicio 19")
    println("20. Ejercicio 20")
    println("21. Ejercicio 21")
    println("22. Ejercicio 22")
    print("Escriba su seleccion: ")
    return readLine()?.toIntOrNull() ?: 0
}