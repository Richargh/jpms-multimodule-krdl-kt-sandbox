package de.richargh.sandbox.jpms.catalogue.infrastructure

import de.richargh.sandbox.jpms.cataloguebuilder.CatalogueEntryBuilder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import de.richargh.sandbox.jpms.shared_kernel.UnitScope

internal class InMemoryCatelogueEntriesTest {

    @UnitScope
    @Test
    fun `initial entity count is zero`(){
        // arrange
        val testling = InMemoryCatelogueEntries()

        // act
        val result = testling.count()

        // assert
        assertThat(result).isEqualTo(0)
    }

    @UnitScope
    @Test
    fun `after adding one the count is zero`(){
        // arrange
        val testling = InMemoryCatelogueEntries()

        // act
        val catalogueEntry = CatalogueEntryBuilder().build()
        testling.add(catalogueEntry)

        // assert
        assertThat(testling.count()).isEqualTo(1)
    }
}