package com.certus.spring.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Personaje {
	
	@NotEmpty(message = "Completar el nombre del personaje")
	private String nombres;
	
	@Size(min = 5, message = "El alias debe contener al menos 5 caracteres")
	private String alias;
	
	private String tipoFruta;
	private String habilidad;
	private String tripulacion;
	
	@NotEmpty(message = "Indicar la recompensa del personaje")
	private String reconpensa;
	
	
	
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getTipoFruta() {
		return tipoFruta;
	}
	public void setTipoFruta(String tipoFruta) {
		this.tipoFruta = tipoFruta;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	public String getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}
	public String getReconpensa() {
		return reconpensa;
	}
	public void setReconpensa(String reconpensa) {
		this.reconpensa = reconpensa;
	}
	
	

}
