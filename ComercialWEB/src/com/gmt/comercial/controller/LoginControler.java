package com.gmt.comercial.controller;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.ClienteMapper;
import com.gmt.comercial.dao.UsuarioMapper;
import com.gmt.comercial.model.Cliente;
import com.gmt.comercial.model.ClienteExample;
import com.gmt.comercial.model.Usuario;

@Controller
public class LoginControler {

	private static final Log log = LogFactory.getLog(LoginControler.class);
	
	@Autowired
	UsuarioMapper usuarioMapper;
	
	@Autowired
	ClienteMapper clienteMapper;
	
	@ResponseBody
	@RequestMapping("/login")
	public Usuario login(String codUsuario, String password){
		Usuario u = usuarioMapper.selectByPrimaryKey(codUsuario);
		if(password.equals(u.getPassword())){
			return u;
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("/registrarUsuario")
	public int registrarUsuario(
			String nombres,
		    String apellidoPaterno,
		    String apellidoMaterno,
		    String fechaNacimiento,
		    String nroDocumentoIdentidad,
		    String RUC,
		    String celular,
		    String correo,
		    String usuario,
		    String password
			){
		try {
			//http://localhost:8080/ComercialWEB/registrarUsuario?nombres=1&apellidoPaterno=1&apellidoMaterno=1&fechaNacimiento=1&nroDocumentoIdentidad=1&RUC=1&celular=1&correo=1&usuario=prueba&password=prueba
			ClienteExample ce = new ClienteExample();
			ce.setOrderByClause("idCliente DESC");
			Cliente ultimo = clienteMapper.selectByExample(ce).get(0);
			Cliente cli = new Cliente();
			cli.setIdCliente(ultimo.getIdCliente()+1);
			cli.setNombres(nombres);
			cli.setApellidoPaterno(apellidoPaterno);
			cli.setApellidoMaterno(apellidoMaterno);
			//convertir la fecha de nacimiento
			cli.setFechaNacimiento(new Date());
			cli.setNroDocumentoIdentidad(nroDocumentoIdentidad);
			cli.setRUC(RUC);
			cli.setCelular(celular);
			cli.setEstado("1");
			cli.setFechaCreacion(new Date());
			int idCliente = clienteMapper.insertSelective(cli);
			log.info("idCliente: "+idCliente);
			Usuario usu = new Usuario();
			usu.setCodUsuario(usuario);
			usu.setIdCliente(idCliente);
			usu.setPassword(password);
			usu.setFechaCreacion(new Date());
			usu.setCorreoElectronico(correo);
			usu.setEstado("1");
			usu.setIdTipoUsuario(1);//Cliente
			int resultado = usuarioMapper.insert(usu);
			log.info("resultado: "+resultado);
			return 1;//exito
		} catch (Exception e) {
			log.error(e);
			return 0;//error
		}
	}
	
}
