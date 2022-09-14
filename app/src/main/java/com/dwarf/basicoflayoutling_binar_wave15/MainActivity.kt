package com.dwarf.basicoflayoutling_binar_wave15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG = MainActivity::class.java.simpleName
    }

    private val flButtonRight : FrameLayout by lazy {
        findViewById(R.id.fl_button_right)
    }
    private val flButtonLeft : FrameLayout by lazy {
        findViewById(R.id.fl_button_left)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear)
        flButtonLeft.setOnClickListener {
            Log.d(TAG,"OnCreate: Button Left Clicked")
            Toast.makeText(this, "Button Left Clicked", Toast.LENGTH_SHORT).show()
        }
        flButtonRight.setOnClickListener {
            Log.d(TAG,"OnCreate: Button Right Clicked")
            Toast.makeText(this, "Button Right Clicked", Toast.LENGTH_SHORT).show()
        }


    }
}