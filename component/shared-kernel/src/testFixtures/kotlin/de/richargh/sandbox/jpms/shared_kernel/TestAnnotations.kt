package de.richargh.sandbox.jpms.shared_kernel

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Tags(Tag("unit"))
annotation class UnitScope
