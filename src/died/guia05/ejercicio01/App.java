package died.guia05.ejercicio01;
import java.util.ArrayList;


public class App {
	
	
	public int media(int[] lista,int posm) {
		int x = lista[0];
		int mayores[]=new int[lista.length];
		int cont1 = 0;
		int menores[]=new int[lista.length];
		int cont2 = 0;
		int iguales[]=new int[lista.length];
		int cont3 = 1;
		iguales[0]=x;
		for(int i=1;i<lista.length;i++) {
			if(lista[i]!=0) {
				if(lista[i]>x) {
					mayores[cont1]=lista[i];
					cont1++;
				}else if(lista[i]<x) {
					menores[cont2]=lista[i];
					cont2++;
				}else {
					iguales[cont3]=lista[i];
					cont3++;
				}
			}
		}
		
		//CONTROL
		/*for(int i=0;i<cont2;i++)System.out.print(menores[i]+" ");
		System.out.println(" ");
		for(int i=0;i<cont3;i++)System.out.print(iguales[i]+" ");
		System.out.println(" ");
		for(int i=0;i<cont1;i++)System.out.print(mayores[i]+" ");
		System.out.println(" ");
		System.out.println("Posm = "+posm);*/
		
		if(posm!=1) {
			if(cont2>=posm) {
				x=this.media(menores,posm);
			}else if(cont1>=posm) {
				x=this.media(mayores,posm-(cont2+cont3));
			}
		}
		return x;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista[]= {};
		int m;
		if(lista.length%2==0) m = (new App()).media(lista,lista.length/2);
		else m = (new App()).media(lista,(lista.length/2)+1);
		System.out.println(m);
	}

}
