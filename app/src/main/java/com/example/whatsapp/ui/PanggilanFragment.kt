package com.example.whatsapp.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.ui.adapter.ChatAdapter
import com.example.whatsapp.ui.adapter.PanggilanAdapter

class PanggilanFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<PanggilanAdapter.PanggilanViewHolder>? = null
    private lateinit var rowPanggilan: RecyclerView
    override fun onViewCreated(panggilanView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(panggilanView, savedInstanceState)

        rowPanggilan =panggilanView.findViewById(R.id.rowPanggilan)
        rowPanggilan.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = PanggilanAdapter()
        }
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_panggilan, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_panggilan, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}