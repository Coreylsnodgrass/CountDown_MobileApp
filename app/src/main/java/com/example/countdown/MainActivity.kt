package com.example.countdown

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.countdown.ui.theme.CountDownTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CountDownTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TimerDisplay(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize() // Make TimerDisplay take the whole screen
                    )
                }
            }
        }
    }
}

@Composable
fun TimerDisplay(modifier: Modifier = Modifier) {
    Column( // Use Box to easily center content
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally, // Center the text
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "00:00:00", // This is our placeholder time
            fontSize = 48.sp  // Make the text bigger
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TimerDisplayPreview() {
    CountDownTheme {
        TimerDisplay(modifier = Modifier.fillMaxSize())
    }
}