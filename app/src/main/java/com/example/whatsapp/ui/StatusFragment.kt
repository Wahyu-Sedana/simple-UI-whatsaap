package com.example.whatsapp.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R
import com.example.whatsapp.ui.adapter.ChatAdapter
import com.example.whatsapp.ui.adapter.StatusAdapter

class StatusFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<StatusAdapter.ViewHolder>? = null
    private lateinit var rowStatus: RecyclerView
    override fun onViewCreated(itemStatus: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemStatus,savedInstanceState)

        rowStatus = itemStatus.findViewById(R.id.rowStatus)
        rowStatus.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = StatusAdapter()
        }
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_status,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}