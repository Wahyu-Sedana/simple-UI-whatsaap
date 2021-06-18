package com.example.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R

class StatusAdapter: RecyclerView.Adapter<StatusAdapter.ViewHolder>() {

    private val namaUplod = arrayOf(
            "Rika Yulianti",
            "Wahyu Deva",
            "Wahyu Eka",
            "Putu Subagia"
    )

    private val pesanUplod = arrayOf(
            "Hari ini pukul 11.00",
            "Hari ini pukul 12.00",
            "Hari ini pukul 13.00",
            "Hari ini pukul 14.00"
    )

    private val gambarUplod = intArrayOf(
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4
    )
    class ViewHolder(itemStatus: View): RecyclerView.ViewHolder(itemStatus) {
        var itemUplodNama: TextView
        var itemUplodWaktu: TextView
        var itemUplodGambar: ImageView

        init{
            itemUplodNama = itemStatus.findViewById(R.id.namaUplod)
            itemUplodWaktu = itemStatus.findViewById(R.id.pesanUplod)
            itemUplodGambar = itemStatus.findViewById(R.id.gambarUplod)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.row_status, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemUplodNama.text = namaUplod[position]
        holder.itemUplodWaktu.text = pesanUplod[position]
        holder.itemUplodGambar.setImageResource(gambarUplod[position])
    }

    override fun getItemCount(): Int {
        return namaUplod.size
    }
}