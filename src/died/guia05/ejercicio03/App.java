package died.guia05.ejercicio03;

public class App {
	
	public int cantDeRotaciones(int[] lista,int x) {
		if(lista[x]<=lista[x+1]) return cantDeRotaciones(lista,x+1);
		return x+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista[]= {7,9,10,3,5};
		int m = (new App()).cantDeRotaciones(lista,0);
		System.out.println(m);
	}

}
