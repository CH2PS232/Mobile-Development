package com.nizarmaulana.capstone1.ui.olahraga

import android.os.CountDownTimer
import android.text.format.DateUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class CountDownViewModel1 : ViewModel() {
    private var timer: CountDownTimer? = null
    private var isCountdownStopped = true

    private val initialTime = MutableLiveData<Long>()
    private val currentTime = MutableLiveData<Long>()

    val currentTimeString: LiveData<String> = currentTime.map { time ->
        DateUtils.formatElapsedTime(time / 1000)
    }

    private val _eventCountDownFinish = MutableLiveData<Boolean>()
    val eventCountDownFinish: LiveData<Boolean> = _eventCountDownFinish

    fun setInitialTime(initialTimeMillis: Long) {
        initialTime.value = initialTimeMillis
        currentTime.value = initialTimeMillis

        timer = object : CountDownTimer(initialTimeMillis, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                currentTime.value = millisUntilFinished
            }

            override fun onFinish() {
                resetTimer()
            }
        }
    }

    fun startTimer() {
        timer?.start()
    }

    fun resetTimer() {
        timer?.cancel()
        currentTime.value = 0
        _eventCountDownFinish.value = true
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }

    fun isTimerRunning(): Boolean {
        return timer != null && !isCountdownStopped
    }

    fun stopCountdown() {
        isCountdownStopped = true
        resetTimer()
    }

    fun resetCountdown() {
        isCountdownStopped = false
        resetTimer()
    }

    fun getInitialTime() = initialTime.value
}