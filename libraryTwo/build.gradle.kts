plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.anvil)
}

dependencies {
    implementation(project(":appScope"))
    implementation(libs.dagger.runtime)
    kapt(libs.dagger.compiler)
}