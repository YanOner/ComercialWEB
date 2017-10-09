package com.gmt.comercial.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.CostoubigeoMapper;
import com.gmt.comercial.dao.StoreProcedureMapper;
import com.gmt.comercial.dao.VentaMapper;
import com.gmt.comercial.model.Costoubigeo;
import com.gmt.comercial.model.Venta;

@Controller
public class PedidoControler {

	@Autowired
	CostoubigeoMapper costoubigeoMapper;
	
	@Autowired
	VentaMapper ventaMapper;
	
	@Autowired
	StoreProcedureMapper storeProcedureMapper;
	
	@ResponseBody
	@RequestMapping("/registrarPedido")
	public Venta registrarPedido(
				int ParmIdCliente,                                                  
				double ParmTotal,                                            
				int ParmNroCuotas,                                                  
				String ParmTipoRecojo,                                              
				String ParmNumOperaBancaria,                                                 
				String ParmCodTrxTarjeta,                                              
				String ParmCodUbigeoCosto,                                                  
				int ParmIdFomaPago, 
				String ParmDireccionEntrega,                                                  
				int ParmIdBanco, 
				String ParmNroCuenta,
				int ParmIdProducto,                                                  
				int ParmIdColorProducto,
				int ParmNroTalla,                                                  
				int ParmCantidad                                                  
			){
		try {
			Map<String, Object> parametros = new HashMap<>();
			parametros.put("ParmIdVenta", 0);//                                                 
			parametros.put("ParmIdCliente", ParmIdCliente);                                                
			parametros.put("ParmTotal", ParmTotal);                                         
			parametros.put("ParmNroCuotas", ParmNroCuotas);                                                 
			parametros.put("ParmTipoRecojo", ParmTipoRecojo);                                           
			parametros.put("ParmNumOperaBancaria", ParmNumOperaBancaria);                                                 
//			parametros.put("ParmFechaOperaBancaria", ParmNumOperaBancaria);//                                                 
			parametros.put("ParmCodTrxTarjeta", ParmCodTrxTarjeta);//                                             
//			parametros.put("ParmFechTrxTarjeta", null);//                                                   
			parametros.put("ParmCodUbigeoCosto", ParmCodUbigeoCosto);                                                
			parametros.put("ParmIdFomaPago", ParmIdFomaPago);
			parametros.put("ParmDireccionEntrega", ParmDireccionEntrega);
			parametros.put("ParmIdBanco", ParmIdBanco);
			parametros.put("ParmNroCuenta", ParmNroCuenta);                                               
			parametros.put("TipoMantenimiento", "I");
			storeProcedureMapper.registrarCabecera(parametros);
			parametros.put("ParmIdVenta", 0);//                                                  
			parametros.put("ParmIdProducto", ParmIdProducto);                                                  
			parametros.put("ParmIdColorProducto", ParmIdColorProducto); 
			parametros.put("ParmNroTalla", ParmNroTalla);                                                  
			parametros.put("ParmCantidad", ParmCantidad);                                                 
//			parametros.put("ParmPrecioUnitario", Parmpr);//
//			storeProcedureMapper.registrarDetalle(parametros);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/departamentos")
	public List<Costoubigeo> departamentos(){
		try {
			return costoubigeoMapper.selectDepartamento();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@ResponseBody
	@RequestMapping("/provincias")
	public List<Costoubigeo> provincias(String codUbigeoCosto){
		try {
			return costoubigeoMapper.selectProvincia(codUbigeoCosto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	
	@ResponseBody
	@RequestMapping("/distritos")
	public List<Costoubigeo> distritos(String codUbigeoCosto){
		try {
			return costoubigeoMapper.selectDistrito(codUbigeoCosto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
