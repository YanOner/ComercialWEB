package com.gmt.comercial.service;

import java.util.List;
import java.util.Map;

import com.gmt.comercial.bean.Usuario;

public interface ComunDAO {

	List<Map<String, String>> prueba();
	List<Usuario> usuarios();
	
}