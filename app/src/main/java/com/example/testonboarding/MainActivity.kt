package com.example.testonboarding

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.core.view.WindowCompat
import com.example.testonboarding.ui.features.oboarding.OnboardingScreen
import com.example.testonboarding.ui.theme.TestOnboardingTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyEdgeToEdge()
        setContent {
            TestOnboardingTheme {
                Surface {
                    OnboardingScreen(
                        onSkip = {
                            Toast.makeText(
                                this,
                                "Navigated to auth flow.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    )
                }
            }
        }
    }

    private fun applyEdgeToEdge() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}
