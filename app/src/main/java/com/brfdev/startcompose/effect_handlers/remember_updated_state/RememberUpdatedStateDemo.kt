package com.brfdev.startcompose.effect_handlers.remember_updated_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateDemo(
    onTimeout: () -> Unit
) {
    val updatedOnTimeout by rememberUpdatedState(newValue = onTimeout)
    LaunchedEffect(key1 = true){
        delay(1000L)
        updatedOnTimeout()
    }

}