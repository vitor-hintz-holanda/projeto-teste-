package br.com.alura.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.activity.Product
class ListaProdutosAdapter (
    private val context: Context,
    private val product: List<Product>
): RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(product: Product) {
          val name =  itemView.findViewById<TextView>(R.id.name)
              name.text = product.name
            val description = itemView.findViewById<TextView>(R.id.description)
            description.text = product.description
            val value = itemView.findViewById<TextView>(R.id.value)
            value.text = product.value.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.activity_product_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = product [position]
        holder.vincula(product)
    }

    override fun getItemCount(): Int = product.size


}



                
