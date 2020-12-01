package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista  implements ICiclista, ICorredor, INadador{

	private String DistanciaPreferida;
	private String TipoDeBicicleta;
	private Integer CantidadDeKilometrosEntrenados;
	public Triatleta(Integer numeroDeSocio, String nombre, String DistanciaPreferida, String TipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.DistanciaPreferida =DistanciaPreferida;
		this.TipoDeBicicleta = TipoDeBicicleta;
		this.CantidadDeKilometrosEntrenados= 0;
	}

	public String getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}

	public String getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		TipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		
		 CantidadDeKilometrosEntrenados = + km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}

	
	
}
