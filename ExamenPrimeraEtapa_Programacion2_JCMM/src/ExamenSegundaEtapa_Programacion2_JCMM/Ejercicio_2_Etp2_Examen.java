package ExamenSegundaEtapa_Programacion2_JCMM;

import java.util.Scanner;

public class Ejercicio_2_Etp2_Examen {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		
		Scanner entrada=new Scanner(System.in);
		int[][] B=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Leer matriz");
	      	System.out.println("2.Mostrar matriz");
	      	System.out.println("3.El mayor de cada fila");
	      	System.out.println("Opcion");
	      	op=entrada.nextInt();
	      	switch(op) {
	      	case  1:System.out.println("Filas de la matriz: ");
	      	   F=entrada.nextInt();
	      	   System.out.println("Columnas de la matriz: ");
	      	   C=entrada.nextInt();
	      	   B=new int [F][C];
	      	   leerMatriz(B,F,C);
	      	break;
	      	case 2: System.out.println("Matriz:");
	      	mostrarMatriz(B,F,C);
	      	break;
	      	case 3:  mayor	(B,F,C);
	      	break;
	      	
	      	}
	      	
	}while(op!=0);
}
	public static void leerMatriz(int M[][],int f,int c) {
	Scanner entrada=new Scanner (System.in);
	for(int i=0;i<f;i++) {
		for(int j=0;j<c;j++) {
			System.out.println("Elemento[" +i+"][" +j+"]=");
			M[i][j]=entrada.nextInt();
		}
	}
	System.out.println(" ");
	}
	public static void mayor(int M[][],int f,int c) 
	{  
		// No lo pued resolver Ing
		 int m=0;
		 int s=0 , t=0;
		 
			for(int i=0;i<f;i++)
			{  m=0;
				for(int j=0;j<c;j++)
			   {    m=M[i][j];
			      if(M[i][j]>m) {	  
			      }
					m=M[i][j];
	
			   }
				System.out.println("El mayor de cada fila es: "+m);
			}			
	}
		
	public static void mostrarMatriz(int M[][],int f,int c) {
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("  "+M[i][j]);
			}
			System.out.println("  ");
		}

	}

}
