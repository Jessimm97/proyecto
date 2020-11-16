package com.example.demo.modelo;

public class Computadoras {
	private String noSerie;
	 private String marca;
	 private String procesador;
	 private String so;
	 private String ram;
	 private String NoNucleos;
	public Computadoras(String noSerie, String marca, String procesador, String so, String ram, String noNucleos) {
		super();
		this.noSerie = noSerie;
		this.marca = marca;
		this.procesador = procesador;
		this.so = so;
		this.ram = ram;
		NoNucleos = noNucleos;
	}
	public String getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getNoNucleos() {
		return NoNucleos;
	}
	public void setNoNucleos(String noNucleos) {
		NoNucleos = noNucleos;
	}
	 
	 
}
