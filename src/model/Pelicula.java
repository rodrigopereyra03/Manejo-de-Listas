package model;

public class Pelicula {
	
	private int idPelicula;
	private String nombrePelicula;
	private Genero genero;
	
	
	public Pelicula(int idPelicula, String nombrePelicula, Genero genero) {
		super();
		this.idPelicula = idPelicula;
		this.nombrePelicula = nombrePelicula;
		this.genero = genero;
	}


	public int getIdPelicula() {
		return idPelicula;
	}


	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}


	public String getNombrePelicula() {
		return nombrePelicula;
	}


	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}


	@Override
	public String toString() {
		return "Pelicula, idPelicula = " + idPelicula + ", nombrePelicula = " + nombrePelicula+ "\n";
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}
