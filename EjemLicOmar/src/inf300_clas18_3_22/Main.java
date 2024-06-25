package inf300_clas18_3_22;

import java.util.Scanner;

public class Main {

	private static void MostrarLibros(Libro[] VecX, int n) {
		for(int i=1; i<=n; i++) {
			VecX[i].Mostrar();
		}
	}
	
	private static void AdicionarAutorLibroX(Libro[] VecX, int n, String Tit_libroX, String autorX) {
		for(int i=1; i<=n; i++) {
			if(VecX[i].getTitulo().equals(Tit_libroX)) {
				VecX[i].AdicionarAutor(autorX);
			}
		}
	}
	
	private static void LibrosDelAutorX(Libro[] VecX, int n, String autorX) {
		boolean sw=false;
		System.out.println("Los libros : ");
		for(int i=1; i<=n ; i++) {
			if(VecX[i].BuscarAutor(autorX)) {
				System.out.println("->"+VecX[i].getTitulo());
				sw=true;
			}
		}
		if(sw==false) {
			System.out.println("No se encontraron... ");
		}
	}
	
	private static void LibroMayorNroPags(Libro[] VecX, int n) {
		System.out.println("Libro con mayor nro de pags");
		String titulo;
		titulo="";
		int may=0;
		for(int i=1; i<=n; i++) {
			if(VecX[i].getNumPag()>may) {
				may=VecX[i].getNumPag();
				titulo=VecX[i].getTitulo();
			}
		}
		
		System.out.println("Libro: "+titulo+" con "+may+" pgs");
		
	}
	
	public static void main(String[] args) {
		
		int OPCION;
		Libro VecLibro[]=new Libro[20];
		Scanner in=new Scanner(System.in);
		String codigo, titulo, autor, editorial;
		String titLibro, autorX;
		int pags, i;
		double precio;
		Libro L1=new Libro("L012", "Fisica_I", "Eduardo_Huayta", "Bolivia Edit", 358, 45);
		Libro L2=new Libro("L013", "Fisica_II", "Eduardo_Huayta", "Bolivia Edit", 388, 45);
		Libro L3=new Libro("L014", "Quimica_I", "Ruddy_Espinoza", "Bol1", 200, 40.5);
		L3.AdicionarAutor("Eduardo_Huayta");
		Libro L4=new Libro("L015", "Circuitos_Electricos", "Malva_Juin", "McGrawGill", 500, 70.5);
		Libro L5=new Libro("L016", "Fundamentos_de_Programacion", "Luis_Joyanes", "McGrawGill", 450, 65.2);
		Libro L6=new Libro("L017", "Algebra", "Sebastian_Lazo", "LGolf", 46, 20.8);
		L6.AdicionarAutor("Ruddy_Espinoza");
		
		VecLibro[1]=L1;
		VecLibro[2]=L2;
		VecLibro[3]=L3;
		VecLibro[4]=L4;
		VecLibro[5]=L5;
		VecLibro[6]=L6;
		i=6;
		
		
		do {
			System.out.println("----------MENU LIBRO---------");
			System.out.println("[1]. Adicionar Libro ");
			System.out.println("[2]. Mostrar Libro ");
			System.out.println("[3]. Adicionar un autor al libro X");
			System.out.println("[4]. Que libros tiene el autor X ");
			System.out.println("[5]. Mostrar el libro que tiene mayor nro de pags");
			System.out.println("[6]. ");
			System.out.println("[0]. Salir ");
			System.out.println("-----------------------");
			System.out.println("Digite una opción ");
			OPCION=in.nextInt();
			
			switch(OPCION) 
			{
			case 1:
			
				System.out.println("Codigo: ");
				codigo=in.next();
				System.out.println("Titulo: ");
				titulo=in.next();
				System.out.println("Autor: ");
				autor=in.next();
				System.out.println("Editorial: ");
				editorial=in.next();
				System.out.println("Paginas: ");
				pags=in.nextInt();
				System.out.println("Precio: ");
				precio=in.nextDouble();
				Libro L=new Libro(codigo, titulo, autor, editorial, pags, precio);
				i++;
				VecLibro[i]=L;
				break;
			case 2:
				MostrarLibros(VecLibro,i);
				break;
			case 3:
				System.out.println("Digite Titulo de Libro: ");
				titLibro=in.next();
				System.out.println("Digite Autor a Adicionar : ");
				autorX=in.next();
			    AdicionarAutorLibroX(VecLibro,i,titLibro,autorX);
				break;
			case 4:
				System.out.println("Digite Autor  : ");
				autorX=in.next();
				LibrosDelAutorX(VecLibro,i,autorX);
				break;
			case 5:
				LibroMayorNroPags(VecLibro,i);
				break;
			case 6:
			
				break;
			case 0:
				System.out.println("Salio del programa");
				break;
			}
		}while(OPCION!=0);

	}

	

	

}
