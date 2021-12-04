package com.example.nexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exam_view)

        val examListView = findViewById<ListView>(R.id.content_list)
        examListView.adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,resources.getStringArray(R.array.test_content))


    }
}