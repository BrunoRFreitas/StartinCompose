package com.brfdev.startcompose.developer_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brfdev.startcompose.R
import com.brfdev.startcompose.ui.theme.StartComposeTheme

class MainActivityDevAndroidImage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(
                        Message("Android", "Jetpack Compose"),
                        painterResource(R.drawable.kermit)
                    )
                }
            }
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message, painter: Painter) {
    Row(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painter,
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = msg.body)
        }

    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    StartComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MessageCard(Message("Android", "Jetpack Compose"), painterResource(R.drawable.kermit))
        }
    }
}