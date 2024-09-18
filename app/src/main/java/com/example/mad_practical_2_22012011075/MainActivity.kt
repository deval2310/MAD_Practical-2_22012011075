package com.example.mad_practical_2_22012011075

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")
        showMessage("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
        showMessage("onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
        showMessage("onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
        showMessage("onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
        showMessage("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
        showMessage("onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
        showMessage("onRestart called")
    }

    private fun showMessage(message: String) {
        //Snackbar.make(findViewById(R.id.main), message, Snackbar.LENGTH_SHORT).show()
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}