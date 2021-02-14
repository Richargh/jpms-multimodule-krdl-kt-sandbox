package de.richargh.sandbox.jpms.catalogue.domain

import de.richargh.sandbox.jpms.shared_kernel.Entity
import de.richargh.sandbox.jpms.shared_kernel.Identifier

data class CatalogueEntry(
        override val id: CatalogueId,
        private val name: String): Entity {
    fun sayName() = name
}

data class CatalogueId(private val rawValue: String): Identifier