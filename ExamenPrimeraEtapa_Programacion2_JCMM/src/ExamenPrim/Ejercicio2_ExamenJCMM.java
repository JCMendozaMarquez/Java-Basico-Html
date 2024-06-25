package ExamenPrim;

import java.util.Scanner;

public class Ejercicio2_ExamenJCMM {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		int x;
		Scanner entrada =new Scanner (System.in);
			
		System.out.println("Introduce X: ");
	    x=entrada.nextInt();
	     x=x-2;
	     procedimiento(x);
	}
	
	public static void procedimiento(int A) {
		for(int D=2;D<A;D++) {
			if(A%D==0) {
				System.out.println("Resultado :"+D);
			}else {  }
	}
	}
}
