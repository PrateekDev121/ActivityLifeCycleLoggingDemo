package com.test.activitylifecycleloggingdemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test.activitylifecycleloggingdemo.ui.theme.ActivityLifecycleLoggingDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this::class.simpleName, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.simpleName, "onStart")
        val intent = Intent(this, SecondActivity::class.java)
        setContent {

            MainActivityScreen(call = { startActivity(intent) })
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.simpleName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this::class.simpleName, "onPause")
    }

    override fun onStop() {
        Log.d(this::class.simpleName, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this::class.simpleName, "onRestart")
    }

    override fun onDestroy() {
        Log.d(this::class.simpleName, "onDestroy")
        super.onDestroy()
    }
}


@Composable
fun MainActivityScreen(call: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {

        Button(onClick = call) {
            Text(text = "launch second activity")
        }
    }
}