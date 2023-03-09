package com.example.testonboarding.ui.utils

import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "phone",
    showBackground = true,
    device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480"
)
@Preview(
    name = "foldable",
    showBackground = true,
    device = "spec:shape=Normal,width=673,height=841,unit=dp,dpi=480"
)
@Preview(
    name = "tablet",
    showBackground = true,
    device = "spec:shape=Normal,width=800,height=1280,unit=dp,dpi=480"
)
annotation class DevicePreviews