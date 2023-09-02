package com.example.reprochannelcrash

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.reprochannelcrash.ui.theme.ReproChannelCrashTheme
import me.saket.telephoto.zoomable.coil.ZoomableAsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL
        super.onCreate(savedInstanceState)
        setContent {
            ReproChannelCrashTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ZoomableAsyncImage(
                        contentScale = ContentScale.Fit,
                        model = "https://programming.dev/pictrs/image/24f030a2-2a1c-4733-a844-5be5cc99d9ef.png",
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}
