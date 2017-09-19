package com.gmt.comercial.bean;

import java.io.Serializable;
import java.sql.Date;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 2160890327378176464L;

	private int IdCliente;
	private String CodUsuario;
	private String Password;
	private Date FechaCreacion;
	private String CorreoElectronico;
	private char Estado;
	private int IdTipoUsuario;
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getCodUsuario() {
		return CodUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		CodUsuario = codUsuario;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public String getCorreoElectronico() {
		return CorreoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}
	public char getEstado() {
		return Estado;
	}
	public void setEstado(char estado) {
		Estado = estado;
	}
	public int getIdTipoUsuario() {
		return IdTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		IdTipoUsuario = idTipoUsuario;
	}
	
}
