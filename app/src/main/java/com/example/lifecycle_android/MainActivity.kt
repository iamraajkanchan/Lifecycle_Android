package com.example.lifecycle_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MainActivity : AppCompatActivity() {
    private lateinit var observer: MainActivityObserver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observer = MainActivityObserver()
        lifecycle.addObserver(observer)
        Log.d("Main", "Main - onCreate")
        addDefaultLifeCycleObserver()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main", "Main - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "Main - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "Main - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "Main - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main", "Main - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "Main - onDestroy")
    }

    private fun addDefaultLifeCycleObserver() {
        val defaultLifecycleObserver = object : DefaultLifecycleObserver {
            override fun onCreate(owner: LifecycleOwner) {
                super.onCreate(owner)
                Log.d("Main", "DefaultLifecycleObserver - onCreate")
            }
        }
        lifecycle.addObserver(defaultLifecycleObserver)
    }
}
