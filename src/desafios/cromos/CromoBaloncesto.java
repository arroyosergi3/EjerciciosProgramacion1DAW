package desafios.cromos;

public class CromoBaloncesto {

	Integer id;
	String nombre;
	Integer puntos;
	Integer rebotes;
	
	public CromoBaloncesto(Integer i, String s, Integer p, Integer r) {
		this.id = i;
		this.nombre = s;
		this.puntos = p;
		this.rebotes = r;
		
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Integer getRebotes() {
		return rebotes;
	}
	public void setRebotes(Integer rebotes) {
		this.rebotes = rebotes;
	}



	@Override
	public String toString() {
		return "CromoBaloncesto [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + ", rebotes=" + rebotes + "]";
	}
	
	
	
	
}
