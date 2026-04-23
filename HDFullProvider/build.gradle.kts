plugins {
    id("com.android.library")
    id("kotlin-android")
    id("cloudstream")  // nuestro plugin personalizado
}

android {
    compileSdk = 34
    namespace = "com.stormunblessed"

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    compileOnly("com.github.recloudstream:cloudstream:master-SNAPSHOT")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
}

cloudstream {
    language = "es"
    authors = listOf("redblacker8")
    status = 1
    tvTypes = listOf("Movie", "TvSeries")
    iconUrl = "https://hdfullcdn.cc/favicon.ico"
}

version = 4
