package com.gmt.comercial.controller;

import java.io.Serializable;

public class ProductoBean implements Serializable{
	private static final long serialVersionUID = -4979194257493301560L;
	
	private String nombre;
	private String codigo;
    private String precio;
    private String nombreImagen;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getNombreImagen() {
		return nombreImagen;
	}
	public void setNombreImagen(String nombreImagen) {
		this.nombreImagen = nombreImagen;
	}
    
}
