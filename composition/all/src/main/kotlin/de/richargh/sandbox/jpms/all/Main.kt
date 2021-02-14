package de.richargh.sandbox.jpms.all

import de.richargh.sandbox.jpms.catalogue.application.CatalogueGate
import de.richargh.sandbox.jpms.catalogue.domain.CatalogueEntry
import de.richargh.sandbox.jpms.catalogue.domain.CatalogueId
import de.richargh.sandbox.jpms.catalogue.infrastructure.InMemoryCatelogueEntries

fun main() {
    val gate = CatalogueGate(InMemoryCatelogueEntries())
    println("Beginning Entry count is: ${gate.count()}")
    val entry = CatalogueEntry(CatalogueId("1"), "any")
    println("Adding catalogue entry $entry")
    gate.add(entry)
    println("entry count is now: ${gate.count()}")
}