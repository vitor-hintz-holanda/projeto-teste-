package br.com.alura.orgs.ui.activity

import  br.com.alura.orgs.R
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.activity_product_form) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botao = findViewById<Button>(R.id.botão)
        botao.setOnClickListener { //it: View!
            val campoNome = findViewById<EditText>(R.id.name)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.description)
            val descricao = campoDescricao.text.toString()
            val campoValor = findViewById<EditText>(R.id.value)
            val valorEmTexto = campoValor.text.toString()
            val valor = if (valorEmTexto.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(valorEmTexto)
            }

            val productNew = Product(
                name = nome,
                description = descricao,
                value = valor
            )
            Log.i("ProductForm", " onCreate: $productNew")
        }
    }
}