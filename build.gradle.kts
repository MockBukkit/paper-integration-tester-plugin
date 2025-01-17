plugins {
    `kotlin-dsl`
    id("com.gradle.plugin-publish") version "1.2.1"
}
group = "org.mockbukkit.integrationtester"
version = "0.1.0"

java {
    toolchain{
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

gradlePlugin {
    website = "https://github.com/ysb33r/gradleTest"
    vcsUrl = "https://github.com/ysb33r/gradleTest.git"
    plugins {
        create("paperIntegrationTester") {
            id = "org.mockbukkit.integrationtester.integrationtester-plugin"
            version = project.version.toString()
            implementationClass = "org.mockbukkit.integrationtester.plugin.GradlePlugin"
        }
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}