package com.calculadora.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var visor: TextView
    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var botaoSoma: Button
    lateinit var botaoSubtracao: Button
    lateinit var botaoDivisao: Button
    lateinit var botaoMultiplicacao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        visor = findViewById(R.id.textView2)
        num1 = findViewById(R.id.campo1)
        num2 = findViewById(R.id.campo2)
        botaoSoma = findViewById(R.id.btnSoma)
        botaoSubtracao = findViewById(R.id.btnSubtracao)
        botaoDivisao = findViewById(R.id.btnDivisao)
        botaoMultiplicacao = findViewById(R.id.btnMultiplicacao)

        botaoSoma.setOnClickListener() {
            var soma = num1.text.toString().toInt() + num2.text.toString().toInt()
            visor.text = soma.toString()
        }

        botaoSubtracao.setOnClickListener() {
            var subtracao = num1.text.toString().toInt() - num2.text.toString().toInt()
            visor.text = subtracao.toString()
        }

        botaoMultiplicacao.setOnClickListener(){
            var multiplicacao = num1.text.toString().toInt() * num2.text.toString().toInt()
            visor.text = multiplicacao.toString()
        }

        botaoDivisao.setOnClickListener(){
            var divisao = num1.text.toString().toInt() / num2.text.toString().toInt()
            visor.text = divisao.toString()
        }
    }
}