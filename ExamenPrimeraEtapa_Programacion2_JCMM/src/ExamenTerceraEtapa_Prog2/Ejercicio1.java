package ExamenTerceraEtapa_Prog2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA| 

		int x;
		Scanner in=new Scanner(System.in);
		System.out.print("Inserte el dato : ");
		x=in.nextInt();
		x=x-2;
		procedimiento (x);
	}
	public static void procedimiento(int A) {
		for(int D=2;D<A;D++) {
			if(A%D==0) {
				System.out.println("Resultado :"+D);
			}else {  }
	}
	}
}

