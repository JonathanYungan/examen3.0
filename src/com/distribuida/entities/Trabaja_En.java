package com.distribuida.entities;

public class Trabaja_En {
	
	private int id_trabajaEn;
	private int numProv;
	private int horas;
	
	public Trabaja_En() {
		
}

	public Trabaja_En(int id_trabajaEn, int numProv, int horas) {
		super();
		this.id_trabajaEn = id_trabajaEn;
		this.numProv = numProv;
		this.horas = horas;
	}

	public int getId_trabajaEn() {
		return id_trabajaEn;
	}

	public void setId_trabajaEn(int id_trabajaEn) {
		this.id_trabajaEn = id_trabajaEn;
	}

	public int getNumProv() {
		return numProv;
	}

	public void setNumProv(int numProv) {
		this.numProv = numProv;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Trabaja_En [id_trabajaEn=" + id_trabajaEn + ", numProv=" + numProv + ", horas=" + horas + "]";
	}
	
	}
