plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.ksp)
    alias(libs.plugins.anvil)
}

dependencies {
    implementation(project(":appScope"))
    implementation(libs.dagger.runtime)
    ksp(libs.dagger.compiler)
}