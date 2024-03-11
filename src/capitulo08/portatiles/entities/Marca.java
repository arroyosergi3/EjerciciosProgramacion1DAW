package capitulo08.portatiles.entities;

public class Marca {

	private int id, idPais;
	private String denominacion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	@Override
	public String toString() {
		return denominacion ;
	}
	
	
	
}
