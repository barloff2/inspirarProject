package co.com.inspirar.modelo;

public class Telefono {
	private String telFijo = "";
	private String telCel = "";
	
	public Telefono(String telFijo, String telCel) {
		this.telFijo = telFijo;
		this.telCel = telCel;
	}
	
	public Telefono() {
		
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}
	
	
	
}
