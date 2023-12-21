package com.nizarmaulana.capstone1.ui.makan

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.nizarmaulana.capstone1.R

class MakanFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_makan, container, false)

        // Temukan CheckBox
        val checkBox1: CheckBox = view.findViewById(R.id.checkBox1)
        val checkBox2: CheckBox = view.findViewById(R.id.checkBox2)

        // Set warna hijau secara langsung
        checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
        checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)

        // Tambahkan listener untuk menangani klik CheckBox1
        checkBox1.setOnClickListener {
            // Periksa apakah CheckBox1 dicentang atau tidak
            val isChecked = checkBox1.isChecked

            // Ubah warna CheckBox1 menjadi hijau jika dicentang, dan kembalikan ke warna awal jika tidak dicentang
            if (isChecked) {
                checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            } else {
                checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            }
        }

        // Tambahkan listener untuk menangani klik CheckBox2
        checkBox2.setOnClickListener {
            // Periksa apakah CheckBox2 dicentang atau tidak
            val isChecked = checkBox2.isChecked

            // Ubah warna CheckBox2 menjadi hijau jika dicentang, dan kembalikan ke warna awal jika tidak dicentang
            if (isChecked) {
                checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            } else {
                checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            }
        }

        return view
    }

}