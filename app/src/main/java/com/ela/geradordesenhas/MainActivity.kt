package com.ela.geradordesenhas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ela.geradordesenhas.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val alfabeto = arrayOf(
        "A","B","C","D","E","F","G","H",
        "I","J","K","L","M","N","O","P","Q","R",
        "S","T","U","V", "W","X","Y","Z")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btGerarSenha.setOnClickListener{
            gerarSenhaAleatoria()
        }
    }
    private fun gerarSenhaAleatoria(){
        val primeiraLetra=(alfabeto.indices).random()
        val segundaLetra=(alfabeto.indices).random()

        val letraAleatoria1 = alfabeto[primeiraLetra]
        val letraAleatoria2 = alfabeto[segundaLetra]

        val numerosAleatorios = Random
        val numeros = numerosAleatorios.nextInt(9999)

        binding.txtSenha.text = "$letraAleatoria1$letraAleatoria2-$numeros"
    }
}