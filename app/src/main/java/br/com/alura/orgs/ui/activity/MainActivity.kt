package br.com.alura.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //region Views
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        //endregion

        recyclerView.layoutManager = LinearLayoutManager(
            baseContext,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerView.adapter = ListaProdutosAdapter(
            context = baseContext,
            product = listOf(
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
    }
}