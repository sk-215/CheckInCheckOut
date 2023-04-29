package com.example.checkincheckout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvTxt:TextView=findViewById(R.id.tvTxt)
        var cnt=0
        val plusCounter:Button=findViewById(R.id.plusCount)
        val minCounter:Button=findViewById(R.id.minCount)
        val reset:Button=findViewById(R.id.resetCount)
        plusCounter.setOnClickListener {
            cnt+=1
            tvTxt.text=cnt.toString()
        }
        minCounter.setOnClickListener {
            cnt-=1
            tvTxt.text=cnt.toString()
        }
        reset.setOnClickListener {
            cnt=0
            tvTxt.text=cnt.toString()
        }
    }
}