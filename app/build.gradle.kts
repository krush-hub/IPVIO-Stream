import java.util.Properties


plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}


// Optional developer API keys from "secrets.properties" (ignored by Git) or environment variables.
// Normal users enter their own keys in the app (Settings > API keys); without keys the build contains none.
val secrets = Properties().apply {
    val f = rootProject.file("secrets.properties")
    if (f.exists()) f.inputStream().use { load(it) }
}
fun secret(name: String): String =
    (secrets.getProperty(name) ?: System.getenv(name) ?: "").trim().filter { it.isLetterOrDigit() }
// Google sign-in for the optional Google Drive backup (see docs/GOOGLE_DRIVE.md); client IDs contain '-' and '.'
fun secretId(name: String): String =
    (secrets.getProperty(name) ?: System.getenv(name) ?: "").trim().filter { it.isLetterOrDigit() || it == '-' || it == '.' || it == '_' }


// Release signing from "keystore.properties" (ignored by Git, see docs/RELEASE.md). Every release MUST be signed with the
// same key: only then does Android install an update over the old version and keep history, favorites and settings.
val keystore = Properties().apply {
    val f = rootProject.file("keystore.properties")
    if (f.exists()) f.inputStream().use { load(it) }
}
val hasKeystore = listOf("storeFile", "storePassword", "keyAlias", "keyPassword").all { !keystore.getProperty(it).isNullOrBlank() }


android {
    namespace = "com.ipvio.stream"
    compileSdk {
        version = release(37)
    }


    defaultConfig {
        applicationId = "com.nextv.stream"
        minSdk = 24
        targetSdk = 37
        // Raise both for every release; the GitHub release tag must match versionName (e.g. tag "v1.1").
        versionCode = 2
        versionName = "1.0.1"
        // Name under the icon; the debug build overrides it (see buildTypes)
        manifestPlaceholders["appLabel"] = "NexTV"


        buildConfigField("String", "TMDB_KEY", "\"${secret("TMDB_KEY")}\"")
        buildConfigField("String", "OMDB_KEY", "\"${secret("OMDB_KEY")}\"")
        buildConfigField("String", "GOOGLE_CLIENT_ID", "\"${secretId("GOOGLE_CLIENT_ID")}\"")
        buildConfigField("String", "GOOGLE_CLIENT_SECRET", "\"${secretId("GOOGLE_CLIENT_SECRET")}\"")
    }


    signingConfigs {
        if (hasKeystore) create("release") {
            storeFile = rootProject.file(keystore.getProperty("storeFile"))
            storePassword = keystore.getProperty("storePassword")
            keyAlias = keystore.getProperty("keyAlias")
            keyPassword = keystore.getProperty("keyPassword")
        }
    }


    buildTypes {
        // Test build (Run in Android Studio / debug APK): own app ID, so the private IPVIO app on the TV
        // is not overwritten. Both apps can be installed side by side (own data, own name).
        debug {
            applicationIdSuffix = ".test"
            manifestPlaceholders["appLabel"] = "NexTV"
