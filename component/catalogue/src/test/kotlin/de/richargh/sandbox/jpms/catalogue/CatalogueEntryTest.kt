package de.richargh.sandbox.jpms.catalogue

import de.richargh.sandbox.jpms.cataloguebuilder.CatalogueEntryBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CatalogueEntryTest {

    @Test
    fun `can say its own name`() {
        // arrange
        val name = "Pineapple"
        val catalogueEntry = CatalogueEntryBuilder().withName(name).build()

        // act
        val actual = catalogueEntry.sayName()

        // assert
        assertEquals(name, actual)
    }
}