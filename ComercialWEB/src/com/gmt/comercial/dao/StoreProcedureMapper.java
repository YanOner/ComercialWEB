package com.gmt.comercial.dao;

import java.util.Map;

public interface StoreProcedureMapper {

	void registrarCabecera(Map<String, Object> mapa);
	void registrarDetalle(Map<String, Object> mapa);
	
}
