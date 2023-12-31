

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.hibernate:hibernate-core:5.4.18.Final")
    implementation("mysql:mysql-connector-java:8.0.21")
    implementation("org.apache.logging.log4j:log4j-core:2.13.3")
}

