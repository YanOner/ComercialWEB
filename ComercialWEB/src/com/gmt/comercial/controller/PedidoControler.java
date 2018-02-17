package com.gmt.comercial.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.BancosMapper;
import com.gmt.comercial.dao.CostoubigeoMapper;
import com.gmt.comercial.dao.StoreProcedureMapper;
import com.gmt.comercial.dao.VentaMapper;
import com.gmt.comercial.model.Bancos;
import com.gmt.comercial.model.BancosExample;
import com.gmt.comercial.model.Costoubigeo;
import com.gmt.comercial.model.Usuario;
import com.gmt.comercial.model.Venta;
import com.gmt.comercial.model.VentaExample;
import com.gmt.comercial.model.VentaExample.Criteria;

@Controller
public class PedidoControler {

	private static final Log log = LogFactory.getLog(PedidoControler.class);
	
	@Autowired
	CostoubigeoMapper costoubigeoMapper;
	
	@Autowired
	VentaMapper ventaMapper;
	
	@Autowired
	BancosMapper bancosMapper; 

	@Autowired
	StoreProcedureMapper storeProcedureMapper;
	
	@ResponseBody
	@RequestMapping("/registrarPedido")
	public int registrarPedido(
				HttpServletRequest request,
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
			Usuario u = (Usuario) request.getSession().getAttribute("usuarioSESION");
			if(u == null) {
				throw new Exception("SESION EXPIRADA");
			}
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
			log.info("resultado: "+resultado);
			//DETALLE
			log.info("tramaPedido: "+tramaPedido);
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
				log.info("resultadoDetalle: "+resultadoDetalle);
			}
			
			return (Integer)resultado.get("Resultado");
		} catch (Exception e) {
			log.error(e);
		}
		return 0;
	}
	
	@ResponseBody
	@RequestMapping("/departamentos")
	public List<Costoubigeo> departamentos(){
		try {
			return costoubigeoMapper.selectDepartamento();
		} catch (Exception e) {
			log.error(e);
		}
		return new ArrayList<>();
	}

	@ResponseBody
	@RequestMapping("/provincias")
	public List<Costoubigeo> provincias(String codUbigeoCosto){
		try {
			return costoubigeoMapper.selectProvincia(codUbigeoCosto);
		} catch (Exception e) {
			log.error(e);
		}
		return new ArrayList<>();
	}
	
	@ResponseBody
	@RequestMapping("/distritos")
	public List<Costoubigeo> distritos(String codUbigeoCosto){
		try {
			return costoubigeoMapper.selectDistrito(codUbigeoCosto);
		} catch (Exception e) {
			log.error(e);
		}
		return new ArrayList<>();
	}
	
	@ResponseBody
	@RequestMapping("/bancos")
	public List<Bancos> bancos(String codUbigeoCosto){
		try {
			return bancosMapper.selectByExample(new BancosExample());
		} catch (Exception e) {
			log.error(e);
		}
		return new ArrayList<>();
	}
	
	@ResponseBody
	@RequestMapping("/pedidosXestado")
	public List<Venta> pedidosPendientes(Integer idCliente, Integer idEstadoVenta){
		try {
			VentaExample example = new VentaExample();
			Criteria criteria = example.createCriteria();
			criteria.andIdClienteEqualTo(idCliente).andIdEstadoVentaEqualTo(idEstadoVenta);
			return ventaMapper.selectByExample(example);
		} catch (Exception e) {
			log.error(e);
		}
		return new ArrayList<>();
	}
}