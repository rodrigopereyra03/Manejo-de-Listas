package model;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	
	private List<Pelicula> catalogo;

	public Incaa() {
		super();
		this.catalogo = new ArrayList <Pelicula>();		
	}
	
	public boolean agregarPelicula(String pelicula,Genero genero) throws Exception {
		if(traerPelicula(pelicula)!=null) {
			throw new Exception("Error: la peli ya existe");
		}
		int id = 1;
		if(catalogo.size() > 0) {
			int tamanio = catalogo.size();
			id = catalogo.get(tamanio-1).getIdPelicula()+1;
		}
		return catalogo.add(new Pelicula(id,pelicula, genero));
	}
	
	public Pelicula traerPelicula(String nombre) {
		return traerPelicula(nombre,0);
	}
	
	public Pelicula traerPelicula(int idPelicula) {
		return traerPelicula(null,idPelicula);
	}
	
	
	public Pelicula traerPelicula(String nombre, int idPelicula) {
		boolean peliculaEncontrada = false;
		Pelicula peliEncontrada = null;
		int i = 0;
		while(i < catalogo.size()&& !peliculaEncontrada) {
			if(nombre == null) {
			if(catalogo.get(i).getIdPelicula() == idPelicula){
				peliculaEncontrada = true;
				peliEncontrada = catalogo.get(i);
				}
			}else {
				if(catalogo.get(i).getNombrePelicula().equalsIgnoreCase(nombre)) {
					peliculaEncontrada = true;
					peliEncontrada = catalogo.get(i);
				}
			}
			i++;
		}
		return peliEncontrada;
	}
	
	
	public boolean modificarPelicula(int idPelicula, String pelicula) throws Exception {
		Pelicula peliculaAux = traerPelicula(idPelicula);
		if(peliculaAux != null) {
			peliculaAux.setNombrePelicula(pelicula);
		}else {
			throw new Exception("ERROR: la peli no existe");
		}
		return true;
	}
	
	
	public boolean eliminarPelicula(Pelicula pelicula) {
		return catalogo.remove(pelicula);
	}

	public List<Pelicula> traerPelicula(Genero genero) {
		List<Pelicula> peliculasPorGenero = new ArrayList<>();
		
		for(Pelicula pelicula : catalogo) {
			if(pelicula.getGenero().equals(genero)) {
				peliculasPorGenero.add(pelicula);
			}
		}
		return peliculasPorGenero;
	}
	
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Incaa catalogo = " + catalogo ;
	}
	
	
	
}
