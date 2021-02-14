package de.richargh.sandbox.jpms.cataloguebuilder

import de.richargh.sandbox.jpms.catalogue.domain.CatalogueEntry
import de.richargh.sandbox.jpms.catalogue.domain.CatalogueId

class CatalogueEntryBuilder {

    private var id = CatalogueId("1")
    private var name: String = "Cheese"

    fun build() = CatalogueEntry(
            id,
            name)

    fun withName(name: String) = apply { this.name = name }
}