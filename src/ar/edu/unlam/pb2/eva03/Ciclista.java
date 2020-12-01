package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private String TipoDeBicicleta;
	public Ciclista(Integer numeroDeSocio, String nombre, String TipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.TipoDeBicicleta = TipoDeBicicleta;
	}
	public String getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}
	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		TipoDeBicicleta = tipoDeBicicleta;
	}
	

	
}
