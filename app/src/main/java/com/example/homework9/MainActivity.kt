package com.example.homework9

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var tvInFirstActivity: TextView? = null
    private var spInFirstActivity: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }
    private fun initView() {
      spInFirstActivity = findViewById<Spinner>(R.id.spInFirstActivity)
      tvInFirstActivity = findViewById<TextView>(R.id.tvInFirstActivity)
    }


   }


    }