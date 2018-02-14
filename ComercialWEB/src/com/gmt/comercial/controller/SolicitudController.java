package com.gmt.comercial.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmt.comercial.dao.SolicitudMapper;
import com.gmt.comercial.model.Solicitud;
import com.gmt.comercial.model.SolicitudExample;
import com.gmt.comercial.model.SolicitudExample.Criteria;

@Controller
public class SolicitudController {

	@Autowired
	SolicitudMapper solicitudMapper;
	
	@ResponseBody
	@RequestMapping("/registrarSolicitud")
	public int registrarSolicitud(
				Integer idCliente,
				String codUsuario, 
				BigDecimal montoIncrementoCredito
			) {
		try {
			Solicitud s = new Solicitud();
			s.setIdCliente(idCliente);
			s.setCodUsuario(codUsuario);
			s.setIdtiposolicitud(1);
			s.setIdestadosolicitud(1);
			s.setFechaSolicitud(new Date());
			s.setUsuarioGeneroSolicitud(codUsuario);
			s.setMontoIncrementoCredito(montoIncrementoCredito);
			s.setEstado("1");
			return solicitudMapper.insertSelective(s);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@ResponseBody
	@RequestMapping("/listaSolicitudes")
	public List<Solicitud> listaSolicitudes(
				Integer idCliente,
				String 	codUsuario
			){
		List<Solicitud> lista = new ArrayList<>();
		try {
			SolicitudExample example = new SolicitudExample();
			example.setOrderByClause("1 desc");
			Criteria criteria = example.createCriteria();
			criteria.andIdClienteEqualTo(idCliente).andCodUsuarioEqualTo(codUsuario).andEstadoEqualTo("1");
			return solicitudMapper.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
}
