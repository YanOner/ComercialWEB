package com.gmt.comercial.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmt.comercial.bean.Usuario;
import com.gmt.comercial.dao.ComunDAO;

@Service
public class ComunService {

	@Autowired
	ComunDAO comunDAO;
	
	public List<Map<String, String>> prueba(){
		return comunDAO.prueba();
	}
	
	public List<Usuario> usuarios(){
		return comunDAO.usuarios();
	}
	
}
