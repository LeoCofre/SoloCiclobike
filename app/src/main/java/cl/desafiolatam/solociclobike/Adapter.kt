package cl.desafiolatam.solociclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CiclobikeViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val tvCiclovia: TextView
    val tvComuna: TextView

    init {
        tvCiclovia = itemView.tvCiclovia
        tvComuna= itemView.tvComuna
    }

}

class CicloAdapter (val lista: List<Ciclovia>) : RecyclerView.Adapter<CiclobikeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CiclobikeViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CiclobikeViewHolder(itemView = view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CiclobikeViewHolder, position: Int) {
        val ciclovia = lista[position]
        holder.tvComuna.text = ciclovia.comuna
        holder.tvCiclovia.text = ciclovia.nombre
    }

}