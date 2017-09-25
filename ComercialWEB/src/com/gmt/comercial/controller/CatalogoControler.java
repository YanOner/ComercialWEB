package com.gmt.comercial.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.ColorproductoMapper;
import com.gmt.comercial.dao.MaterialMapper;
import com.gmt.comercial.dao.ProductoMapper;
import com.gmt.comercial.dao.TallaMapper;
import com.gmt.comercial.dao.TemporadaMapper;
import com.gmt.comercial.dao.TipoproductoMapper;
import com.gmt.comercial.model.Colorproducto;
import com.gmt.comercial.model.ColorproductoExample;
import com.gmt.comercial.model.Material;
import com.gmt.comercial.model.MaterialExample;
import com.gmt.comercial.model.Producto;
import com.gmt.comercial.model.Talla;
import com.gmt.comercial.model.TallaExample;
import com.gmt.comercial.model.Temporada;
import com.gmt.comercial.model.TemporadaExample;
import com.gmt.comercial.model.Tipoproducto;
import com.gmt.comercial.model.TipoproductoExample;

@Controller
public class CatalogoControler {

	@Autowired
	ProductoMapper productoMapper;
	
	@Autowired
	TallaMapper tallaMapper;
	
	@Autowired
	TipoproductoMapper tipoproductoMapper;
	
	@Autowired
	ColorproductoMapper colorproductoMapper;
	
	@Autowired
	MaterialMapper materialMapper; 
	
	@Autowired
	TemporadaMapper temporadaMapper;
	
	@ResponseBody
	@RequestMapping("/buscarCatalogo")
	public List<Producto> buscarCatalogo(
			String descProducto,
			String descTipoProd,
			Integer descTalla, 
			String descColor,
			String descTemporada,
			Double precioIni,
			Double precioFin 
			){
		Map<String, Object> parametros = new HashMap<>();
		parametros.put("descProducto", "");
		parametros.put("descTipoProd", descTipoProd);
		parametros.put("descTalla", descTalla);
		parametros.put("descColor", descColor);
		parametros.put("descTemporada", descTemporada);
		parametros.put("precioIni", precioIni);
		parametros.put("precioFin", precioFin);
		return productoMapper.buscarCatalogo(parametros);
	}
	
	@ResponseBody
	@RequestMapping("/verTipoCalzados")
	public List<Tipoproducto> verTipoCalzados(){
		return tipoproductoMapper.selectByExample(new TipoproductoExample());
	}

	@ResponseBody
	@RequestMapping("/verTallas")
	public List<Talla> verTallas(){
		return tallaMapper.selectByExample(new TallaExample());
	}

	@ResponseBody
	@RequestMapping("/verColores")
	public List<Colorproducto> verColores(){
		return colorproductoMapper.selectByExample(new ColorproductoExample());
	}
	
	@ResponseBody
	@RequestMapping("/verMateriales")
	public List<Material> verMateriales(){
		return materialMapper.selectByExample(new MaterialExample());
	}
	
	@ResponseBody
	@RequestMapping("/verTemporadas")
	public List<Temporada> verTemporadas(){
		return temporadaMapper.selectByExample(new TemporadaExample());
	}

	@ResponseBody
	@RequestMapping("/verDetalleCalzado")
	public Map<String, Object> verDetalleCalzado(
			Integer idProducto
//			Integer idColor,
//			String flag
			){
		Map<String, Object> parametros = new HashMap<>();
		parametros.put("idProducto", idProducto);
		parametros.put("idColor", 0);
		parametros.put("flag", '1');
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("detalle", productoMapper.detalleProducto(parametros));
		
		parametros.put("flag", '2');
		List<Producto> colores = productoMapper.detalleProducto(parametros);
		mapa.put("colores", colores);
		
		parametros.put("flag", '3');
		parametros.put("idColor", colores.get(0).getIdColor());
		mapa.put("tallas", productoMapper.detalleProducto(parametros));
		return mapa;
	}

}
