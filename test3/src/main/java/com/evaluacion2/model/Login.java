package com.evaluacion2.model;

public class Login {
	private String usuario;
	private String contrasena;
	

	
	public Login(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public Login() {	
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}
	
	
}
