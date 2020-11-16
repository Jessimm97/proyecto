package com.example.demo.modelo;

public class Clientes {
	private String idCliente;
	 private String nombre;
	 private String apellidos;
	 private String Telefono;
	 private String email;
	 private String direccion;
	public Clientes(String idCliente, String nombre, String apellidos, String telefono, String email,
			String direccion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	 
}
