package com.example.whatsapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R

class PanggilanAdapter: RecyclerView.Adapter<PanggilanAdapter.PanggilanViewHolder>() {

    private val namaPanggilan = arrayOf(
            "Rika Yulianti",
            "Wahyu Deva",
            "Wahyu Eka",
            "Wahyu Deva",
            "Wahyu Eka",
            "Wahyu Deva",
            "Wahyu Eka",
            "Wahyu Deva",
            "Wahyu Eka",
            "Putu Subagia"
    )

    private val pesanPanggilan = arrayOf(
            "30 Mei 20.10",
            "Hari ini 12.24",
            "Hari ini 14.14",
            "Hari ini 13.14",
            "Hari ini 15.54",
            "Hari ini 16.34",
            "Hari ini 11.24",
            "Hari ini 19.44",
            "Kemarin 11.22",
            "30 Mei 11.11"
    )

    private val gambarPanggilan = intArrayOf(
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4
    )

    private val logPanggilan = intArrayOf(
            R.drawable.call_masuk,
            R.drawable.call_masuk,
            R.drawable.call_gagal,
            R.drawable.call_masuk,
            R.drawable.call_masuk,
            R.drawable.call_gagal,
            R.drawable.call_gagal,
            R.drawable.call_gagal,
            R.drawable.call_gagal,
            R.drawable.call_masuk
    )
    class PanggilanViewHolder(panggilanView: View): RecyclerView.ViewHolder(panggilanView) {
        var itemNamaPanggilan: TextView
        var itemWaktuPanggilan: TextView
        var itemGambarPanggilan: ImageView
        var logPanggilan: ImageView

        init{
            itemNamaPanggilan = panggilanView.findViewById(R.id.namaPanggilan)
            itemWaktuPanggilan = panggilanView.findViewById(R.id.waktuPanggilan)
            itemGambarPanggilan = panggilanView.findViewById(R.id.gambarPanggilan)
            logPanggilan = panggilanView.findViewById(R.id.logPanggilan)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PanggilanViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.row_panggilan, parent, false)
        return PanggilanViewHolder(v)
    }

    override fun onBindViewHolder(holder: PanggilanViewHolder, position: Int) {
        holder.itemNamaPanggilan.text = namaPanggilan[position]
        holder.itemWaktuPanggilan.text = pesanPanggilan[position]
        holder.itemGambarPanggilan.setImageResource(gambarPanggilan[position])
        holder.logPanggilan.setImageResource(logPanggilan[position])
    }

    override fun getItemCount(): Int {
        return namaPanggilan.size
    }
}