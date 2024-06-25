package ExamenSegundaEtapa_Programacion2_JCMM;

import java.util.Scanner;

public class Ejercicio_1_Etp2_Examen {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		
		Scanner entrada=new Scanner(System.in);
		int[] B= new int [0];
		int op,N=0;
		do {   System.out.println("         "
				+ "0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Mostrar vector");
		       System.out.println("3.Pormedio de elementos del vector");
		       System.out.println("opcion");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                	N=entrada.nextInt();
		                B=new int [N];
		                leerElementos (B,N);
	                 	break;
		         case 2: System.out.println("Vector: ");
		                mostrar(B,N);
	                 	break;
		         case 3: incremento(B,N);
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
	
	
	
	public static void incremento(int V[],int T) {
		int x=2;
		int s=0;
		for(int i=0;i<T;i++) {
			if(i%2==0) {
				s=V[i]+x;
			}else {
				s=V[i]-x;
			}
			System.out.print("  "+s);
		}	
	}
	
	
	
	public static void mostrar ( int M[], int N)
	{ for (int  f=0;f<N;f++)
	{
		System.out.print( " "+M[f] );
	}
	System.out.println(" ");	
	

	}
}
