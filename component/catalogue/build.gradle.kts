import de.richargh.sandbox.jpms.Deps
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("java")

    id("java-test-fixtures")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

java {
    modularity.inferModulePath.set(true)
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "de.richargh.sandbox.jpms.catalogue")
    }
}

dependencies {
    /** Project dependencies **/
    implementation(project(":component:catalogue-api"))
    implementation(project(":component:shared-kernel"))
    testImplementation(testFixtures(project(":component:shared-kernel")))

    /** Language dependencies **/
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    /** Main dependencies **/
    // none

    /** Test dependencies **/
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${Deps.Junit.version}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
    testImplementation("org.assertj:assertj-core:${Deps.AssertJ.version}")
}

