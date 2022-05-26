import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    jacoco
    kotlin("jvm") version "1.6.20"
    application
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("junit:junit:4.13.2")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}