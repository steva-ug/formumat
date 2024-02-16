import java.util.Properties

val localprops = Properties().apply {
    try {
        load(File("local.properties").inputStream())
    } catch (ignored: Throwable) {
    }
}

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.compose")
    id("dev.icerock.mobile.multiplatform-resources")
}

group = "digital.steva"
version = "0.0.1"

repositories {
    google()
    mavenCentral()
}

kotlin {
    applyDefaultHierarchyTemplate()

    targets.configureEach {
        compilations.configureEach {
            compilerOptions.configure {
                freeCompilerArgs.addAll("-Xexpect-actual-classes")
            }
        }
    }
    androidTarget {
        publishLibraryVariants("release", "debug")
    }
    jvm {
        jvmToolchain(17)
    }
    js(IR) {
        browser()
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            val mokoResourcesVersion = extra["moko.resources.version"] as String

            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.6")
                implementation("org.reduxkotlin:redux-kotlin-threadsafe:0.6.1")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
                api("dev.icerock.moko:resources:${mokoResourcesVersion}")
                api("dev.icerock.moko:resources-compose:${mokoResourcesVersion}")
                if (localprops.getProperty("expressions.dir") != null) {
                    implementation(project(":expressions"))
                } else {
                    implementation("io.github.murzagalin:multiplatform-expressions-evaluator:0.15.0")
                }
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val commonUi by creating {
            dependsOn(commonMain)
            dependencies {
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
            }
        }
        val jvmMain by getting {
            dependsOn(commonUi)
            dependencies {
            }
        }
        val jvmTest by getting
        val jsMain by getting {
            // 1. option: Use the common UI which will be rendered into a canvas
            dependsOn(commonUi)
            // 1. option
            dependencies {
                // 2. option: User HTML DOM elements
                // implementation(compose.html.core)
                // 2. option
            }
        }
        val jsTest by getting {
        }
        val androidMain by getting {
            dependsOn(commonUi)
            dependencies {
            }
        }
        val androidUnitTest by getting {
            dependencies {
            }
        }
        val iosMain by getting {
            dependsOn(commonUi)
            dependencies {
            }
        }
        val iosTest by getting {
        }
    }

    targets.forEach { target ->
        target.compilations.forEach { compilation ->
            compilation.kotlinOptions.freeCompilerArgs += "-Xexpect-actual-classes"
        }
    }
}

multiplatformResources {
    resourcesPackage.set("digital.steva.formumat")
}

android {
    namespace = "digital.steva.formumatpublic"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].resources.exclude("src/commonMain/moko-resources")
    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    testOptions {
        unitTests.isReturnDefaultValues = true
    }
}
