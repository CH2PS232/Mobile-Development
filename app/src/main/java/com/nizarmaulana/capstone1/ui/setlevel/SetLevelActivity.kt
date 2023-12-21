package com.nizarmaulana.capstone1.ui.setlevel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.nizarmaulana.capstone1.R
import com.nizarmaulana.capstone1.ui.day.DayActivity

class SetLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_level)

        val cardvieweasy = findViewById<CardView>(R.id.cvleveleasy)
        val cardviewmedium = findViewById<CardView>(R.id.cvlevelmedium)
        val cardViewhard = findViewById<CardView>(R.id.cvlevelhard)

        cardvieweasy.setOnClickListener(){
            val intent = Intent(this, DayActivity::class.java)
            startActivity(intent)
        }

        cardviewmedium.setOnClickListener(){
            val intent = Intent(this, DayActivity::class.java)
            startActivity(intent)
        }

        cardViewhard.setOnClickListener(){
            val intent = Intent(this, DayActivity::class.java)
            startActivity(intent)
        }
    }
}