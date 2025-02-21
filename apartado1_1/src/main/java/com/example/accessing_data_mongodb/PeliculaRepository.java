package com.example.accessing_data_mongodb;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeliculaRepository extends MongoRepository<Pelicula, String> {

	public Pelicula findByNombre(String nombre);
	public List<Pelicula> findByDescripcion(String descripcion);
	
}
