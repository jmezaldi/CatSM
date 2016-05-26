package com.yanbal.catalogo.util;

import com.yanbal.catalogo.util.Propiedad;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;

public class YanbalUtil {
	
	public static String obtenerPropiedadPorId(Object identify,
			String keyProperty) {

		StringBuilder keyRaizGeneral = new StringBuilder();
		keyRaizGeneral.append(identify);
		keyRaizGeneral.append(ConstantesComunes.SEPARADOR_PROPERTIES);
		keyRaizGeneral.append(keyProperty);

		return obtenerPropiedad(keyRaizGeneral.toString());
	}

	public static String obtenerPropiedad(String keyProperty) {
		return convertirObjetoACadena(Propiedad.getValue(keyProperty));
	}
	
	public static String convertirObjetoACadena(Object objeto) {
		return objeto != null ? objeto.toString().trim() : null;
	}
	
	private static boolean esNumero(String str){
	    for (int i = 0; i < str.length(); i++) {
	        
	        //If we find a non-digit character we return false.
	        if (!Character.isDigit(str.charAt(i)))
	        return false;
	        }
	         
	        return true;
	}
}
