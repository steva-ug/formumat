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
            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:${extra["kotlinx.collections.immutable.version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:${extra["kotlinx.serialization.json.version"]}")
                implementation("org.reduxkotlin:redux-kotlin-threadsafe:${extra["redux.kotlin.threadsafe.version"]}")
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:${extra["kotlinx.datetime.version"]}")
                implementation("co.touchlab:kermit:${extra["kermit.thelog.version"]}")
                implementation("com.ionspin.kotlin:bignum:${extra["ionspin.bignum.version"]}")
                api("dev.icerock.moko:resources:${extra["moko.resources.version"]}")
                api("dev.icerock.moko:resources-compose:${extra["moko.resources.version"]}")
                if (localprops.getProperty("expressions.dir") != null) {
                    implementation(project(":expressions"))
                } else {
                    implementation("digital.steva:multiplatform-expressions-evaluator:${extra["multiplatform.expressions.evaluator.version"]}")
                }
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
            }
        }
        val jvmTest by getting
        val jsMain by getting {
            // 1. option: Use the common UI which will be rendered into a canvas
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
            dependencies {
            }
        }
        val androidUnitTest by getting {
            dependencies {
            }
        }
        val iosMain by getting {
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
    resourcesPackage.set("digital.steva.formumat.public")
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
