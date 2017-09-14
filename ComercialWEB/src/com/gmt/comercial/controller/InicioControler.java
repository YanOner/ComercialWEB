package com.gmt.comercial.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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
	}
}
