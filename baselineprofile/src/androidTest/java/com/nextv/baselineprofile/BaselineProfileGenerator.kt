package com.nextv.baselineprofile

import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Generates the Baseline Profile for NexTV.
 * Run on a connected device/emulator (API 33+ or rooted): the CI workflow
 * .github/workflows/baseline-profile.yml does it on an emulator and commits the
 * generated profile back to app/src/release/generated/baselineProfiles/.
 * The app opens on the login screen without a playlist, so the profile covers
 * app start until the first frame — the cold-start path.
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class BaselineProfileGenerator {

    @get:Rule
    val rule = BaselineProfileRule()

    @Test
    fun startup() = rule.collect(
        packageName = "com.nextv.stream",
        includeInStartupProfile = true
    ) {
        startActivityAndWait()
        device.waitForIdle()
    }
}
