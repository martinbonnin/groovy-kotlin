plugins {
    kotlin("jvm").version("1.5.10")
    id("java-gradle-plugin")
}

dependencies {
    compileOnly(gradleApi())
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("samplePlugin") {
            id = "com.sample"
            implementationClass = "SamplePlugin"
        }
    }
}