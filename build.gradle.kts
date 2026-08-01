plugins {
    java
    id("com.gradleup.shadow") version "9.6.1"
    id("io.github.intisy.github-gradle") version "1.8.4.1"
}

group = "io.github.thebusybiscuit"
version = "UNOFFICIAL"
description = "ChestTerminal is a Slimefun addon that adds a chest terminal item."

github {
    accessToken = System.getenv("GITHUB_TOKEN") ?: ""
    publish {
        tag = System.getenv("GITHUB_REF_NAME")
    }
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(21)) } }

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.codemc.io/repository/maven-public/")
}

dependencies {
    compileOnly("com.github.drakescraft_labs:slimefun-core:11.0-Drake-1.21.1-SNAPSHOT")
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    implementation("org.bstats:bstats-bukkit:3.2.1")

    testImplementation(platform("org.junit:junit-bom:6.1.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.mockito:mockito-core:5.23.0")
    testImplementation("org.slf4j:slf4j-simple:2.0.18")
    testImplementation("org.mockbukkit.mockbukkit:mockbukkit-v1.21:4.110.0") {
        exclude(group = "org.jetbrains", module = "annotations")
    }
}

configurations { testImplementation { extendsFrom(configurations.compileOnly.get()) } }

tasks {
    compileJava { options.encoding = "UTF-8" }
    processResources { filesMatching("plugin.yml") { expand("version" to project.version) } }
    jar { enabled = false }
    shadowJar {
        archiveFileName.set("ChestTerminal v${project.version}.jar")
        relocate("org.bstats", "io.github.thebusybiscuit.chestterminal.bstats")
        exclude("META-INF/**")
    }
    build { dependsOn(shadowJar) }
    test { useJUnitPlatform() }
}
