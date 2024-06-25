package inf300_clas18_3_22;

public class Libro {

	private String Codigo;
	private String Titulo;
	private String Autor[]=new String[10];
	private int Na;
	private String Editorial;
	private int NumPag;
	private double Precio;
	
	public Libro() {
		this.Codigo="NA";
		this.Titulo="ST";
		this.Autor[1]="SA";
		this.Na=1;
		this.Editorial="SE";
		this.NumPag=0;
		this.Precio=0.0;
	}
	
	public Libro(String codigo, String titulo, String autor, String editorial, int numpag, double precio  ) {
		this.Codigo=codigo;
		this.Titulo=titulo;
		this.Autor[1]=autor;
		this.Na=1;
		this.Editorial=editorial;
		this.NumPag=numpag;
		this.Precio=precio;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor(int i) {
		return this.Autor[i];
	}

	public void setAutor(int i, String autor) {
		this.Autor[i]=autor;
	}

	public int getNa() {
		return Na;
	}

	public void setNa(int na) {
		Na = na;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getNumPag() {
		return NumPag;
	}

	public void setNumPag(int numPag) {
		NumPag = numPag;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public void Mostrar() {
		System.out.println("LIBRO -> "+this.getCodigo()+" "+this.getTitulo());
		for(int i=1; i<=this.getNa(); i++) {
			System.out.print(i+" "+this.getAutor(i)+"  ");
		}
		System.out.println();
		System.out.println("Edit:"+this.Editorial+" "+this.getNumPag()+" pags. "+this.getPrecio()+" Bs");
		System.out.println();
	}
	
	public void AdicionarAutor(String autorX) {
		this.Na=this.Na+1;
		this.Autor[this.Na]=autorX;
	}

	public void VerificarAutorX(String autorX) {
		boolean sw=false;
		for(int i=1; i<=this.getNa();i++) {
			if(this.getAutor(i).equals(autorX)) {
				sw=true;
			}
		}
		
		if(sw==true) {
			System.out.println("El libro "+this.getTitulo()+" si corresponde al autor "+autorX);
		}else {
			System.out.println("EL libro no pertenece al autor "+autorX);
		}
	}

	public void ModificarAutor(String AutorAnt, String AutorNuevo) {
		boolean sw=false;
		for(int i=1; i<=this.getNa();i++) {
			if(this.getAutor(i).equals(AutorAnt)) {
				this.setAutor(i, AutorNuevo);
				sw=true;
			}
		}
		if(sw==true) {
			System.out.println("Nombre de autor cambiado con exito!!..");
		}else {
			System.out.println("Autor "+AutorAnt+" No encontrado");
		}
		System.out.println();
	}
    // this -> L1
	// X -> L2
	// Y -> L3
	public double CostoTotal(Libro X, Libro Y) {
		double CostoTotal=0;
		CostoTotal = this.getPrecio()+X.getPrecio()+Y.getPrecio();
		return CostoTotal;
	}

	public boolean BuscarAutor(String autorX) {
		boolean sw=false;
		for(int i=1; i<=this.getNa(); i++) {
			if(this.getAutor(i).equals(autorX)) {
				sw=true;
			}
		}
		
		return sw;
	}
}
