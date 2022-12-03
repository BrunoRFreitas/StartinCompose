package com.brfdev.startcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class TextFieldsButtonsSnackbar : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp)
                ) {
                    TextField(
                        value = textFieldState,
                        label = {
                            Text(text = "Enter your name")
                        },
                        onValueChange = {
                            textFieldState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        scope.launch {
                            val snackbarResult = scaffoldState.snackbarHostState.showSnackbar(
                                message = "Hello $textFieldState",
                                "Action Label",
                                duration = SnackbarDuration.Short
                            )
                            when (snackbarResult) {
                                SnackbarResult.Dismissed ->
                                    Log.e("Test-Bruno", "Dismissed")
                                SnackbarResult.ActionPerformed ->
                                    Log.e("Test-Bruno", "Action Performed")
                            }
                        }
                    }) {
                        Text(text = "Plese greet me")
                    }
                }
            }
        }
    }
}