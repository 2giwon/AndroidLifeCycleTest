package com.sample.egiwon.androidlifecycletest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun onShowActivity(view: View) {
        startActivity(Intent(this, RotationActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("SampleEgiwon", "MainActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SampleEgiwon", "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SampleEgiwon", "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SampleEgiwon", "MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SampleEgiwon", "MainActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SampleEgiwon", "MainActivity - onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SampleEgiwon", "MainActivity - onRestart")
    }
}
