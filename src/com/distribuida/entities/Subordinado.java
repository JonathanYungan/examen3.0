package com.distribuida.entities;

import java.util.Date;

public class Subordinado {


		private int id_subordinado;
		private int dniEmpleado;
		private String nombreSubordinado;
		private String sexo;
		private Date fechaNac;
		private String relacion;
		
		public Subordinado() {}

		public Subordinado(int id_subordinado, int dniEmpleado, String nombreSubordinado, String sexo, Date fechaNac,
				String relacion) {
			super();
			this.id_subordinado = id_subordinado;
			this.dniEmpleado = dniEmpleado;
			this.nombreSubordinado = nombreSubordinado;
			this.sexo = sexo;
			this.fechaNac = fechaNac;
			this.relacion = relacion;
		}

		public int getId_subordinado() {
			return id_subordinado;
		}

		public void setId_subordinado(int id_subordinado) {
			this.id_subordinado = id_subordinado;
		}

		public int getDniEmpleado() {
			return dniEmpleado;
		}

		public void setDniEmpleado(int dniEmpleado) {
			this.dniEmpleado = dniEmpleado;
		}

		public String getNombreSubordinado() {
			return nombreSubordinado;
		}

		public void setNombreSubordinado(String nombreSubordinado) {
			this.nombreSubordinado = nombreSubordinado;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public Date getFechaNac() {
			return fechaNac;
		}

		public void setFechaNac(Date fechaNac) {
			this.fechaNac = fechaNac;
		}

		public String getRelacion() {
			return relacion;
		}

		public void setRelacion(String relacion) {
			this.relacion = relacion;
		}

		@Override
		public String toString() {
			return "Subordinado [id_subordinado=" + id_subordinado + ", dniEmpleado=" + dniEmpleado
					+ ", nombreSubordinado=" + nombreSubordinado + ", sexo=" + sexo + ", fechaNac=" + fechaNac
					+ ", relacion=" + relacion + "]";
		}
		

}
