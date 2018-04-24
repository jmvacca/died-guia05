package died.guia05.ejercicio04;

import java.util.ArrayList;

public class Ruta {

	private ArrayList<Ciudad> ciudades;
	
	public Ruta() {
		// TODO Auto-generated constructor stub
		ciudades = new ArrayList<>();
	}
	
	public void agregarCiudad(Ciudad c) {
		if(! (ciudades.contains(c))) ciudades.add(c);
		else System.out.println("Ya pertenece "+c.toString());
	}

	public ArrayList getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList ciudades) {
		this.ciudades = ciudades;
	}

}
