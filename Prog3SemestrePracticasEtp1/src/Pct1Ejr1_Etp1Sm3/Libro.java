package Pct1Ejr1_Etp1Sm3;
 /*
 * AUTOR: JUAN CARLOS MENDOZA MARQUEZ
 * FECHA: 24/02/2022
 * MATERIA: PROGRAMACION  III
 * DESCRIPCION: Informacion de libros 
 * donde hay : su titulo ,autor ,editorial y Nro-pag
 */



public class Libro {
	
	private String titulo;
	private String autor;
	private String editorial;
	private int   nro_pag ;
	
	public Libro(){
		
		this.titulo=  "blac";
		this.autor= "ask" ;
		this.editorial= "asd" ;
		this.nro_pag=0;
	}
	public Libro (String titulo , String autor,String editorial,int nro_pag ) {
		this.titulo=    titulo  ;
		this.autor=     autor   ;
		this.editorial= editorial ;
		this.nro_pag=   nro_pag   ;
	}
	
	public String gettitulo() {
		return titulo ;
	}
	public void settitulo(String titulo) {
		titulo = titulo;
	}
	public String getautor () {
		return  autor  ;
	}
	public void setautor (String  autor ) {
		 autor = autor ;
	}
	public String geteditorial() {
		return  editorial ;
	}
	public void seteditorial(String editorial ) {
		editorial = editorial;
	}
	public int getnro_pag() {
		return  nro_pag ;
	}
	public void setnro_pag(String  nro_pag) {
		 nro_pag =  nro_pag;
	}
	
	public void Mostrar() {
		
		System.out.println("Titulo: "+this.gettitulo()+"   Autor:"+this.getautor()+"   Editorial:"+this.geteditorial()+"   Nro-Pag "+this.getnro_pag());
		System.out.println();
	}
	
	public int SumaPag(Libro x) {
		// this y X
		    int SumaP;
		
			SumaP=this.getnro_pag()+x.getnro_pag();
			return SumaP;		
	}
	
	public int total(Libro x) {
		
	int tot;
	tot=this.SumaPag(x)+x.getnro_pag();
	return tot;
	}
}
