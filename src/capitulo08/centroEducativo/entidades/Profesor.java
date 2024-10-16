package capitulo08.centroEducativo.entidades;

public class Profesor {
	@Override
	public String toString() {
		return ( nombre + " "+ apellido_1 + " " + apellido_2 );
	}

	private int id, idSexo;
	private String nombre, apellido_1, apellido_2, dni, direccion, mail, telefono, colorFavorito;
	private byte[] imagen;
	
	
	
	
	public String getColorFavorito() {
		return colorFavorito;
	}





	public void setColorFavorito(String colorFavorito) {
		this.colorFavorito = colorFavorito;
	}





	public byte[] getImagen() {
		return imagen;
	}





	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}





	public Profesor() {
		super();
	}
	
	

	
	
	public int getIdSexo() {
		return idSexo;
	}





	public void setIdSexo(int idSexo) {
		this.idSexo = idSexo;
	}





	public String getApellido_1() {
		return apellido_1;
	}



	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}



	public String getApellido_2() {
		return apellido_2;
	}



	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
