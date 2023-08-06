object ProjectConfig {

    const val buildTypeDebug = "debug"
    const val buildTypeRelease = "release"
    const val isShrinkResources = true
    const val minifyEnabled = true
    const val debuggable = false

    const val versionCode = 1
    const val versionName = "0.0.1"

    object SdkVersions {
        const val compile = 33
        const val target = 33
        const val min = 21
    }

    // taken from gradle versions plugin samples
    // https://github.com/ben-manes/gradle-versions-plugin/blob/master/examples/kotlin/build.gradle.kts
    @JvmStatic
    fun String.isNonStable(): Boolean {
        val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { uppercase().contains(it) }
        val regex = "^[0-9,.v-]+(-r)?$".toRegex()
        val isStable = stableKeyword || regex.matches(this)
        return isStable.not()
    }
}