package com.brfdev.startcompose.effect_handlers.remember_coroutine_scope

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineScope() {
    val scope = rememberCoroutineScope()
    Button(onClick = {
        scope.launch { //Do that only inside callbacks
            delay(1000L)
            println("Hello World")
        }
    }) {

    }

}