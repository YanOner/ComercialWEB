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
	public int registrarPedido(
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
				String ParmTipoDocumento,
				String ParmRuc,
				String ParmRazonSocial,
				String ParmIdTipoUsuario,
				String tramaPedido
//				int ParmIdProducto,                                                  
//				int ParmIdColorProducto,
//				int ParmNroTalla,                                                  
//				int ParmCantidad                                                  
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
			parametros.put("ParmTipoDocumento", ParmTipoDocumento);  
			parametros.put("ParmRuc", ParmRuc);  
			parametros.put("ParmRazonSocial", ParmRazonSocial);                                               
			parametros.put("TipoMantenimiento", "I");
			Map<String, Object> resultado = storeProcedureMapper.registrarCabecera(parametros);
			System.out.println("resultado: "+resultado);
			//DETALLE
			System.out.println("tramaPedido: "+tramaPedido);
			String[] arrayProductos = tramaPedido.split(";");
			for (int i = 0; i < arrayProductos.length; i++) {
				String producto = arrayProductos[i];
//				if(producto.length() == 0){
//					break;
//				}
				String[] datos = producto.split(",");
//				parametros.put("ParmIdVenta", 0);//                                                  
				parametros.put("ParmIdProducto", datos[0]);                                                  
				parametros.put("ParmIdColorProducto", datos[1]); 
				parametros.put("ParmNroTalla", datos[2]);                                                  
				parametros.put("ParmCantidad", datos[3]);                                                 
				parametros.put("ParmIdTipoUsuario", ParmIdTipoUsuario);//
				Map<String, Object> resultadoDetalle = storeProcedureMapper.registrarDetalle(parametros);
				System.out.println("resultadoDetalle: "+resultadoDetalle);
			}
			
			return (Integer)resultado.get("Resultado");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
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