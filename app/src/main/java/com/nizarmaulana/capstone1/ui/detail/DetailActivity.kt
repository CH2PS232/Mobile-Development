package com.nizarmaulana.capstone1.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nizarmaulana.capstone1.R
import com.nizarmaulana.capstone1.adapter.TabPagerAdapter

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dayName = intent.getStringExtra("dayName")

        val textView: TextView = findViewById(R.id.tvDayName)
        textView.text = dayName

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val tabs: TabLayout = findViewById(R.id.tabs)

        val pagerAdapter = TabPagerAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Pola Makan"
                1 -> tab.text = "Pola Olahraga"
            }
        }.attach()
    }
}