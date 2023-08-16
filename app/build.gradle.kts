plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt") // TODO remove kapt from project when dagger supports ksp
    id("com.google.devtools.ksp")
}

android {
    namespace = "io.cyberyogi.arch"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.cyberyogi.arch"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {

        debug {
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-DEV"
        }

        release {
            isMinifyEnabled = ProjectConfig.minifyEnabled
            isDebuggable = ProjectConfig.debuggable
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        viewBinding = true
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

    implementation(project(":core"))

    implementation("androidx.core:core-ktx:1.10.1")

    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.9.0"))
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")


    // Compose
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.06.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    // Timber for logging
    implementation(Libs.timber)

    implementation(Libs.material)
    implementation(Libs.AndroidX.constraintLayout)

    // Glide for Image Loading
    implementation(Libs.Glide.glide)
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.6.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")
    ksp(Libs.Glide.ksp)

    // Room database
    implementation(Libs.Room.runtime)
    ksp(Libs.Room.compiler)
    implementation(Libs.Room.rxJava)

    // Dagger for Dependency Injection
    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.compiler)

    // RxJava/RxKotlin for Reactive approach
    implementation(Libs.Rx.rxJava)
    implementation(Libs.Rx.rxKotlin)
    implementation(Libs.Rx.rxAndroid)

    testImplementation(Libs.Test.junit)
    androidTestImplementation(Libs.Test.junitExt)
    androidTestImplementation(Libs.Test.espressoCore)
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.06.01"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")

    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}