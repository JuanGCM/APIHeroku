package com.salesianostriana.dam.ejerciciojpakotlin.controlador

import com.salesianostriana.dam.ejerciciojpakotlin.DTO.EditTaskDto
import com.salesianostriana.dam.ejerciciojpakotlin.error.ListEntityNotFoundException
import com.salesianostriana.dam.ejerciciojpakotlin.error.SingleEntityNotFoundException
import com.salesianostriana.dam.ejerciciojpakotlin.modelo.Task
import com.salesianostriana.dam.ejerciciojpakotlin.repositorio.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
class TaskController{

    @Autowired
    lateinit var repoTask: TaskRepository

    @GetMapping("/task")
    fun tasks(): MutableIterable<Task> {

        repoTask.save(Task(545615641,"Actividad de bioliogia", Date(21/3/21)));
        repoTask.save(Task(654485514,"Proyecto de Ingles", Date(16/4/21)));
        repoTask.save(Task(851561155,"Estudiar para el examen de mates", Date(25/4/21)));
        repoTask.save(Task(554515178,"Practicar para el baile", Date(12/4/21)));
        repoTask.save(Task(104514510,"Hacer la cama antes de la 6", Date(2/4/21)));
        repoTask.save(Task(450450454,"Comprar un nuevo boli", Date(6/3/21)));
        repoTask.save(Task(952005548,"Sacar a pasear al perro", Date(11/3/21)));
        repoTask.save(Task(997151055,"Hacer la pagina 35 y 36 de Geografia", Date(15/3/21)));
        repoTask.save(Task(645454555,"Alimentar al gato y al loro", Date(29/4/21)));

        return repoTask.findAll()
                .takeIf { it.isNotEmpty() } ?:
                throw ListEntityNotFoundException(Task::class.java)
    }

    @GetMapping("/task/{id}")
    fun taskById(@PathVariable id:Long) = repoTask.findById(id).orElseThrow {
        SingleEntityNotFoundException(id.toString(), Task::class.java)
    }


    @PostMapping("/task")
    fun newTask(@Valid @RequestBody id:Long, @RequestBody text: String, @RequestBody fech:Date) = repoTask.save(Task(id = id,texto = text,fecha = fech))

    @PutMapping("/task/{id}")
    fun update(@PathVariable id: Long, @RequestBody tarea: Task): Task {
        val toUpdate: Task = repoTask.findById(id).orElseThrow { Exception("server error") }
        toUpdate.texto = tarea.texto
        toUpdate.fecha = tarea.fecha
        return repoTask.save(toUpdate)
    }


    @DeleteMapping("/task/{id}")
    fun delete (@PathVariable id: Long) : ResponseEntity<Any> {
        if (repoTask.existsById(id))
            repoTask.deleteById(id)
        return ResponseEntity.noContent().build()
    }
}