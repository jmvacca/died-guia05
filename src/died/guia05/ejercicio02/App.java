package died.guia05.ejercicio02;

public class App {
	
	public int piso(int[] lista, int x) {
		if(lista[0]>x) return -1;
		if(lista[lista.length-1]<x) return lista[lista.length-1];
		return piso2(lista,x,0,lista.length-1);
	}
	
	public int piso2(int[] lista, int x, int l, int r) {
		int m = ((r-l)/2) + l;
		if(r - l == 1) return lista[m];
		if(lista[m]>x) return piso2(lista,x,l,m);
		return piso2(lista,x,m,r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		int lista[] = {2,2,3,5,6,8,12,45,67,89,112};
		System.out.println((new App()).piso(lista,x));
	}

}
