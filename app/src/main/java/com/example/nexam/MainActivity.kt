package com.example.nexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import java.text.DecimalFormat
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    var counter = 0;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        loadView()

        //Start timer button -> open TimerActivity
        //var button: Button? = null
        //button = findViewById<View>(R.id.startTimer) as Button
        //button.setOnClickListener { openTimerActivity() }
    }

    public fun loadView() {
        registerButton(R.id.createExamButton, R.layout.create_exam)
        registerButton(R.id.back, R.layout.dashboard)
        registerButton(R.id.save, R.layout.exam_success)
        registerButton(R.id.toDashboard, R.layout.dashboard)
        registerButton(R.id.editExam, R.layout.create_exam)
        registerButton(R.id.showExam, R.layout.exam_view)
        fillList(R.id.exam_list, R.array.test_exams)
        fillList(R.id.content_list, R.array.test_content)
    }

    public fun registerButton(button: Int, view: Int) {
        val button = findViewById<Button>(button)
        if (button == null) return
        button.setOnClickListener(View.OnClickListener {
            setContentView(view)
            loadView()
        })
    }

    public fun fillList(list: Int, array: Int) {
        val examListView: ListView? = findViewById(list)
        if (examListView == null) return
        examListView.adapter =
            ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                resources.getStringArray(array)
            )

        examListView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                setContentView(R.layout.exam_view)
                loadView()
            }
    }

    fun openTimerActivity() {
        val intent = Intent(this, TimerActivity::class.java)
        startActivity(intent)
    }

    fun startTimeCounter(view: View) {
        val countTime: EditText = findViewById(R.id.countTime)
        //TODO take input as formated text
        //TODO exception handling
        //TODO stop timer instead of start timer
        val enteredTime:Long=countTime.text.toString().toLong()

        object : CountDownTimer(enteredTime, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val f: NumberFormat = DecimalFormat("00")
                val hour = millisUntilFinished / 3600000 % 24
                val min = millisUntilFinished / 60000 % 60
                val sec = millisUntilFinished / 1000 % 60
                countTime.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec))
                counter++

                countTime.isEnabled=false
            }

            override fun onFinish() {
                countTime.setText("00:00:00")
                countTime.isEnabled=true
            }
        }.start()


    }
}