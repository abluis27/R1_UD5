package com.example.accessing_data_mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {
	@Autowired
	private PeliculaRepository repository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	    repository.deleteAll();
	   
	    
	    repository.save(new Pelicula("1","Pelicula1", "Descripcion1"));
	    repository.save(new Pelicula("2","Pelicula2", "Descripcion2"));
	    
	    System.out.println("Peliculas obetenidas con findAll():");
	    System.out.println("-------------------------------");
	    for (Pelicula pelicula : repository.findAll()) {
	      System.out.println(pelicula);
	    }
	    System.out.println();
	    
	    

	    // fetch para una pelicula individual
	    System.out.println("Pelicula found with findByNombre('Pelicula1'):");
	    System.out.println("--------------------------------");
	    System.out.println(repository.findByNombre("Pelicula1"));

	    
	    System.out.println("Peliculas found with findByDescrpicion('Descripcion1'):");
	    System.out.println("--------------------------------");
	    for (Pelicula pelicula : repository.findByDescripcion("Descripcion1")) {
	      System.out.println(pelicula);
	    }
	}

}
