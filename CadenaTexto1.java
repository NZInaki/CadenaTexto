public class CadenaTexto1 {
   static void gurdarCantidad(String[] Array, int[] huecos) {
		for(int i=0; i <Array.length; i++) {		
		 huecos[i] = Array[i].length();
		}
	}
	public static void main(String[] args) {
		String[] cadenas= {"Sue","Charlotte","Anna","Mike","William","Ed"};	
		int[] longitud= new int[cadenas.length];			
			gurdarCantidad(cadenas, longitud);
	}	
}