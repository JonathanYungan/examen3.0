package com.distribuida.entities;

import java.util.Date;

public class Localizaciones_Dpto {

	private int id_localizacionesDpto;
	private int numeroDpto;
	private String ubicacionDpto;
	
	public Localizaciones_Dpto() {}

	public Localizaciones_Dpto(int id_localizacionesDpto, int numeroDpto, String ubicacionDpto) {
		super();
		this.id_localizacionesDpto = id_localizacionesDpto;
		this.numeroDpto = numeroDpto;
		this.ubicacionDpto = ubicacionDpto;
	}

	public int getId_localizacionesDpto() {
		return id_localizacionesDpto;
	}

	public void setId_localizacionesDpto(int id_localizacionesDpto) {
		this.id_localizacionesDpto = id_localizacionesDpto;
	}

	public int getNumeroDpto() {
		return numeroDpto;
	}

	public void setNumeroDpto(int numeroDpto) {
		this.numeroDpto = numeroDpto;
	}

	public String getUbicacionDpto() {
		return ubicacionDpto;
	}

	public void setUbicacionDpto(String ubicacionDpto) {
		this.ubicacionDpto = ubicacionDpto;
	}

	@Override
	public String toString() {
		return "Localizaciones_Dpto [id_localizacionesDpto=" + id_localizacionesDpto + ", numeroDpto=" + numeroDpto
				+ ", ubicacionDpto=" + ubicacionDpto + "]";
	}
	
}
