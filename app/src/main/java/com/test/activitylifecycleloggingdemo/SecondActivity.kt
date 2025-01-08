package com.test.activitylifecycleloggingdemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this::class.simpleName,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.simpleName,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this::class.simpleName,"onPause")
    }

    override fun onStop() {
        Log.d(this::class.simpleName,"onStop")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this::class.simpleName,"onRestart")
    }

    override fun onDestroy() {
        Log.d(this::class.simpleName,"onDestroy")
        super.onDestroy()
    }
}