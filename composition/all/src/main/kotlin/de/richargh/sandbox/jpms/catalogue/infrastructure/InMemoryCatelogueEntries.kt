package de.richargh.sandbox.jpms.catalogue.infrastructure

import de.richargh.sandbox.jpms.catalogue.application.ForMutatingCatalogueEntries
import de.richargh.sandbox.jpms.catalogue.domain.CatalogueEntry

class InMemoryCatelogueEntries: ForMutatingCatalogueEntries {

    private val entries = mutableListOf<CatalogueEntry>()

    override fun add(catalogueEntry: CatalogueEntry) {
        this.entries.add(catalogueEntry)
    }

    override fun count(): Long {
        return this.entries.size.toLong()
    }

    override fun findAll(): List<CatalogueEntry> {
        return entries
    }
}