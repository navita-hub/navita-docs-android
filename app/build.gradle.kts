plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.ksp)
}

android {
    namespace = "com.navita.docs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.navita.docs"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
        }
    }

    flavorDimensions += listOf("default")

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    productFlavors {

        create("staging") {
            dimension = "default"
            applicationIdSuffix = ".staging"
            versionCode = rootProject.extra.get("versionCodeStaging") as Int
            versionName = rootProject.extra.get("versionNameStaging") as String
            manifestPlaceholders ["appIdNavitaStore"] = "com.navita.navitastore.staging"

            buildConfigField("String", "API_URL", "\"https://api.staging.com\"")
            buildConfigField("String", "ID_NAVITA_STORE", "\"com.navita.navitastore.staging\"")
        }

        create("production") {
            dimension = "default"
            versionCode = rootProject.extra.get("versionCodeProd") as Int
            versionName = rootProject.extra.get("versionNameProd") as String
            manifestPlaceholders ["appIdNavitaStore"] = "com.navita.navitastore"

            buildConfigField("String", "API_URL", "\"https://api.production.com\"")
            buildConfigField("String", "ID_NAVITA_STORE", "\"com.navita.navitastore\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.navigation.compose)
    implementation(libs.maps.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.koin)
    implementation(libs.squareup.retrofit)
    implementation(libs.squareup.rxjava)
    implementation(libs.squareup.converter.gson)
    implementation(libs.squareup.okhttp3)
    implementation(libs.squareup.log.interceptor)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}