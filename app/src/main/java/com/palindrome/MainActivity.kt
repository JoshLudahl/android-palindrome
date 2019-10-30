package com.palindrome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.palindrome.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitWord(view: View) {

        val word = findViewById<EditText>(R.id.word)
        val message = word.text.toString()

        if (message.trim().toString() == "") {
            Toast.makeText(this, R.string.toast_invalid_word, Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
    }

}
