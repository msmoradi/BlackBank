plugins {
    id("paypal.android.feature")
    id("paypal.android.library.compose")
}

android {
    namespace = "com.saeed.paypal.feature.wallet"
}

dependencies {
    implementation(libs.androidx.compose.material3.windowSizeClass)
}