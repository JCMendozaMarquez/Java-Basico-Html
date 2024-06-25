package Pct1Ejr2_Etp1Sm3;

/*
* AUTOR: JUAN CARLOS MENDOZA MARQUEZ
* FECHA: 24/02/2022
* MATERIA: PROGRAMACION  III
* DESCRIPCION: Informacion de casas
* donde hay : su numero ,direccion  y area 
*/

      public class Casa {
	    
    	  private String nro;
		private String direccion;
		private double  area;
		
		public Casa(){
			
			this.nro=  "blac";
			this.direccion= "ask" ;
			this.area=0;
		}

		public Casa (String nro , String direccion,double area) {
			this.nro=    nro  ;
			this.direccion=     direccion  ;
			this.area=   area  ;
		}
		
		
		public String getnro() {
			return nro ;
		}
		public void setnro(String nro) {
			nro= nro;
		}
		public String getdireccion() {
			return  direccion ;
		}
		public void setdireccion(String  direccion) {
			 direccion=  direccion;
		}
		public double getarea () {
			return   area ;
		}
		public void setarea (String   area ) {
			  area = area ;
		}
		
		
		public void Mostrar() {
			
			System.out.println("Nro "+this.getnro ()+"   Direccion:"+this.getdireccion()+"   Area de: "+this.getarea());
			System.out.println();
		}
		
		
		
}
