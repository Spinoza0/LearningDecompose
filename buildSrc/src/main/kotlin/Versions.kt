import org.gradle.api.JavaVersion

object Versions {
    const val compileSdk = 34
    const val minSdk = 24
    const val targetSdk = 34

    const val kotlin = "1.9.0"
    const val androidGradlePlugin = "8.2.0-beta04"

    const val versionCode = 1
    const val versionName = "1.0"

    val sourceCompatibility = JavaVersion.VERSION_19
    val targetCompatibility = JavaVersion.VERSION_19
    const val jvmTarget = "19"

    const val kotlinCompilerExtensionVersion = "1.5.1"
}