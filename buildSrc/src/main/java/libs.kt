object Libs {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    const val material = "com.google.android.material:material:1.9.0"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val lottie = "com.airbnb.android:lottie:3.5.0"

    object AndroidX {
        const val annotations = "androidx.annotation:annotation:1.1.0"
        const val customTabs = "androidx.browser:browser:1.0.0"
        const val cardView = "androidx.cardview:cardview:1.0.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.2.0-alpha11"
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:2.2.0"
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:2.2.0"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:2.2.0"
        const val legacySupportv4 = "androidx.legacy:legacy-support-v4:1.0.0"
        const val multidex = "androidx.multidex:multidex:2.0.1"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"

    }

//    object Firebase {
//        const val bom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
//        const val authKtx = "com.google.firebase:firebase-auth-ktx"
//        const val crashlyticsKtx = "com.google.firebase:firebase-crashlytics-ktx"
//        const val analyticsKtx = "com.google.firebase:firebase-analytics-ktx"
//        const val perfKtx = "com.google.firebase:firebase-perf-ktx"
//        const val dynamicLinksKtx = "com.google.firebase:firebase-dynamic-links-ktx"
//        const val messagingKtx = "com.google.firebase:firebase-messaging-ktx"
//        const val fireStoreKtx = "com.google.firebase:firebase-firestore-ktx"
//        const val storageKtx = "com.google.firebase:firebase-storage-ktx"
//    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.roomVersion}"
        const val compiler = "androidx.room:room-compiler:${Versions.roomVersion}"

        const val rxJava = "androidx.room:room-rxjava3:${Versions.roomVersion}"
        const val testing = "androidx.room:room-testing:${Versions.roomVersion}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val logInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.0"
        const val rxjavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"
    }

    object Dagger {
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
        const val ksp = "com.github.bumptech.glide:ksp:${Versions.glide}"
    }

    object Rx {
        const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJava}"
        const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"
        const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"

//        object RxBinding {
//            const val core = "com.jakewharton.rxbinding4:rxbinding-core:${Versions.rxBinding}"
//            const val appCompat =
//                "com.jakewharton.rxbinding4:rxbinding-appcompat:${Versions.rxBinding}"
//            const val recyclerView =
//                "com.jakewharton.rxbinding4:rxbinding-recyclerview:${Versions.rxBinding}"
//            const val material =
//                "com.jakewharton.rxbinding4:rxbinding-material:${Versions.rxBinding}"
//        }
    }


    object PlayServices {
        const val auth = "com.google.android.gms:play-services-auth:19.0.0"
    }

    object Misc {
        private const val leakCanaryVersion = "1.6.1"
        private const val glideVersion = "4.11.0"
        private const val butterVersion = "10.1.0"

        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
        const val leakCanaryFragments =
            "com.squareup.leakcanary:leakcanary-support-fragment:$leakCanaryVersion"
        const val leakCanaryNoop =
            "com.squareup.leakcanary:leakcanary-android-no-op:$leakCanaryVersion"

        const val glide = "com.github.bumptech.glide:glide:$glideVersion"
        const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"


        const val permissions = "pub.devrel:easypermissions:3.0.0"
        const val materialProgress = "me.zhanghai.android.materialprogressbar:library:1.6.1"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.5"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"

        const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit"
        const val mockitoKotlin = "com.nhaarman:mockito-kotlin"
        const val truth = "com.google.truth:truth:0.42"
        const val mockito = "org.mockito:mockito-android:2.21.0"
        const val robolectric = "org.robolectric:robolectric:4.3.1"

        const val core = "androidx.test:core:1.3.0"
        const val archCoreTesting = "androidx.arch.core:core-testing:2.1.0"
        const val runner = "androidx.test:runner:1.3.0"
        const val rules = "androidx.test:rules:1.3.0"
    }

    object Lint {
        private const val version = "26.5.0"

        const val api = "com.android.tools.lint:lint-api:$version"
        const val tests = "com.android.tools.lint:lint-tests:$version"
    }
}

