package com.salesianostriana.dam.ejerciciojpakotlin.error

open class EntityNotFoundException(val msg: String) : RuntimeException(msg)

/**
 * Concreción de la clase EntityNotFoundException, indicando que la búsqueda de una entidad
 * no ha sido satisfactoria y debemos devolver un código 404
 */
data class SingleEntityNotFoundException(
        val id: String,
        val javaClass: Class<out Any>
) : EntityNotFoundException("No se puede encontrar la entidad de tipo ${javaClass.name} con ID: ${id}")

/**
 * Concreción de la clase EntityNotFoundException, indicando que la búsqueda de conjunto de entidades
 * no ha sido satisfactoria y debemos devolver un código 404
 */
data class ListEntityNotFoundException(
        val javaClass: Class<out Any>
) : EntityNotFoundException("No se pueden encontrar elementos del tipo ${javaClass.name} para esa consulta")