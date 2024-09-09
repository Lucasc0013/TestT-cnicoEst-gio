package com.example.testtecnicoestagio

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val name = "Lucas cavalcante"
        result(name)
    }

    private fun counter(name: String): Int =
        name.count { it.equals('a', ignoreCase = true) }

    private fun result(name: String) {
        val counter = counter(name)

        val message =
            when {
                counter > 0 -> "A letra 'a' aparece $counter vezes na string"
                else -> "A letra 'a' não aparece na string"
            }

        Log.i("test", message)
    }


}