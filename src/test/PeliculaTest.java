package test;

import java.util.ArrayList;
import java.util.List;

import model.Genero;
import model.Incaa;
import model.Pelicula;

public class PeliculaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Incaa incaa = new Incaa();
		
		Genero g1 = new Genero(1,"Anime");
		Genero g2 = new Genero(2,"Terror");
		Genero g3 = new Genero(3,"Accion");
		// TODO: CU1: AGREGAR UNA PELICULA
		System.out.println("TEST: 1");
		
		try {
			incaa.agregarPelicula("Dragon ball", g1); //ID = 1
			incaa.agregarPelicula("Dragon ball Z",g1); //ID = 2
			incaa.agregarPelicula("Dragon ball GT",g1); //ID = 3
			incaa.agregarPelicula("Robocop",g2); 		//ID = 4
			incaa.agregarPelicula("Transformers",g2);	//ID = 5
			incaa.agregarPelicula("La Monja",g3);		//ID = 6
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(incaa.getCatalogo());
		
		
		//TODO: CU2: traer una pelicula con id
		System.out.println("TEST: 2");
		System.out.println(incaa.traerPelicula(4));
		
		//TODO: CU3: traer una pelicula con nombre
		System.out.println("TEST: 3");
		System.out.println(incaa.traerPelicula("La monja"));
		
		//TODO: traigo pelicula por nombre o id
		System.out.println("TEST DE PRUEBA ");
		System.out.println(incaa.traerPelicula("Transformers", 0));
		
		
		//TODO: CU4: Modificar pelicula
		System.out.println("TEST: 4");
		try {
		System.out.println(incaa.modificarPelicula(2, "Goku vs Frezeer"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(incaa.getCatalogo());
		
		
		
		//TODO: CU5: Eliminar Pelicula
		System.out.println("TEST: 5");
		System.out.println(incaa.eliminarPelicula(incaa.traerPelicula(3)));
		System.out.println(incaa.getCatalogo());
		
		//TODO: CU6: traerPelicula por Genero
		List<Pelicula>genero=incaa.traerPelicula(g1);
		System.out.println("TEST: 6");
		for (Pelicula pelicula : genero) {
			System.out.println(pelicula.getNombrePelicula());
		}
		
		
		

	}
}