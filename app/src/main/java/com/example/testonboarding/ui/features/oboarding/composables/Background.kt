package com.example.testonboarding.ui.features.oboarding.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testonboarding.R
import com.example.testonboarding.ui.theme.BackgroundColor

@Composable
fun Background(modifier: Modifier = Modifier, content: @Composable () -> Unit = {}) {
    val density = LocalDensity.current
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp
    val ellipseTopPadding = remember { -screenHeight / 4 }
    val ellipseTopPaddingPx = remember { with(density) { ellipseTopPadding.toPx() } }
    val ellipseStartPadding = remember { screenWidth / 8 }
    val ellipseStartPaddingPx = remember { with(density) { ellipseStartPadding.toPx() } }
    val ellipseWidth = remember { screenWidth * 1.4f }
    val ellipseHeight = remember { screenHeight * 1.4f }
    val circleWidth = remember { screenWidth * 1.4f }

    Box(
        modifier = modifier.background(color = BackgroundColor),
    ) {
        Image(
            modifier = Modifier
                .requiredWidth(circleWidth)
                .align(Alignment.Center),
            painter = painterResource(R.drawable.img_background_blurred_circle),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Image(
            modifier = Modifier
                .requiredHeight(ellipseHeight)
                .requiredWidth(ellipseWidth)
                .graphicsLayer {
                    translationY = ellipseTopPaddingPx
                    translationX = ellipseStartPaddingPx
                    rotationZ = 20f
                },
            painter = painterResource(R.drawable.img_background_blurred_ellipse),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
        content()
    }
}