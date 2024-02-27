package com.ilyes.couroutinsinaraceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Surface

import androidx.compose.ui.Modifier

import com.ilyes.couroutinsinaraceapp.ui.RaceTrackerApp
import com.ilyes.couroutinsinaraceapp.ui.theme.CouroutinsInARaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            CouroutinsInARaceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    RaceTrackerApp()
                }
            }
        }
    }
}
