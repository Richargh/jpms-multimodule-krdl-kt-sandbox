package de.richargh.sandbox.jpms.catalogue.application

import de.richargh.sandbox.jpms.catalogue.domain.CatalogueEntry

class CatalogueGate(private val catalogueEntries: ForMutatingCatalogueEntries) {
    fun add(catalogueEntry: CatalogueEntry){
        catalogueEntries.add(catalogueEntry)
    }
    fun count(): Long {
        return catalogueEntries.count()
    }
}