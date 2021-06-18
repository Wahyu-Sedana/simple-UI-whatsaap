package com.example.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R

class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ListViewHolder>() {

    private val nama = arrayOf(
        "Rika Yulianti",
        "Wahyu Deva",
        "Wahyu Eka",
        "Putu Subagia"
    )

    private val pesan = arrayOf(
        "Gausah bacot anjeng",
        "Ajarin dong buat ui",
        "Biasalah",
        "Aku ingin mengatakan bahwa aku lagi berbicara"
    )

    private val gambar = intArrayOf(
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar3,
        R.drawable.gambar4
    )
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var itemNama: TextView
        var itemPesan: TextView
        var itemGambar: ImageView

        init{
            itemNama = itemView.findViewById(R.id.nama)
            itemPesan = itemView.findViewById(R.id.pesan)
            itemGambar = itemView.findViewById(R.id.gambar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.row_chat, parent, false)
        return ListViewHolder(v)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemNama.text = nama[position]
        holder.itemPesan.text = pesan[position]
        holder.itemGambar.setImageResource(gambar[position])
    }

    override fun getItemCount(): Int {
        return gambar.size
    }
}