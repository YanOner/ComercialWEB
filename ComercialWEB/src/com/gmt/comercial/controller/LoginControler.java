package com.gmt.comercial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.UsuarioMapper;
import com.gmt.comercial.model.Usuario;

@Controller
public class LoginControler {

	@Autowired
	UsuarioMapper usuarioMapper;
	
	@RequestMapping("/login")
	@ResponseBody
	public Usuario login(String codUsuario, String password){
		Usuario u = usuarioMapper.selectByPrimaryKey(codUsuario);
		if(password.equals(u.getPassword())){
			return u;
		}
		return null;
	}
	
}
