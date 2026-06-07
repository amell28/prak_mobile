plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false  // ✅ TAMBAHKAN
    alias(libs.plugins.android.ksp) apply false     // ✅ GANTI dari id("com.google.devtools.ksp")
}