pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android" || requested.id.name == "kotlin-android-extensions") {
                useModule("com.android.tools.build:gradle:${extra["agp.version"]}")
            }
        }
    }

    plugins {
        kotlin("jvm").version(extra["kotlin.version"] as String)
        kotlin("multiplatform").version(extra["kotlin.version"] as String)
        kotlin("plugin.serialization").version(extra["kotlin.version"] as String)
        id("org.jetbrains.compose").version(extra["compose.version"] as String)
        id("dev.icerock.mobile.multiplatform-resources").version(extra["moko.resources.version"] as String)
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "formumat-public"

val localprops = java.util.Properties().apply {
    try {
        load(java.io.File("local.properties").inputStream())
    } catch (ignored: Throwable) {
    }
}

if (localprops.containsKey("expressions.dir")) {
    include("expressions")
    project(":expressions").projectDir = File(localprops.getProperty("expressions.dir"))
}
