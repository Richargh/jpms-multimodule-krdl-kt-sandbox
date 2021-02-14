package de.richargh.sandbox.jpms.catalogue.application

import de.richargh.sandbox.jpms.catalogue.domain.CatalogueEntry
import de.richargh.sandbox.jpms.catalogue.domain.ForSearchingCatalogueEntries

interface ForMutatingCatalogueEntries: ForSearchingCatalogueEntries {
    fun add(catalogueEntry: CatalogueEntry)
}