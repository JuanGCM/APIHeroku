package com.salesianostriana.dam.ejerciciojpakotlin.DTO

import com.fasterxml.jackson.annotation.JsonInclude
import java.util.*
import javax.persistence.Column
import javax.validation.constraints.NotBlank

data class EditTaskDto(
        @get:NotBlank(message="{task.texto.blank}") var texto: String,
        @get:Column(name = "fecha") var fecha: Date

)

data class GetTaskDto(
        var id: Long?,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        var texto: String,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        var fecha: Date
)

