// Generates the Baseline Profile for the NexTV app (startup until the first frame).
// See .github/workflows/baseline-profile.yml — CI runs it on an emulator and commits
// the generated profile back to app/src/release/generated/baselineProfiles/.

plugins {
    id("com.android.test")
    id("androidx.baselineprofile")
}

android {
    namespace = "com.nextv.baselineprofile"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 24
        targetSdk = 37
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // Point to the app module, the module that you're generating the Baseline Profile for.
    targetProjectPath = ":app"

    // No Gradle-managed device: the profile is generated on the CI emulator
    // (connected device, API 34), see the workflow.
}

dependencies {
    implementation("androidx.benchmark:benchmark-macro-junit4:1.5.0")
    implementation("androidx.test.ext:junit:1.3.0")
    implementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation("androidx.test.uiautomator:uiautomator:2.3.0")
}
