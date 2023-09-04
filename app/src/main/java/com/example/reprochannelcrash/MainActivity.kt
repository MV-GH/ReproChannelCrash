package com.example.reprochannelcrash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.example.reprochannelcrash.ui.theme.ReproChannelCrashTheme
import me.saket.telephoto.zoomable.ZoomSpec
import me.saket.telephoto.zoomable.coil.ZoomableAsyncImage
import me.saket.telephoto.zoomable.rememberZoomableImageState
import me.saket.telephoto.zoomable.rememberZoomableState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReproChannelCrashTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val zoomableState = rememberZoomableState(ZoomSpec(2F))
                    val zoomableImageState = rememberZoomableImageState(zoomableState)


                    ZoomableAsyncImage(
                        state = zoomableImageState,
                        contentScale = ContentScale.Fit,
                        model = "https://lemmy.ml/pictrs/image/415c44c0-d626-4744-a026-75adeb9f6123.webp",
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            }
        }
    }
}
