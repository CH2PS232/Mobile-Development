package com.nizarmaulana.capstone1.ui.day

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nizarmaulana.capstone1.R
import com.nizarmaulana.capstone1.adapter.DayAdapter
import com.nizarmaulana.capstone1.data.Day

class DayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day)

        // Data dummy
        val dayList = listOf(
            Day("Day 1"),
            Day("Day 2"),
            Day("Day 3"),
            Day("Day 4"),
            Day("Day 5"),
            Day("Day 6"),
            Day("Day 7"),
            Day("Day 8"),
            Day("Day 9")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = DayAdapter(dayList)
        recyclerView.adapter = adapter
    }
}