package de.richargh.sandbox.jpms.catalogue.domain

interface ForSearchingCatalogueEntries {
    fun count(): Long
    fun findAll(): List<CatalogueEntry>
}