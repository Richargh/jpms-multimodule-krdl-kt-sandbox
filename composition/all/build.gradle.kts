import de.richargh.sandbox.jpms.Deps
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "de.richargh.sandbox.jpms.all")
    }
}

dependencies {
    /** Project dependencies **/
    implementation(project(":component:catalogue"))
    implementation(project(":component:catalogue-api"))
    implementation(project(":component:shared-kernel"))
    testImplementation(testFixtures(project(":component:catalogue")))
    testImplementation(testFixtures(project(":component:shared-kernel")))

    /** Language dependencies **/
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    /** Main dependencies **/

    /** Test dependencies **/
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${Deps.Junit.version}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Deps.Junit.version}")
    testImplementation("org.assertj:assertj-core:${Deps.AssertJ.version}")
}
