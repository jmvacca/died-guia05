package died.guia05.ejercicio04;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciudad c1 = new Ciudad("Santa fe",3000);
		Ciudad c2 = new Ciudad("Sanata fe", 3241);
		Ciudad c3 = new Ciudad("Holy Faith", 6666);
		Ruta ruta = new Ruta();
		ruta.agregarCiudad(c1);
		Integer tam = ruta.getCiudades().size();
		System.out.println(tam);
		ruta.agregarCiudad(c2);
		tam = ruta.getCiudades().size();
		System.out.println(tam);
		ruta.agregarCiudad(c1);
		tam = ruta.getCiudades().size();
		System.out.println(tam);
		
	}

}
