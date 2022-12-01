package com.brfdev.startcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Modifiers : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
//                    .width(300.dp)
//                    .requiredWidth(600.dp)
                    .fillMaxWidth()
//                    .padding(30.dp)
//                    .padding(top = 30.dp)
                    .border(10.dp, Color.Magenta)
                    .padding(10.dp)
                    .border(5.dp, Color.Blue)
                    .padding(10.dp)
                    .border(20.dp, Color.Red)
                    .padding(20.dp)
            ) {
                Text(
                    text = "Hello",
//                    modifier = Modifier.offset(0.dp, 20.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")

            }
        }
    }

}