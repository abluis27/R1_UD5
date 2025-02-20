package com.example.apartado1_2.repository;

import com.example.apartado1_2.model.Pelicula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "peliculas", path="peliculas")
public interface PeliculaRepository extends MongoRepository<Pelicula, Long> {
    List<Pelicula> findByNombre(@Param("nombre") String nombre);
}
