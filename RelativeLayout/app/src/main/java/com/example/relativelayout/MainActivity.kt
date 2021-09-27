package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editNome: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.i("LIFE_CYCLE", "Oncreate")

        //usando variável
        //var x = 10 (forma mais usada)
        // ou
        // var x: Int = 10
        // para usar a variável depois
        // x =10

        val buttonOK = findViewById<Button>(R.id.button_Ok)
        val editNome =findViewById<EditText>(R.id.edit_nome)
        val editPassword = findViewById<EditText>(R.id.edit_password)

        buttonOK.setOnClickListener {

        }

    }

    override fun onStart(){
        super.onStart()
        Log.i("LIFE_CYCLE", "OnStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFE_CYCLE", "OnPause")

    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFE_CYCLE", "OnResume")

    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFE_CYCLE", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFE_CYCLE", "OnDestroy")

    }
    fun validar(){

    }
}