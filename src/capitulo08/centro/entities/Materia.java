package capitulo08.centro.entities;


public class Materia {

	private int id, idNivel;
	private String nombre, codigo, urlClassroom, fechaInicio;
	private boolean admiteMatricula;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdNivel() {
		return idNivel;
	}
	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getUrlClassroom() {
		return urlClassroom;
	}
	public void setUrlClassroom(String urlClassroom) {
		this.urlClassroom = urlClassroom;
	}
	public boolean isAdmiteMatricula() {
		return admiteMatricula;
	}
	public void setAdmiteMatricula(boolean admiteMatricula) {
		this.admiteMatricula = admiteMatricula;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	@Override
	public String toString() {
		return  nombre ;
	}

	
	
	
	
	
	
}
