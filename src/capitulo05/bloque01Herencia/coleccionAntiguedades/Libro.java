package capitulo05.bloque01Herencia.coleccionAntiguedades;

public class Libro extends Antiguo{

	private String autor, titulo;

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", añoF=" + añoF + ", precio=" + precio + ", origen="
				+ origen + "]";
	}

	
	
	
}
