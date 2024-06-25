package ExamenPrim;

import java.util.Scanner;

public class Ejercicio1_ExamenJCMM {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		
		int a,b,R;
        Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce A: ");
	    a=entrada.nextInt();
	    System.out.println("Introduce B: ");
	    b=entrada.nextInt();
		
		
		if(a>b) {
			R=Funcion(a,b)	;	
		}else {
			R=Funcion(b,a);
		}
		System.out.println("Resultado :"+R);

	}
	public static int Funcion(int M,int  N ) {
		while(M>N) {
			M=M-N;
		}
	return(M);
	}

}
