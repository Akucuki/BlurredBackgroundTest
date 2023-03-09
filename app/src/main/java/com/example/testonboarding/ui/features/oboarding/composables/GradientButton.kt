package com.example.testonboarding.ui.features.oboarding.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.testonboarding.ui.theme.ButtonBackgroundGradientColors

@Composable
fun GradientButton(
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(40.dp),
    @StringRes
    textId: Int,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .background(
                brush = remember {
                    Brush.linearGradient(
                        colors = ButtonBackgroundGradientColors,
                        start = Offset.Zero,
                        end = Offset(0f, Float.POSITIVE_INFINITY)
                    )
                },
                shape = shape
            )
            .clickable(onClick = onClick)
            .clip(shape),
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            modifier = Modifier.padding(vertical = 16.dp),
            text = stringResource(textId),
            style = MaterialTheme.typography.button,
            color = Color.White,
        )
    }
}