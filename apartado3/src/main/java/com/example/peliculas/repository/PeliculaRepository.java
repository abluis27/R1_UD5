package com.example.peliculas.repository;

import com.example.peliculas.model.Pelicula;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PeliculaRepository extends Neo4jRepository<Pelicula, Long> {
    Pelicula findByNombre(String nombre);
}
