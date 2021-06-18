package com.example.whatsapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.whatsapp.ui.CameraFragment
import com.example.whatsapp.ui.ChatFragment
import com.example.whatsapp.ui.PanggilanFragment
import com.example.whatsapp.ui.StatusFragment

class TabAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
//            0 -> {
//                CameraFragment()
//            }
            0 -> {
                ChatFragment()
            }
            1 -> {
                StatusFragment()
            }
            2 -> {
                PanggilanFragment()
            }
            else -> getItem(position)
        }
    }
}