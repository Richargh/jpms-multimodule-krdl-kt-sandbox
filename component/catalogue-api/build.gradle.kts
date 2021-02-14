import de.richargh.sandbox.jpms.Deps

plugins {
    kotlin("jvm")
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "de.richargh.sandbox.jpms.catalogue.api")
    }
}

dependencies {
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
