package com.mercadolibre.academy.fidelizacion.modelo.entity;

// default package
// Generated 19-feb-2016 10:42:58 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Premio generated by hbm2java
 */
public class Premio implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4619529531868814337L;
	private Integer idPremio;
	private String detalle;
	private int puntos;
	private int stock;
	private boolean activo;
	private boolean aniversario;
	private Set<Canje> canjes = new HashSet<Canje>(0);

	public Premio() {
	}

	public Premio(String detalle, int puntos, int stock, boolean activo, boolean aniversario) {
		this.detalle = detalle;
		this.puntos = puntos;
		this.stock = stock;
		this.activo = activo;
		this.aniversario = aniversario;
	}

	public Premio(String detalle, int puntos, int stock, boolean activo, boolean aniversario, Set<Canje> canjes) {
		this.detalle = detalle;
		this.puntos = puntos;
		this.stock = stock;
		this.activo = activo;
		this.aniversario = aniversario;
		this.canjes = canjes;
	}

	public Integer getIdPremio() {
		return this.idPremio;
	}

	public void setIdPremio(Integer idPremio) {
		this.idPremio = idPremio;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isAniversario() {
		return this.aniversario;
	}

	public void setAniversario(boolean aniversario) {
		this.aniversario = aniversario;
	}

	public Set<Canje> getCanjes() {
		return this.canjes;
	}

	public void setCanjes(Set<Canje> canjes) {
		this.canjes = canjes;
	}

}