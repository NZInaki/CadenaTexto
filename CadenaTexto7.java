public class CadenaTexto7 {
     static boolean Comprobar(String palabra, String cosa) {
	      palabra = palabra.toLowerCase();	
	       for(int i = 0; i < palabra.length(); i++) {	    	  
		    	if(palabra.contains(cosa)) {
		        return true;		       
		    	}	    	 
	       }
		return false;     	 
     }
 public static void main(String[] args) {
 String cadenas [] = {"Sue","Chzarlotte","Anna","Mike","William","Ed"};
 int resultado = 0;
	 for(int i = 0; i < cadenas.length; i++) {
		 if (Comprobar(cadenas[i], "zar")) {
			resultado++;}}
			if (resultado==1) {
				System.out.println("Sólo una cadena contiene la subcadena 'zar'.");
			}
			else if (resultado>1) {
	 System.out.println("Hay " + resultado + " cadenas que contienen la subcadena 'zar'.");}
			else {System.out.println ("No hay cadenas con la subcadena 'zar'.");
	 }
 
}
}