plugins {
    kotlin("jvm") version "1.3.21"
}

repositories {
    mavenCentral()
}

sourceSets["main"].java.srcDir("src")
sourceSets["test"].java.srcDir("test")

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.guava:guava:27.0.1-jre")
    testImplementation("junit:junit:4.12")
}