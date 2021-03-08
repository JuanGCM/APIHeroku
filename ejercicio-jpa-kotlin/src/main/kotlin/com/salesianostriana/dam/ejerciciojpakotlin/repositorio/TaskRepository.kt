package com.salesianostriana.dam.ejerciciojpakotlin.repositorio

import com.salesianostriana.dam.ejerciciojpakotlin.modelo.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Long>, JpaRepository<Task,Long> {
}