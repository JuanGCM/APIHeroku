package com.salesianostriana.dam.ejerciciojpakotlin.data

import com.salesianostriana.dam.ejerciciojpakotlin.repositorio.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class InitDataComponent {

    @Autowired
    lateinit var taskRepository : TaskRepository

    @PostConstruct
    fun initData() {

    }

}