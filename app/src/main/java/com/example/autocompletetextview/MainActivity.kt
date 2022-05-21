package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    lateinit var autoCompleteTextView:AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoCompleteTextView = findViewById(R.id.authCompleteText)
        val fruitsArray = arrayOf("Apple","Orange","Mango","Kiwi","Berry","peach","Banana","Fig","Strawberry","Plum","Raspberry","Watermelon","Blackberry","Guava","Grapes","Pineapple","Coconut","Pear","Papaya","Apricot","Avocado","Cranberry","Gooseberry","Pineberry","Star fruit","lime")
        val arrayAdapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,fruitsArray)
        autoCompleteTextView.setAdapter(arrayAdapter)
    }
}