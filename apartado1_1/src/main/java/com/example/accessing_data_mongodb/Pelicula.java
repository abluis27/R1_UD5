package com.example.accessing_data_mongodb;

import org.springframework.data.annotation.Id;

public class Pelicula {
	
	@Id
	public String id;
	public String nombre;
	public String descripcion;
	
	
	public Pelicula() {}
	public Pelicula(String id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
