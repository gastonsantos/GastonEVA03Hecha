package ar.edu.unlam.pb2.eva03;

public class Deportista {

	private Integer NumeroDeSocio;
	private String nombre;
	
	
	
	public Deportista(Integer numeroDeSocio, String nombre) {
		NumeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}
	
	
	public Integer getNumeroDeSocio() {
		return NumeroDeSocio;
	}
	public void setNumeroDeSocio(Integer numeroDeSocio) {
		NumeroDeSocio = numeroDeSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NumeroDeSocio == null) ? 0 : NumeroDeSocio.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Deportista))
			return false;
		Deportista other = (Deportista) obj;
		if (NumeroDeSocio == null) {
			if (other.NumeroDeSocio != null)
				return false;
		} else if (!NumeroDeSocio.equals(other.NumeroDeSocio))
			return false;
		return true;
	}
	
	
	
	
}
