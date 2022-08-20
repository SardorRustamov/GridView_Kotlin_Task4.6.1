package com.example.gridviewkotlintask_461

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var iconName = arrayOf("icon1", "icon2", "icon3",
        "icon4", "icon5", "icon6", "icon7", "icon8", "icon9")

    private var iconImage = intArrayOf(R.drawable.ic_baseline_mood_bad_24,
        R.drawable.ic_baseline_hourglass_empty,
        R.drawable.ic_baseline_mood_bad_24,
        R.drawable.ic_baseline_insert_emoticon_24,
        R.drawable.ic_baseline_run_circle_24,
        R.drawable.ic_baseline_self_improvement_24,
        R.drawable.ic_baseline_person_24,
        R.drawable.ic_baseline_hourglass_empty,
        R.drawable.ic_baseline_insert_emoticon_24)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        val mainAdapter = AdapterC(this, iconName, iconImage)
        gridView.adapter = mainAdapter
    }
}