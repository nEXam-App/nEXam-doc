package com.example.nexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.os.CountDownTimer
import java.text.DecimalFormat
import java.text.NumberFormat

class TimerActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val counttime = findViewById<TextView>(R.id.countTime)
        object : CountDownTimer(50000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val f: NumberFormat = DecimalFormat("00")
                val hour = millisUntilFinished / 3600000 % 24
                val min = millisUntilFinished / 60000 % 60
                val sec = millisUntilFinished / 1000 % 60
                counttime.text = f.format(hour) + ":" + f.format(min) + ":" + f.format(sec)
                counter++
            }

            override fun onFinish() {
                counttime.text = "00:00:00"
            }
        }.start()
    }
}