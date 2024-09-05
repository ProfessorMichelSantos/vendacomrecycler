package com.aula.vendacomrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val dataList: List<Venda>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    // Define o ViewHolder que descreve cada item
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle: TextView = view.findViewById(R.id.itemTitle)
        val itemSubtitle: TextView = view.findViewById(R.id.itemSubtitle)
    }

    // Infla o layout para os itens da lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    // Vincula os dados a cada item da lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.itemTitle.text = item.descricaovenda
        holder.itemSubtitle.text = item.produtovendido
    }

    // Retorna o número total de itens na lista
    override fun getItemCount(): Int {
        return dataList.size
    }
}