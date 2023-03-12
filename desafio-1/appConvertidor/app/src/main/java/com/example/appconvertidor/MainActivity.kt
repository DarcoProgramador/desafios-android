package com.example.appconvertidor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.appconvertidor.models.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val medida = Medidas()

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
                val alerta = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Debe haber un numero el cual convertir")
                alerta.show()
                return@setOnClickListener
            }

            val number:Float = num.text.toString().toFloat()

            //Selecionando la posicion de los radiobutton
            val indexOrigen = medida.findCheckRBId(rbgOrigen)
            val indexDestino = medida.findCheckRBId(rbgDestino)

            if(indexDestino == -1 || indexOrigen == -1){
                val alerta = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Debe seleccionar la medida origen y destino para poder convertir")
                alerta.show()
                return@setOnClickListener
            }

            //Convirtiendo de medida origen a destino
            when (indexOrigen){
                0 -> {
                    val convert : conversion = Kilometro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
                1 -> {
                    val convert : conversion = Metro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
                2 -> {
                    val convert : conversion = Centimetro()
                    val numComvert:Float = convert.conversion(number, medida.medidas[indexDestino]!!)
                    result.text = "$numComvert ${medida.nomMedida(indexDestino)}"
                }
            }

        }


    }
}