package com.example.lifecycle_android

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateCallback() {
        Log.d("Main", "Observer - onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartCallBack() {
        Log.d("Main", "Observer - onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeCallback() {
        Log.d("Main", "Observer - onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseCallback() {
        Log.d("Main", "Observer - onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopCallback() {
        Log.d("Main", "Observer - onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyCallback() {
        Log.d("Main", "Observer - onDestroy")
    }
}