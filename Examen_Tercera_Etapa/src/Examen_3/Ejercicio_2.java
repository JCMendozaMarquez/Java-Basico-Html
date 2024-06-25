package Examen_3;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
          // NOMBRE COMPLETO:JUAN CARLOS MENDOZA MARQUEZ
		  // MATERIA:PROGRAMACIO N°1
		  // CARNET:9918137
		int Sw,c,cont;
		String cad,Aux;
	    Sw=0;
		c=0;
		cont=0;
		Aux=" ";
		Scanner in=new Scanner(System.in);
		while (Sw==0) {
			System.out.println("int. cadena: ");
			cad=in.next();
           	if(!cad.equals("noe")) {
				for(int i=0;i<=cad.length()-1;i++) {
					if(cad.charAt(i)=='u') {
						cont=cont+1;
					}
				}
		 	if(cont>c) {
				c=cont;
				Aux=Aux+" "+cad;
			}   
		    	} else {    
		       Sw=1;  }
	}
		System.out.println(c+" cadenas tienen el caracter u y son :"+Aux);

	}

}
