package com.busra.banklocations.ui.view.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.busra.banklocations.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val isPlaying by remember { mutableStateOf(true) }
    val speed by remember { mutableStateOf(1f) }
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation_splash))
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        isPlaying = isPlaying,
        speed = speed,
        restartOnPlay = false)

    LaunchedEffect(Unit) {
        delay(5000)
        //TODO: navController.navigate("homescreen")
    }

    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues)
        ) {
            LottieAnimation(
                composition = composition,
                progress = { progress },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp),
                alignment = Alignment.Center
            )
        }
    }
}