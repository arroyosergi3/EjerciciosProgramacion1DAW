package capitulo08.centro.entities;

public class Nivel {
private int id, idCentro;
private String descripcion;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getIdCentro() {
	return idCentro;
}
public void setIdCentro(int idCentro) {
	this.idCentro = idCentro;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
@Override
public String toString() {
	return descripcion;
}




}
