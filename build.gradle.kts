plugins {
    id("java")
}

group = "org.di"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:6.2.7")
    implementation("org.springframework:spring-core:6.1.3")
    implementation("org.springframework:spring-beans:6.1.3")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}