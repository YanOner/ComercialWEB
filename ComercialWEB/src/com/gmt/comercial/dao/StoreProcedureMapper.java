package com.gmt.comercial.dao;

import java.util.Map;

public interface StoreProcedureMapper {

	Map<String, Object> registrarCabecera(Map<String, Object> mapa);
	Map<String, Object> registrarDetalle(Map<String, Object> mapa);
	
}
