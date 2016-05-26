package com.yanbal.catalogo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/*
 * @(#)Validacion.java
 * Copyright 2015 Yanbal International Corporation. Derechos reservados. 
 * YANBAL CONFIDENCIAL. Esta clase esta sujeto a los términos de licencia. 
 */

/**
 * Clase encargada de mapear las validaciones de los campos del formulario.
 * 
 * @version 1.0, 15/11/2015
 * @author fayala
 * @since 1.0
 */

@JsonInclude(Include.NON_NULL)
public class Validacion {

	/**
	 * Tipo de Dato del campo del formulario.
	 */
	private String tipoDato;

	/**
	 * Longitud maxima del campo del formulario.
	 */
	private String tamanioMaximo;

	/**
	 * Longitud minima del campo del formulario.
	 */
	private String tamanioMinimo;

	/**
	 * Longitud exacta del campo del formulario.
	 */
	private String tamanioExacto;

	/**
	 * Formato del campo del formulario.
	 */
	private String formato;

	/**
	 * Mensaje del formato del campo del formulario.
	 */
	private String mensajeFormato;

	/**
	 * Mensaje del tipo de Dato del campo del formulario.
	 */
	private String mensajeTipoDato;

	/**
	 * Mensaje obligatorio del campo del formulario.
	 */
	private String mensajeObligatorio;

	/**
	 * Mensaje de la longitud maxima del campo del formulario.
	 */
	private String mensajeMaximo;

	/**
	 * Mensaje de la longitud minima del campo del formulario.
	 */
	private String mensajeMinimo;

	/**
	 * Mensaje de la longitud exacta del campo del formulario.
	 */
	private String mensajeExacto;

	/**
	 * Mensaje de comparacion de igualdad de campos del formulario.
	 */
	private String mensajeComparacion;

	/**
	 * Mensaje de comparacion de mayor de campos del formulario.
	 */
	private String mensajeComparacionMayor;

	/**
	 * Mensaje de comparacion de menor de campos del formulario.
	 */
	private String mensajeComparacionMenor;

	/**
	 * Mensaje de valor minimo de campos del formulario.
	 */
	private String mensajeValorMinimo;

	/**
	 * Mensaje de valor maximo de campos del formulario.
	 */
	private String mensajeValorMaximo;

	/**
	 * Valor minimo de campos del formulario.
	 */
	private String valorMinimo;

	/**
	 * Valor maximo de campos del formulario.
	 */
	private String valorMaximo;

	/**
	 * Obligatorio de al menos 1 campo del grupo
	 */
	private String clasegrupo1obligatorio;

	/**
	 * Mensaje Obligatorio por combo.
	 */
	private String mensajeObligatorioPorCombo;

	/**
	 * Codigo de validacion.
	 */
	private Integer codigoValidacion;

