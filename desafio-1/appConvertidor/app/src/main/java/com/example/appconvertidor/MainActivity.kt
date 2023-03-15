package com.example.appconvertidor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.appconvertidor.models.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val medida = Medidas()
        var convert : conversion

        //--Obteniendo Datos
        val rbgOrigen : RadioGroup = findViewById(R.id.rbgMedidaOrigen)
        val rbgDestino : RadioGroup = findViewById(R.id.rbgMedidaDestino)
        val num : EditText = findViewById(R.id.editTextNumberDecimal)
        val btnConvertir = findViewById<Button>(R.id.btnConvertir)
        val result  = findViewById<TextView>(R.id.tvResult)

        //Limpiando el texto de resultado
        result.text = ""

        btnConvertir.setOnClickListener {

            //Comprobando que el numero
            if(num.text.isEmpty()){
                Toast.makeText(applicationContext, "Debe haber un numero el cual convertir", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val number:Float = num.text.toString().toFloat()

            //Selecionando la posicion de los radiobutton
            val indexOrigen = medida.findCheckRBId(rbgOrigen)
            val indexDestino = medida.findCheckRBId(rbgDestino)

            if(indexDestino == -1 || indexOrigen == -1){
                Toast.makeText(applicationContext, "Debe seleccionar la medida origen y destino para poder convertir", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            //Convirtiendo de medida origen a destino
            when (indexOrigen){
                0 -> {
                    convert = Kilometro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
                1 -> {
                    convert = Metro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
                2 -> {
                    convert = Centimetro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
            }

        }


    }
}