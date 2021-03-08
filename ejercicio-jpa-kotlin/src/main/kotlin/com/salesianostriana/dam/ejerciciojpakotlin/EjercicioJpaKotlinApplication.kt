package com.salesianostriana.dam.ejerciciojpakotlin

import com.salesianostriana.dam.ejerciciojpakotlin.modelo.Task
import com.salesianostriana.dam.ejerciciojpakotlin.repositorio.TaskRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class EjercicioJpaKotlinApplication

fun main(args: Array<String>) {
	runApplication<EjercicioJpaKotlinApplication>(*args)
}
/*
@Bean
fun init(repoTask: TaskRepository)=CommandLineRunner{

	repoTask.save(Task(545615641,"Actividad de bioliogia", Date(21/3/21)));
	repoTask.save(Task(654485514,"Proyecto de Ingles", Date(16/4/21)));
	repoTask.save(Task(851561155,"Estudiar para el examen de mates", Date(25/4/21)));
	repoTask.save(Task(554515178,"Practicar para el baile", Date(12/4/21)));
	repoTask.save(Task(104514510,"Hacer la cama antes de la 6", Date(2/4/21)));
	repoTask.save(Task(450450454,"Comprar un nuevo boli", Date(6/3/21)));
	repoTask.save(Task(952005548,"Sacar a pasear al perro", Date(11/3/21)));
	repoTask.save(Task(997151055,"Hacer la pagina 35 y 36 de Geografia", Date(15/3/21)));
	repoTask.save(Task(645454555,"Alimentar al gato y al loro", Date(29/4/21)));

}
*/