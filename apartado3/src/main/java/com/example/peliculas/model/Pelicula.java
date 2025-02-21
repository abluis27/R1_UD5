package com.example.peliculas.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Pelicula {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String director;
    private String clasificacion;

    public Pelicula(String nombre, String director, String clasificacion) {
        this.nombre = nombre;
        this.director = director;
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String toString() {
        return String.format("ID: %d%nTitulo: %s%nDirector: %s%nClasificacion: %s",
        id, nombre, director, clasificacion);
    }
}

