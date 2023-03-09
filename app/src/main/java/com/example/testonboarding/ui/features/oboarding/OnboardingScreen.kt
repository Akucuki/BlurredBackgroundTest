package com.example.testonboarding.ui.features.oboarding

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.testonboarding.R
import com.example.testonboarding.ui.features.oboarding.composables.GradientButton
import com.example.testonboarding.ui.features.oboarding.composables.Background
import com.example.testonboarding.ui.features.oboarding.composables.OnboardingPage
import com.example.testonboarding.ui.utils.DevicePreviews
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

private const val PAGES_COUNT = 3

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingScreen(
    onSkip: () -> Unit,
) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()
    val onContinueClick: () -> Unit = {
        if (pagerState.currentPage == PAGES_COUNT - 1) {
            onSkip()
        } else {
            coroutineScope.launch {
                pagerState.animateScrollToPage(pagerState.currentPage + 1)
            }
        }
    }

    Background {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                modifier = Modifier.align(Alignment.End),
                onClick = onSkip
            ) {
                Text(
                    text = stringResource(R.string.onboarding_skip),
                    style = MaterialTheme.typography.h4,
                    color = Color.White.copy(alpha = .4f),
                )
            }
            HorizontalPager(count = PAGES_COUNT, state = pagerState) { _ ->
                OnboardingPage()
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor = Color.White,
                inactiveColor = Color.White.copy(alpha = .4f),
            )
            GradientButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 28.dp, end = 28.dp, bottom = 50.dp),
                textId = R.string.onboarding_continue,
                onClick = onContinueClick
            )
        }
    }
}

@DevicePreviews
@Composable
private fun OnboardingScreenPreview() {
    OnboardingScreen(onSkip = {})
}