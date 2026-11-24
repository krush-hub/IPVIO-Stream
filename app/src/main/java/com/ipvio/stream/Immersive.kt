package com.ipvio.stream

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

/**
 * Full screen without the system bars (status + navigation) while this is composed.
 * The bars stay hidden and only appear briefly when the user swipes from the screen edge
 * (transient bars, the standard video-app behaviour); they hide again on their own.
 * The bars are restored when leaving. Used on the detail page and in the player — on phones
 * the navigation bar otherwise eats screen space while watching, and there is no on-screen
 * back button next to it (see the back button on the detail page). On a TV this is a no-op:
 * there are no system bars to hide.
 */
@Composable
fun ImmersiveEffect() {
    val view = LocalView.current
    DisposableEffect(view) {
        val window = (view.context as? Activity)?.window
        val controller = window?.let { WindowCompat.getInsetsController(it, view) }
        controller?.hide(WindowInsetsCompat.Type.systemBars())
        controller?.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        onDispose { controller?.show(WindowInsetsCompat.Type.systemBars()) }
    }
}
