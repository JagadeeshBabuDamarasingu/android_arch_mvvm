import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

buildscript {
    configurations.configureEach {
        resolutionStrategy {
            force("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.7.0")
        }
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version Versions.kotlinVersion apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.11" apply false
    id("com.github.ben-manes.versions") version "0.47.0"
}

// taken from gradle versions plugin samples
// https://github.com/ben-manes/gradle-versions-plugin/blob/master/examples/kotlin/build.gradle.kts

//// Example 1: reject all non stable versions
//rejectVersionIf {
//    candidate.version.isNonStable()
//}
//
//// Example 2: disallow release candidates as upgradable versions from stable versions
//rejectVersionIf {
//    candidate.version.isNonStable() && !currentVersion.isNonStable()
//}

gradle.projectsEvaluated {
    tasks.withType<JavaCompile> {
        // TODO revisit this for correctness
        options.compilerArgs = mutableListOf("-Xmaxerrs", "500")
    }
}