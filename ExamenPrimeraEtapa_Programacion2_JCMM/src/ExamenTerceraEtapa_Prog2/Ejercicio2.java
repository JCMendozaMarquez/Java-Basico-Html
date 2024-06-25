package ExamenTerceraEtapa_Prog2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] B= new int [0];
		int op,N=0;
		do {   System.out.println("         "
				+ "0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Pormedio de elementos del vector");
		       System.out.println("opcion");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                	N=entrada.nextInt();
		                B=new int [N];
		                leerElementos (B,N);
	                 	break;
		         
		         case 2: promedio(B,N);
		                break;   	
		}
		}while(op!=0);
	}
	public static void leerElementos(int M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.nextInt();
		}
	} 
	public static void promedio(int M[],int N) {	
			int x=2;
			int s=0;
			for(int i=0;i<N;i++) {
				if(i%2==0) {
					s=M[i]+x;
				}else {
					s=M[i]-x;
				}
				System.out.print("  "+s);
			}	
		}
	
	
	
	

}
