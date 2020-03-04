package com.sample.egiwon.androidlifecycletest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rotation.*

class RotationActivity : AppCompatActivity() {

    private var stateCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotation)

        tv_state.text = stateCount.toString()

        Log.e("SampleEgiwon", "RotationActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SampleEgiwon", "RotationActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SampleEgiwon", "RotationActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SampleEgiwon", "RotationActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SampleEgiwon", "RotationActivity - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SampleEgiwon", "RotationActivity - onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SampleEgiwon", "RotationActivity - onRestart")
    }
}