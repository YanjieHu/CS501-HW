package com.example.hw1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.hw1.R
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)



        trueButton.setOnClickListener { view: View ->
            Snackbar.make(findViewById(R.id.myCoordinatorLayout), R.string.correct,
                Snackbar.LENGTH_SHORT)
                .show();
        }
        falseButton.setOnClickListener { view: View ->
            Snackbar.make(findViewById(R.id.myCoordinatorLayout), R.string.incorrect,
                Snackbar.LENGTH_SHORT)
                .show();
        }
    }
}