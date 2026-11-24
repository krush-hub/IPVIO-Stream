package com.ipvio.stream

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** NexTV is free software (GPL-3.0). No donations are collected in this build. */
object Donate {
    const val URL = ""
    val SHORT: String get() = ""
    const val KOFI_URL = ""
    val KOFI_SHORT: String get() = ""
}

/** Settings > About: note that NexTV is free, ad-free and open source (GPL-3.0). */
@Composable
internal fun DonateSection(@Suppress("UNUSED_PARAMETER") ctx: Context) {
    SectionTitle("Sobre o NexTV")
    Hint("NexTV é gratuito, sem anúncios e de código aberto (GPL-3.0).")
}
