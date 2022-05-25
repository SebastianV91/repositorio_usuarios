package com.crud.proyecto.dto;

import java.io.Serializable;

public class Paseadores implements Serializable{

	private static final long serialVersionUID = 3514047894891029401L;

/*	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;										*/
	
	private String nombre;
	
	private String apellido;
	
	private Integer edad;
	
	private String telefono;
	
	private String estado;

/*	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}																									*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
