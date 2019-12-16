package com.andycooxy.mealtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Gob3 - Fafa","Gob3 - New Site", "Dirty Jollof", "Bayer3 Junction", "Kofi BrokeMan","Kenkey")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodTxt.text = "Select your food my friend."

        addFoodBtn.setOnClickListener{
            if(addFoodTxt.text.isEmpty()) {
                Toast.makeText(applicationContext, "failed : hey you didn't add any food!", Toast.LENGTH_SHORT).show()
            }else{
                selectedFoodTxt.text  = addFoodTxt.text
                addFoodTxt.text.clear()
                foodList.add(selectedFoodTxt.text .toString())
            }
        }

        selectFoodBtn.setOnClickListener{
            val randomize  = Random()
            val selectFoodIndex = randomize.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[selectFoodIndex]
        }
    }
}


