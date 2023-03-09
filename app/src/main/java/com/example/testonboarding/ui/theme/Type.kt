package com.example.testonboarding.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    h3 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        lineHeight = 32.sp,
        fontSize = 22.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        lineHeight = 36.sp,
        fontSize = 17.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W400,
        lineHeight = 22.sp,
        fontSize = 15.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W600,
        lineHeight = 24.sp,
        fontSize = 17.sp
    ),
)