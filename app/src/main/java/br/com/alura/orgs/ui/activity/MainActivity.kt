package br.com.alura.orgs.ui.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal


class MainActivity : AppCompatActivity(R.layout.activity_product_item) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //    super.onCreate(savedInstanceState)
        val name = findViewById<AppCompatTextView>(R.id.name)
        name.text = "Cestas de frutas"
        val description = findViewById<AppCompatTextView>(R.id.description)
        description.text = "Laranja, manga e maçã"
        val value = findViewById<AppCompatTextView>(R.id.value)
        value.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, product = listOf(
                Product(
                    name = "teste",
                    description = "teste desc",
                    value = BigDecimal("19.99")
                ),
                Product(
                    name = "teste 1",
                    description = "teste desc 1 ",
                    value = BigDecimal("29.99")
                ),
                Product(
                    name = "teste 1",
                    description = "teste desc 2 ",
                    value = BigDecimal("39.99")
                )
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)



    }


}