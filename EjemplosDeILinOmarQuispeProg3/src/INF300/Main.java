package INF300;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo R1=new Rectangulo("Verde", 12.5, 30.2);
		Rectangulo R2=new Rectangulo("Rojo", 10.5, 50.2);
		
		R1.Mostrar();
		R2.Mostrar();
		
	//  System.out.println("Area del Rectangulo 1: "+R1.Area()+" (m2)");
	//	System.out.println("Perimetro del Rectangulo 1: "+R1.Perimetro()+" (m)");
		
	//	System.out.println("Area del Rectangulo 2: "+R2.Area()+" (m2)");
	//   System.out.println("Perimetro del Rectangulo 2: "+R2.Perimetro()+" (m)");
		
	    System.out.println("Suma de areas de R1 y R2 es:"+R1.SumaArea(R2)+" (m)");
		
		System.out.println("Suma de X , si excede de 500 m2 el area R2: "+R2.SumaAreaMasX(200.5));
		System.out.println("Suma de X , si excede de 500 m2 el area R1 : "+R1.SumaAreaMasX(200.5));
		
		R1.MostrarAreaPerimetro();
		
		R2.MostrarAreaPerimetro();
		
		

	}

}
