package com.example.demo.modelo;

public class Ticket {
	 private String idTicket;
	 private String idVenta;
	 private String noSerire;
	 private String cantidad;
	 private String precio;
	public Ticket(String idTicket, String idVenta, String noSerire, String cantidad, String precio) {
		super();
		this.idTicket = idTicket;
		this.idVenta = idVenta;
		this.noSerire = noSerire;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getNoSerire() {
		return noSerire;
	}
	public void setNoSerire(String noSerire) {
		this.noSerire = noSerire;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	 
}
