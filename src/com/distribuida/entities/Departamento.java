package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "autor")

public class Departamento {
	private int id_departamento;
	private String nombreDpto;
	private int numeroDpato;
	private int dniDirector;
	private Date fechaIngresoDirector;


	public Departamento() {}


	public Departamento(int id_departamento, String nombreDpto, int numeroDpato, int dniDirector,
			Date fechaIngresoDirector) {
		super();
		this.id_departamento = id_departamento;
		this.nombreDpto = nombreDpto;
		this.numeroDpato = numeroDpato;
		this.dniDirector = dniDirector;
		this.fechaIngresoDirector = fechaIngresoDirector;
	}


	public int getId_departamento() {
		return id_departamento;
	}


	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}


	public String getNombreDpto() {
		return nombreDpto;
	}


	public void setNombreDpto(String nombreDpto) {
		this.nombreDpto = nombreDpto;
	}


	public int getNumeroDpato() {
		return numeroDpato;
	}


	public void setNumeroDpato(int numeroDpato) {
		this.numeroDpato = numeroDpato;
	}


	public int getDniDirector() {
		return dniDirector;
	}


	public void setDniDirector(int dniDirector) {
		this.dniDirector = dniDirector;
	}


	public Date getFechaIngresoDirector() {
		return fechaIngresoDirector;
	}


	public void setFechaIngresoDirector(Date fechaIngresoDirector) {
		this.fechaIngresoDirector = fechaIngresoDirector;
	}


	@Override
	public String toString() {
		return "Departamento [id_departamento=" + id_departamento + ", nombreDpto=" + nombreDpto + ", numeroDpato="
				+ numeroDpato + ", dniDirector=" + dniDirector + ", fechaIngresoDirector=" + fechaIngresoDirector + "]";
	}
	
}
