package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer DistanciaPreferida;
	private Integer CantidadDeKilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer DistanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.DistanciaPreferida = DistanciaPreferida;
		this.CantidadDeKilometrosEntrenados= 0;
	}

	public Integer getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados =+ cantidadDeKilometrosEntrenados;
	}
	
	

}
