// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.com.android.application)  apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
    alias(libs.plugins.dagger.hilt.android)  apply false
    alias(libs.plugins.devtools.ksp) apply false
}

// version "8.1.0-beta02"