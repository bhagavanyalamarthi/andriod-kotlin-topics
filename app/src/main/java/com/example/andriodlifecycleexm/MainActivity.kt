package com.example.andriodlifecycleexm
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.counttextview)
        val countButton: Button = findViewById(R.id.countButton)

        countButton.setOnClickListener {
            count++
            updateCount()
        }

        showToast("onCreate Called")
    }

    private fun updateCount() {
        countTextView.text = "Count: $count"
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy Called")
    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
