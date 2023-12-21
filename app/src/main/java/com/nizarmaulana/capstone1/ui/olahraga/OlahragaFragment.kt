package com.nizarmaulana.capstone1.ui.olahraga

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider
import com.nizarmaulana.capstone1.R

class OlahragaFragment : Fragment() {

    private lateinit var countDownViewModel1: CountDownViewModel1
    private lateinit var countDownViewModel2: CountDownViewModel2
    private lateinit var tvCountDown1: TextView
    private lateinit var tvCountDown2: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_olahraga, container, false)

        countDownViewModel1 = ViewModelProvider(this).get(CountDownViewModel1::class.java)
        countDownViewModel2 = ViewModelProvider(this).get(CountDownViewModel2::class.java)

        val checkBox1: CheckBox = view.findViewById(R.id.checkBox1)
        val checkBox2: CheckBox = view.findViewById(R.id.checkBox2)
        val checkBox3: CheckBox = view.findViewById(R.id.checkBox3)
        val cardView1: CardView = view.findViewById(R.id.cardView1)
        val cardView2: CardView = view.findViewById(R.id.cardView2)

        tvCountDown1 = view.findViewById(R.id.tv_count_down1)
        tvCountDown2 = view.findViewById(R.id.tv_count_down2)

        checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
        checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
        checkBox3.buttonTintList = resources.getColorStateList(R.color.warna_hijau)

        checkBox1.setOnClickListener {
            val isChecked = checkBox1.isChecked

            if (isChecked) {
                checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            } else {
                checkBox1.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            }
        }

        checkBox2.setOnClickListener {
            val isChecked = checkBox2.isChecked

            if (isChecked) {
                checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            } else {
                checkBox2.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            }
        }

        checkBox3.setOnClickListener {
            val isChecked = checkBox3.isChecked

            if (isChecked) {
                checkBox3.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            } else {
                checkBox3.buttonTintList = resources.getColorStateList(R.color.warna_hijau)
            }
        }

        cardView1.setOnClickListener {
            if (countDownViewModel1.isTimerRunning()) {
                countDownViewModel1.stopCountdown()
                tvCountDown1.text = "10:00"
            } else {
                val initialTimeMillis: Long = 10 * 60 * 1000
                countDownViewModel1.resetCountdown()
                countDownViewModel1.setInitialTime(initialTimeMillis)
                countDownViewModel1.startTimer()
                countDownViewModel1.currentTimeString.observe(viewLifecycleOwner) {
                    tvCountDown1.text = it
                }
            }
        }

        cardView2.setOnClickListener {
            if (countDownViewModel2.isTimerRunning()) {
                countDownViewModel2.stopCountdown()
                tvCountDown2.text = "02:00"
            } else {
                val initialTimeMillis: Long = 2 * 60 * 1000
                countDownViewModel2.resetCountdown()
                countDownViewModel2.setInitialTime(initialTimeMillis)
                countDownViewModel2.startTimer()
                countDownViewModel2.currentTimeString.observe(viewLifecycleOwner) {
                    tvCountDown2.text = it
                }
            }
        }

        return view

    }
}