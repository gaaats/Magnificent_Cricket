package com.generamobile.head.frjrfjirfjirffrhfrhy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.head.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}