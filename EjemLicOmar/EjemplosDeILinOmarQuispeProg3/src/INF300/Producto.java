package INF300;

public class Producto {
	
	private String Nombre;
	private String Marca;
	private double Precio;
	private int Cantidad;
	
	public Producto() { // CONSTRUCTOR POR DEFECTO
		this.Nombre="Sin_Nombre";
		this.Marca="Sin_Marca";
		this.Precio=0.0;
		this.Cantidad=0;
	}
	
	public Producto(String nombre,String marca,double precio, int cantidad) { // CONSTRUCTOR CON ATRIBUTOS
		this.Nombre=nombre;
		this.Marca=marca;
		this.Precio=precio;
		this.Cantidad=cantidad;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getMarca() {
		return this.Marca;
	}
	public double getPrecio() {
		return this.Precio;
	}
	public int getCantidad() {
		return this.Cantidad;
	}
	
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public void setMarca(String marca) {
		this.Marca=marca;
	}
	
	public void setPrecio(double precio) {
		this.Precio=precio;
	}
	
	public void setCantidad(int cantidad) {
		this.Cantidad=cantidad;
	}
	
	public void Mostrar() {
		System.out.println("Nombre: "+this.Nombre);
		System.out.println("Marca: "+this.Marca);
		System.out.println("Precio: "+this.Precio);
		System.out.println("Cantidad: "+this.Cantidad);
	}

}
