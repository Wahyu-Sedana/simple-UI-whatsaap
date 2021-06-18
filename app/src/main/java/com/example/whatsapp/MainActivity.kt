package com.example.whatsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewpager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabsLayout)
        viewpager = findViewById(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("Chat"))
        tabLayout.addTab(tabLayout.newTab().setText("Status"))
        tabLayout.addTab(tabLayout.newTab().setText("Panggilan"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = TabAdapter(this, supportFragmentManager, tabLayout.tabCount)
        viewpager.adapter = adapter
        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpager.currentItem = tab!!.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }
}