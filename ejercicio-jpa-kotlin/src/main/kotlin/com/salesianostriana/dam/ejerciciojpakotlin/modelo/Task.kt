package com.salesianostriana.dam.ejerciciojpakotlin.modelo

import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
@Table(name = "task")
class Task(
        @get:Id
        @get:GeneratedValue
        @get:Column(name="id")
        var id: Long,

        @get:Column(name = "texto")
        @field:NotBlank(message="{task.texto.blank}")
        var texto: String,

        @get:Column(name = "fecha")
        var fecha: Date
){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val that = other as Task
        if (id != that.id) return false
        return true
    }

    override fun hashCode(): Int {
        return if (id != null)
            id.hashCode()
        else 0
    }
}