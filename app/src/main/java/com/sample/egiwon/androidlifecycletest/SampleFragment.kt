package com.sample.egiwon.androidlifecycletest

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SampleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("SampleEgiwon", "SampleFragment - onCreateView")
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("SampleEgiwon", "SampleFragment - onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("SampleEgiwon", "SampleFragment - onViewCreated")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("SampleEgiwon", "SampleFragment - onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("SampleEgiwon", "SampleFragment - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SampleEgiwon", "SampleFragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SampleEgiwon", "SampleFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SampleEgiwon", "SampleFragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SampleEgiwon", "SampleFragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SampleEgiwon", "SampleFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SampleEgiwon", "SampleFragment - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("SampleEgiwon", "SampleFragment - onDetach")
    }


}