package com.example.testtecnicoestagio

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val num = 50
        logFibonacciCheck(num)


    }

    private fun isFibonacci(num: Int): Boolean {
        var a = 0
        var b = 1

        if (num == 0 || num == 1) return true

        for (i in 2..num) {
            val tmp = a + b
            a = b
            b = tmp

            Log.i("", "$b")

            if (b == num) {
                return true
            }

            if (b > num) {
                return false
            }
        }

        return false
    }

    private fun logFibonacciCheck(num: Int) {
        if (isFibonacci(num)) {
            Log.i("test", "$num pertence à sequência de Fibonacci.")
        } else {
            Log.i("test", "$num NÃO pertence à sequência de Fibonacci.")
        }
    }

}