package com.brfdev.startcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class RowColum : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(color = Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
//            )
            Row(
                modifier = Modifier
//                    .fillMaxSize(0.5f)
//                    .height(300.dp)
//                    .fillMaxHeight()
                    .fillMaxHeight(0.8f)
//                    .width(200.dp)
                    .fillMaxWidth(0.7f)
                    .background(color = Color.Green),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(text = "Hello")
                Text(text = "Android")
                Text(text = "Bruno Here")
            }
        }
    }
}