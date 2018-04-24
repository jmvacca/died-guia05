package died.guia05.ejercicio05;
import java.util.*;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo e1 = new Equipo("E1");
		e1.registrarPartido(3, 0);
		e1.registrarPartido(1, 1);
		e1.registrarPartido(2, 0);
		e1.registrarPartido(1, 1);
		Equipo e2 = new Equipo("E2");
		e2.registrarPartido(0, 3);
		e2.registrarPartido(4, 0);
		e2.registrarPartido(0, 2);
		e2.registrarPartido(1, 1);
		Equipo e3 = new Equipo("E3");
		e3.registrarPartido(0, 4);
		e3.registrarPartido(1, 1);
		e3.registrarPartido(1, 1);
		e3.registrarPartido(3, 1);
		ArrayList<Equipo> equipos = new ArrayList<>();
		equipos.add(e1);
		equipos.add(e2);
		equipos.add(e3);
		System.out.println(equipos.toString());
		Collections.sort(equipos);
		System.out.println(equipos.toString());
	}

}
