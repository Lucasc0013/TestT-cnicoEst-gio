package com.example.testtecnicoestagio

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        result()
    }

    private fun result(){
        val indice = 12
        var soma = 0
        var k = 1

        while (k < indice){

            k += 1;
            soma += k

        }
       Log.i("test","$soma")
    }
}