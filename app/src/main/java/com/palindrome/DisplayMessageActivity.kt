package com.palindrome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val resultWord = findViewById<TextView>(R.id.word_result).apply {
            text = message

        }
        changeText(message)

    }

    fun isPalindrome(word: String) : Boolean {
        return word.reversed().equals(word)
    }

    fun changeText(word: String) {
        when(isPalindrome(word)) {
            true -> findViewById<TextView>(R.id.result_summary).apply {
                text = getString(R.string.palindrome_yay)
            }
            false -> findViewById<TextView>(R.id.result_summary).apply {
                text = getString(R.string.palindrome_nay)
            }
        }
    }
}
