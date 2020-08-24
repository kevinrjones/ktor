/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    kotlin("plugin.serialization")
}

kotlin.sourceSets.jvmMain {
    dependencies {
        api("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")
    }
}
