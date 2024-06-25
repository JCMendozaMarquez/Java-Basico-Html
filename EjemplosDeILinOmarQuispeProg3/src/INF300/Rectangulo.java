package INF300;
/*
 * AUTOR:
 * FECHA:
 * MATERIA: INF300
 * DESCRIPCION: Objeto Rectangulo 
 * donde Base(metros) y Altura(metros)
 * */
public class Rectangulo {

	private String Color;
	private double Base;
	private double Altura;
	
	public Rectangulo() {
		this.Color="Blanco";
		this.Base=0.0;
		this.Altura=0.0;
	}
	
	public Rectangulo(String color, double base, double altura) {
		this.Color=color;
		this.Base=base;
		this.Altura=altura;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	public void Mostrar() {
		
		System.out.println("Color: "+this.getColor()+"   Base: "+this.getBase()+"  Altura: "+this.getAltura());
		System.out.println();
	}
	
	/*METODO: Hallar el area del rectangulo*/
	public double Area() {
		double area;
		area=this.getBase()*this.getAltura();
		return area;
	}
	
	/*METODO: Hallar el perimetro del rectangulo*/
	public double Perimetro() {
		double perimetro;
		perimetro=2*(this.getBase()+this.getAltura());
		return perimetro;
	}
	
	/*METODO: Sumar el area de dos rectangulos*/
	public double SumaArea(Rectangulo X) {
		// this y X
		double SumaA;
		SumaA=this.Area()+X.Area();
		return SumaA;	
	}
	
	/*METODO: Si el area de un rectangulo es mayor a 500 metros2 sumar mas X metros2 y 
	 * y mostrar el area final*/
	public double SumaAreaMasX(double X) {
		double areax;
		areax=this.Area();
		if(this.Area()>500) {
			areax=this.Area()+X;
		}
		return areax;
	}
	
	/*METODO: Mostrar el area y perimetro de un rectangulo*/
	public void MostrarAreaPerimetro() {
		System.out.println("Area: "+this.Area()+" (m2)");
		System.out.println("Perimetro: "+this.Perimetro()+" (m)");
	}

}
