package com.nizarmaulana.capstone1.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.nizarmaulana.capstone1.R
import com.nizarmaulana.capstone1.ui.setlevel.SetLevelActivity

class MainActivity : AppCompatActivity() {

    private var selectedGender: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDropdownGender()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val beratBadan = findViewById<TextInputEditText>(R.id.editTextBeratBadan).text.toString()
            val tinggiBadan = findViewById<TextInputEditText>(R.id.editTextTinggiBadan).text.toString()
            val usia = findViewById<TextInputEditText>(R.id.editTextUsia).text.toString()

            if (selectedGender.isNullOrBlank() || beratBadan.isNullOrBlank() || tinggiBadan.isNullOrBlank() || usia.isNullOrBlank()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                val message =
                    "Your Status Is Ideal"
//                    "Selected Gender: $selectedGender\nBerat Badan: $beratBadan\nTinggi Badan: $tinggiBadan\nUsia: $usia"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                val intent = Intent(this, SetLevelActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun setupDropdownGender() {
        val itemsGender = listOf("Male", "Female")
        val autoComplete: AutoCompleteTextView = findViewById(R.id.ac_gender)
        val adapterGender = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, itemsGender)

        autoComplete.setAdapter(adapterGender)
        autoComplete.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            selectedGender = adapterView.getItemAtPosition(i).toString()
        }
}
}