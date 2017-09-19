package com.gmt.comercial.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
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

	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping("/hola")
	@ResponseBody
	public String inicio(){
		return "Hola GMT 2017";
	}
	
	@RequestMapping(value = "/verImagen", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> imagen(HttpServletRequest request, @RequestParam String nombre) throws IOException {
		log.info("imagen: "+nombre+new Date());
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.IMAGE_PNG);
	    ResponseEntity<byte[]> responseEntity = null;
		InputStream is;
		try {
			is = new FileInputStream("D:/Android/Imagenes/"+nombre);
//			is = new FileInputStream("E:/Android/Imagenes/"+nombre);
			byte[] media = IOUtils.toByteArray(is);
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
	public List<ProductoBean> verCatalogo(@RequestParam String precio){
		log.info("verCatalogo "+new Date());
		log.info("precio: "+precio);
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
	}
	//Combo de Precios
	@RequestMapping(value = "/verPrecios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> verPrecios(){
		log.info("verPrecios "+new Date());
		List<String> lista = new ArrayList<>();
		lista.add("Precios");
		lista.add("De S/. 25 a 50");
		lista.add("De S/. 50 a 100");
		lista.add("De S/. 100 a 150");
		lista.add("De S/. 150 a 200");
		lista.add("De S/. 200 a más");
		return lista;
	}
	
	//Combo de Talla
	@RequestMapping(value = "/verTallas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> verTallas(){
		log.info("verTallas "+new Date());
		List<String> lista = new ArrayList<>();
		lista.add("Tallas");
		lista.add("35");
		lista.add("36");
		lista.add("37");
		lista.add("38");
		lista.add("39");
		return lista;
	}
	
	//Combo Tipo de Calzado
	@RequestMapping(value = "/verTipoCalzado", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> verTipoCalzado(){
		log.info("verTipoCalzado "+new Date());
		List<String> lista = new ArrayList<>();
		lista.add("Tipo de Calzado");
		lista.add("Botas");
		lista.add("Botines");
		lista.add("Sandalias");
		return lista;
	}
	
	//Combo Tipo de Taco
	@RequestMapping(value = "/verTipoTacoCalzado", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> verTipoTacoCalzado(){
		log.info("verTipoTacoCalzado "+new Date());
		List<String> lista = new ArrayList<>();
		lista.add("Tipo de Taco");
		lista.add("Chino");
		lista.add("Plataforma");
		lista.add("Cuadrado");
		lista.add("Fino");
		return lista;
	}
	
	//verDetallePedido
	@RequestMapping(value = "/verDetalleCalzado", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ProductoBean verDetalleCalzado(@RequestParam String codigo){
		log.info("verDetallePedido: " + new Date());
		log.info("codigo: " + codigo);
		
		ProductoBean p = new ProductoBean();
		p.setNombre("Calzado 01");
		p.setCodigo("001");
		p.setPrecio("S/. 50");
		p.setNombreImagen("Zapato");
		p.setMaterialCalzado("Cuero");
		p.setListaTallas("36,37,38");
		p.setMaterialTaco("Madera");
		p.setMaterialForro("Cuero");
		p.setMaterialPlanta("Caucho");
		p.setMaterialPlantilla("Plastico");
		
		
		return p;
	}
	
}
























