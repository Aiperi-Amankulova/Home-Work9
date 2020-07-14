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
        setupSpinner()
        goToTextView()
    }
    private fun initView() {
      spInFirstActivity = findViewById<Spinner>(R.id.spInFirstActivity)
      tvInFirstActivity = findViewById<TextView>(R.id.tvInFirstActivity)
    }

   private fun setupSpinner() {
        val adapter =  ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spInFirstActivity?.adapter = adapter
    }
   private fun goToTextView() {
          spInFirstActivity?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
         override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                parent.getItemAtPosition(position).toString()
             val selectedItem = parent.getItemAtPosition(position).toString()
             tvInFirstActivity?.text= selectedItem.toString()
         }

              override fun onNothingSelected(parent: AdapterView<*>?) {}
          }
   }


    }