package Pct1Ejr1_Etp1Sm3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t;
		Libro R1=new Libro ("Los Delfines ","Rogelio R.","CasaBlanca", 230);
		Libro R2=new Libro ("La Suricata  ","Leonardo de la Rocha","CasaBlanca", 210);
		Libro R3=new Libro ("Los Elefantes  ","Cristian Albedo","CasaBlanca", 215);
		
		R1.Mostrar();
		R2.Mostrar();
		R3.Mostrar();
	     	
	    System.out.println("La suma de las paginas de los libros   R1 y R2   es:"+R1.SumaPag(R2)+"  paginas.");
	    
	//   System.out.println("La suma de las paginas de los libros  R3  es :"+R3.SumaPag2()+"  paginas.");
    System.out.println("La suma de las paginas de los libros R1, R2 y R3  es :"+R3.total(R3)+"  paginas.");
	}
}
