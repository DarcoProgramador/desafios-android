package com.example.appconvertidor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.appconvertidor.models.Centimetro
import com.example.appconvertidor.models.conversion
import com.example.appconvertidor.models.Kilometro
import com.example.appconvertidor.models.Metro

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val medidas: Map<Int, String> = mapOf(
            0 to "kilometro",
            1 to "metro",
            2 to "centimetro"
        ).withDefault { "error" }

        //--Obteniendo Datos
        val rbgOrigen : RadioGroup = findViewById(R.id.rbgMedidaOrigen)
        val rbgDestino : RadioGroup = findViewById(R.id.rbgMedidaDestino)
        val num : EditText = findViewById(R.id.editTextNumberDecimal)
        val btnConvertir = findViewById<Button>(R.id.btnConvertir)
        val result  = findViewById<TextView>(R.id.tvResult)

        //Limpiando el texto de resultado
        result.text = ""

        btnConvertir.setOnClickListener {
            //Comprobando cual radiobutton esta activo
            val rbOrigenId = rbgOrigen.checkedRadioButtonId
            val rbDestinoId = rbgDestino.checkedRadioButtonId

            if (rbOrigenId == -1 || rbDestinoId == -1 ){
                val alerta = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Debe seleccionar la medida origen y destino para poder convertir")
                alerta.show()
                return@setOnClickListener
            }

            //Comprobando que el numero
            if(num.text.isEmpty()){
                val alerta = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Debe haber un numero el cual convertir")
                alerta.show()
                return@setOnClickListener
            }

            val number:Float = num.text.toString().toFloat()
            result.text = rbOrigenId.toString()

            //selecionando la posicion de los radiobutton
            val radioButtonOrigen = findViewById<RadioButton>(rbOrigenId)
            val radioButtonDestino = findViewById<RadioButton>(rbDestinoId)

            val indexOrigen = rbgOrigen.indexOfChild(radioButtonOrigen)
            val indexDestino = rbgDestino.indexOfChild(radioButtonDestino)

            //Convirtiendo de medida origen a destino
            when (indexOrigen){
                0 -> {
                    val convert : conversion = Kilometro()
                    val numComvert:Float = convert.conversion(number, medidas[indexDestino]!!)
                    result.text = "$numComvert KM"
                }
                1 -> {
                    val convert : conversion = Metro()
                    val numComvert:Float = convert.conversion(number, medidas[indexDestino]!!)
                    result.text = "$numComvert M"
                }
                2 -> {
                    val convert : conversion = Centimetro()
                    val numComvert:Float = convert.conversion(number, medidas[indexDestino]!!)
                    result.text = "$numComvert CM"
                }
            }

        }


    }
}