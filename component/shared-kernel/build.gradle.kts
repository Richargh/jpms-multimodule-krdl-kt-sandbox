import de.richargh.sandbox.jpms.Deps

plugins {
    kotlin("jvm")
    id("java")

    id("java-test-fixtures")
}

java {
    modularity.inferModulePath.set(true)
}

dependencies {
    /** Language dependencies **/
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    /** Main dependencies **/
    // none

    /** Test dependencies **/
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${Deps.Junit.version}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
    testImplementation("org.assertj:assertj-core:${Deps.AssertJ.version}")

    /** Test fixtures **/
    testFixturesApi("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "de.richargh.sandbox.jpms.shared_kernel")
    }
}
