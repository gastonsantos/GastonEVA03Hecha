package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	protected  String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}
	
	
	public Boolean agregarDeportista(Deportista dep){
		return socios.add(dep);
	}
	public Integer getCantidadSocios() {
		return socios.size();
	}
	
public void crearEvento(TipoDeEvento tipoDeEvento, String string) {
	competencias.put(string, new Evento(tipoDeEvento));
			
	}

public Evento buscarEventos(String nombre) throws NoExiste{
	Evento evento1 = null;
	for(Map.Entry<String, Evento> entry: competencias.entrySet() ){
		if(entry.getKey().equals(nombre)){
			evento1= entry.getValue();	
	}
	}
	if(evento1 != null){
		return evento1;
	}else{
		throw new NoExiste();
	}
	
	
	
	
}


public Deportista buscarDeportista(Deportista dep) throws  NoExiste{
	Deportista depor= null;
	for(Deportista e: socios ){
		if(e.equals(dep)){
			depor = dep;
			break;
		}
		
	}
	if(depor != null){
		return depor;
	}else{
		throw new NoExiste();
	}
	
}
	
public Deportista verificoDeportista(Deportista dep) throws NoExiste{
	Deportista  depor = buscarDeportista(dep);
	
	if(depor != null){
		return depor;
	}else{
		throw new NoExiste();
	}
}


 public Integer inscribirEnEvento(String evento, Deportista depr) throws NoEstaPreparado, NoExiste{
	Integer contador=0;
	Evento evento1 = buscarEventos(evento);
	Deportista depor = buscarDeportista(depr);
	

	if(evento1.getTipo().equals(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS )&& depor instanceof Nadador && depor != null ){
		evento1.agregarParticipante(depor);
		contador++;
		
	}if(evento1.getTipo().equals(TipoDeEvento.TRIATLON_IRONMAN) && depor instanceof Nadador && depor instanceof Corredor && depor instanceof Ciclista && depor !=null ){
		evento1.agregarParticipante(depor);
		contador++;
	}if(evento1.getTipo().equals(TipoDeEvento.CARRERA_42K)  && depor instanceof Corredor && depor!= null){
		evento1.agregarParticipante(depor);
		contador++;
	}
	
	else{
		throw new NoEstaPreparado();
	}
	
	return contador;
	
	
	}

	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Deportista> getSocios() {
		return socios;
	}
	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}
	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}




	
	

	
	
	
	
	
	
}
