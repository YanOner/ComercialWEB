package com.gmt.comercial.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InicioControler {

	@RequestMapping("/hola")
	@ResponseBody
	public String inicio(){
		return "Hola GMT 2017";
	}
	
	@RequestMapping(value = "/imagen", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> imagen(HttpServletRequest request, @RequestParam String nombre) throws IOException {
		System.out.println("imagen: "+nombre+new Date());
//		try {
//			FileInputStream in = new FileInputStream("E:/Android/Imagenes/calzado_amarillo.png");
//		    return IOUtils.toByteArray(in);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	    return null;
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_PNG);
//	    String real = request.getServletContext().getRealPath("");
	    ResponseEntity<byte[]> responseEntity = null;
		InputStream is;
		try {
//			is = new FileInputStream(new File(real+nombre));
			is = new FileInputStream("E:/Android/Imagenes/"+nombre);
			byte[] media = IOUtils.toByteArray(is);
//			byte[] media = IOUtils.toByteArray(is);
			headers.setContentLength(media.length);
			responseEntity = new ResponseEntity<>(media, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(null, null, HttpStatus.BAD_REQUEST);
		}
	    return responseEntity;
	}
	
	@RequestMapping(value = "/verCatalogo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ProductoBean> verCatalogo(){
		System.out.println("verCatalogo "+new Date());
		String[] demo = {"calzado_amarillo.png","calzado_rojo.png","calzado_verde.png","calzado_amarillo.png","calzado_rojo.png","calzado_verde.png","calzado_verde.png"};
		List<ProductoBean> lista = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			ProductoBean p = new ProductoBean();
			p.setNombre("Calzado "+i);
			p.setCodigo("COD "+i);
			p.setPrecio("S/. "+new Double(Math.random()*555.55).toString().substring(0, 6));
			int random = (int) (Math.random()*6);
			p.setNombreImagen(""+demo[random]);
			lista.add(p);
		}
		return lista;
=======

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InicioControler {

	@RequestMapping("/hola")
	@ResponseBody
	public String inicio(){
		return "Hola GMT 2017";
	}
	
	@RequestMapping(value = "/imagen", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> testphoto(HttpServletRequest request) throws IOException {
//		try {
//			FileInputStream in = new FileInputStream("E:/Android/Imagenes/calzado_amarillo.png");
//		    return IOUtils.toByteArray(in);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	    return null;
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_PNG);
//	    String real = request.getServletContext().getRealPath("");
	    ResponseEntity<byte[]> responseEntity = null;
		InputStream is;
		try {
//			is = new FileInputStream(new File(real+nombre));
			is = new FileInputStream("E:/Android/Imagenes/calzado_amarillo.png");
			byte[] media = IOUtils.toByteArray(is);
//			byte[] media = IOUtils.toByteArray(is);
			headers.setContentLength(media.length);
			responseEntity = new ResponseEntity<>(media, headers, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>(null, null, HttpStatus.BAD_REQUEST);
		}
	    return responseEntity;
>>>>>>> branch 'master' of https://github.com/YanOner/ComercialWEB.git
	}
}
