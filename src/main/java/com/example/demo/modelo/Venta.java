package com.example.demo.modelo;

public class Venta {
	 private String idVenta;
	 private String idUsuario;
	 private String fecha;
	 private String	subtotal;
	 private String iva;
	 private String costoEnvio;
	 private String total;
	 
	public Venta(String idVenta, String idUsuario, String fecha, String subtotal, String iva,String costoEnvio, String total) {
		super();
		this.idVenta = idVenta;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.costoEnvio=costoEnvio;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getIva() {
		return iva;
	}
	public void setIva(String iva) {
		this.iva = iva;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(String costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	

}
