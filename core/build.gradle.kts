plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt") // TODO remove kapt from project when dagger supports ksp
    id("com.google.devtools.ksp")
}

android {
    namespace = "io.cyberyogi.core"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = ProjectConfig.minifyEnabled
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation(Libs.material)

    // Timber for Logging
    implementation(Libs.timber)

    // Glide for Image Loading
    implementation(Libs.Glide.glide)
    ksp(Libs.Glide.ksp)

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


//    implementation(Libs)

    testImplementation(Libs.Test.junit)
    androidTestImplementation(Libs.Test.junitExt)
    androidTestImplementation(Libs.Test.espressoCore)
}