	/**
	 * Mensaje de comparacion de valor diferente.
	 */
	private String mensajeComparacionDiferente;

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeComparacionDiferente
	 * @since 1.0
	 */
	public String getMensajeComparacionDiferente() {
		return mensajeComparacionDiferente;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param tipoDato
	 *            asigna el valor a tipoDato
	 * @since 1.0
	 */
	public void setMensajeComparacionDiferente(
			String mensajeComparacionDiferente) {
		this.mensajeComparacionDiferente = mensajeComparacionDiferente;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el tipoDato
	 * @since 1.0
	 */
	public String getTipoDato() {
		return tipoDato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param tipoDato
	 *            asigna el valor a tipoDato
	 * @since 1.0
	 */

	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el tamanioMaximo
	 * @since 1.0
	 */
	public String getTamanioMaximo() {
		return tamanioMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param tamanioMaximo
	 *            asigna el valor a tamanioMaximo
	 * @since 1.0
	 */

	public void setTamanioMaximo(String tamanioMaximo) {
		this.tamanioMaximo = tamanioMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 04/11/2015
	 * @return el tamanioMinimo
	 * @since 1.0
	 */
	public String getTamanioMinimo() {
		return tamanioMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 04/11/2015
	 * @param tamanioMinimo
	 *            asigna el valor a tamanioMinimo
	 * @since 1.0
	 */
	public void setTamanioMinimo(String tamanioMinimo) {
		this.tamanioMinimo = tamanioMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el tamanioExacto
	 * @since 1.0
	 */
	public String getTamanioExacto() {
		return tamanioExacto;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param tamanioExacto
	 *            asigna el valor a tamanioExacto
	 * @since 1.0
	 */

	public void setTamanioExacto(String tamanioExacto) {
		this.tamanioExacto = tamanioExacto;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el formato
	 * @since 1.0
	 */
	public String getFormato() {
		return formato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param formato
	 *            asigna el valor a formato
	 * @since 1.0
	 */

	public void setFormato(String formato) {
		this.formato = formato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeFormato
	 * @since 1.0
	 */
	public String getMensajeFormato() {
		return mensajeFormato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeFormato
	 *            asigna el valor a mensajeFormato
	 * @since 1.0
	 */

	public void setMensajeFormato(String mensajeFormato) {
		this.mensajeFormato = mensajeFormato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeTipoDato
	 * @since 1.0
	 */
	public String getMensajeTipoDato() {
		return mensajeTipoDato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeTipoDato
	 *            asigna el valor a mensajeTipoDato
	 * @since 1.0
	 */
	public void setMensajeTipoDato(String mensajeTipoDato) {
		this.mensajeTipoDato = mensajeTipoDato;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeObligatorio
	 * @since 1.0
	 */
	public String getMensajeObligatorio() {
		return mensajeObligatorio;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeObligatorio
	 *            asigna el valor a mensajeObligatorio
	 * @since 1.0
	 */
	public void setMensajeObligatorio(String mensajeObligatorio) {
		this.mensajeObligatorio = mensajeObligatorio;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeMaximo
	 * @since 1.0
	 */
	public String getMensajeMaximo() {
		return mensajeMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeMaximo
	 *            asigna el valor a mensajeMaximo
	 * @since 1.0
	 */
	public void setMensajeMaximo(String mensajeMaximo) {
		this.mensajeMaximo = mensajeMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 04/11/2015
	 * @return el mensajeMinimo
	 * @since 1.0
	 */
	public String getMensajeMinimo() {
		return mensajeMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 04/11/2015
	 * @param mensajeMinimo
	 *            asigna el valor a mensajeMinimo
	 * @since 1.0
	 */
	public void setMensajeMinimo(String mensajeMinimo) {
		this.mensajeMinimo = mensajeMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeExacto
	 * @since 1.0
	 */
	public String getMensajeExacto() {
		return mensajeExacto;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeExacto
	 *            asigna el valor a mensajeExacto
	 * @since 1.0
	 */
	public void setMensajeExacto(String mensajeExacto) {
		this.mensajeExacto = mensajeExacto;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeComparacion
	 * @since 1.0
	 */
	public String getMensajeComparacion() {
		return mensajeComparacion;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeComparacion
	 *            asigna el valor a mensajeComparacion
	 * @since 1.0
	 */
	public void setMensajeComparacion(String mensajeComparacion) {
		this.mensajeComparacion = mensajeComparacion;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeComparacionMayor
	 * @since 1.0
	 */
	public String getMensajeComparacionMayor() {
		return mensajeComparacionMayor;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeComparacionMayor
	 *            asigna el valor a mensajeComparacionMayor
	 * @since 1.0
	 */

	public void setMensajeComparacionMayor(String mensajeComparacionMayor) {
		this.mensajeComparacionMayor = mensajeComparacionMayor;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeComparacionMenor
	 * @since 1.0
	 */
	public String getMensajeComparacionMenor() {
		return mensajeComparacionMenor;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeComparacionMenor
	 *            asigna el valor a mensajeComparacionMenor
	 * @since 1.0
	 */

	public void setMensajeComparacionMenor(String mensajeComparacionMenor) {
		this.mensajeComparacionMenor = mensajeComparacionMenor;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el clasegrupo1obligatorio
	 * @since 1.0
	 */
	public String getClasegrupo1obligatorio() {
		return clasegrupo1obligatorio;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param clasegrupo1obligatorio
	 *            asigna el valor a clasegrupo1obligatorio
	 * @since 1.0
	 */

	public void setClasegrupo1obligatorio(String clasegrupo1obligatorio) {
		this.clasegrupo1obligatorio = clasegrupo1obligatorio;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeObligatorioPorCombo
	 * @since 1.0
	 */
	public String getMensajeObligatorioPorCombo() {
		return mensajeObligatorioPorCombo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeObligatorioPorCombo
	 *            asigna el valor a mensajeObligatorioPorCombo
	 * @since 1.0
	 */

	public void setMensajeObligatorioPorCombo(String mensajeObligatorioPorCombo) {
		this.mensajeObligatorioPorCombo = mensajeObligatorioPorCombo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el codigoValidacion
	 * @since 1.0
	 */
	public Integer getCodigoValidacion() {
		return codigoValidacion;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param codigoValidacion
	 *            asigna el valor a codigoValidacion
	 * @since 1.0
	 */

	public void setCodigoValidacion(Integer codigoValidacion) {
		this.codigoValidacion = codigoValidacion;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeValorMinimo
	 * @since 1.0
	 */
	public String getMensajeValorMinimo() {
		return mensajeValorMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeValorMinimo
	 *            asigna el valor a mensajeValorMinimo
	 * @since 1.0
	 */

	public void setMensajeValorMinimo(String mensajeValorMinimo) {
		this.mensajeValorMinimo = mensajeValorMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el mensajeValorMaximo
	 * @since 1.0
	 */
	public String getMensajeValorMaximo() {
		return mensajeValorMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param mensajeValorMaximo
	 *            asigna el valor a mensajeValorMaximo
	 * @since 1.0
	 */

	public void setMensajeValorMaximo(String mensajeValorMaximo) {
		this.mensajeValorMaximo = mensajeValorMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el valorMinimo
	 * @since 1.0
	 */
	public String getValorMinimo() {
		return valorMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param valorMinimo
	 *            asigna el valor a valorMinimo
	 * @since 1.0
	 */
	public void setValorMinimo(String valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @return el valorMaximo
	 * @since 1.0
	 */
	public String getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * @author fayala
	 * @version 1.0, 19/11/2015
	 * @param valorMaximo
	 *            asigna el valor a valorMaximo
	 * @since 1.0
	 */
	public void setValorMaximo(String valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
}
