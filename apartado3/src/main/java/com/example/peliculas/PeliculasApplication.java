package com.example.peliculas;

import com.example.peliculas.model.Pelicula;
import com.example.peliculas.repository.PeliculaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculasApplication.class, args);
		System.exit(0);
	}

	@Bean
	CommandLineRunner demo(PeliculaRepository peliculaRepository) {
		return args -> {
			// Borrar todas las películas previas
			peliculaRepository.deleteAll();

			// Crear algunas películas
			List<Pelicula> peliculas = new ArrayList<>();
			peliculas.add(
					new Pelicula("Inception",
							"Christopher Nolan", "Ciencia Ficción"));
			peliculas.add(
					new Pelicula("Interstellar",
							"Christopher Nolan", "Ciencia Ficción"));
			peliculas.add(new Pelicula("The Matrix", "The Wachowskis", "Acción"));

			// Guardar en Neo4j
			peliculaRepository.saveAll(peliculas);

			// Buscar y mostrar películas guardadas
			List<Pelicula> peliculasGuardadas = peliculaRepository.findAll();
			peliculasGuardadas.forEach(
					pelicula -> System.out.println(pelicula + "\n")
			);

			// Buscar por nombre
			Pelicula peliculaBuscada = peliculaRepository.findByNombre("Inception");
			System.out.println("Peliculas buscada: " + peliculaBuscada);
		};
	}

}
