// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

ext{
    //General version values
    val versionMajor = 1
    val versionMinor = 0
    val versionPatch = 1
    val versionStagingPatch = 2

    //versions for prod
    val versionNameProd : String by extra("${versionMajor}.${versionMinor}.${versionPatch}")
    val versionCodeProd : Int by extra(versionMajor * 100 + versionMinor * 10 + versionPatch)

    //versions for staging
    val versionNameStaging : String by extra("${versionMajor}.${versionMinor}.${versionStagingPatch}")
    val versionCodeStaging : Int by extra(versionMajor * 100 + versionMinor * 10 + versionStagingPatch)
}