package com.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    //Renkleri değiştirmek için
    private fun makeColored(view: View) {
        when (view.id) {
            R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)
            R.id.boxThreeText -> view.setBackgroundColor(Color.BLUE)
            R.id.boxFourText -> view.setBackgroundColor(Color.MAGENTA)
            R.id.boxFiveText -> view.setBackgroundColor(Color.BLUE)
            R.id.redButton -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellowButton -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.greenButton -> binding.boxFiveText.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListener() {
        val clickableViews: List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout,
            binding.redButton,
            binding.yellowButton,
            binding.greenButton
        )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}