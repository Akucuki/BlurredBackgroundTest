package com.example.testonboarding.ui.features.oboarding.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.testonboarding.R


@Composable
fun OnboardingPage() {
    val textColor = remember { Color.White.copy(alpha = .4f) }
    Column(
        modifier = Modifier.padding(horizontal = 34.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_onboarding),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = stringResource(R.string.onboarding_title),
            style = MaterialTheme.typography.h3,
            color = Color.White
        )
        Text(
            modifier = Modifier.padding(top = 20.dp),
            text = stringResource(R.string.onboarding_text),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body2,
            color = textColor
        )
    }
}