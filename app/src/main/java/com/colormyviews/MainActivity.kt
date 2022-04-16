package com.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//Renkleri değiştirmek için
    private fun makeColored(view: View){
        when(view.id){
         R.id.boxOneText->view.setBackgroundColor(Color.DKGRAY)
         R.id.boxTwoText->view.setBackgroundColor(Color.GRAY)
         R.id.boxThreeText->view.setBackgroundColor(Color.BLUE)
         R.id.boxFourText->view.setBackgroundColor(Color.MAGENTA)
         R.id.boxFiveText->view.setBackgroundColor(Color.BLUE)
            else->view.setBackgroundColor(Color.LTGRAY)
        }
    }
}