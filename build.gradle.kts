plugins {
    maven
    kotlin("jvm") version "1.3.72"
}

version = "1.0.0"
group = "max212.kotlin.util"

repositories {
    mavenCentral()
    jcenter()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
    testImplementation("org.amshove.kluent:kluent:1.61")
}
