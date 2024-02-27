public class CadenaTexto9 {
  static void encontrarMaxCaracteres(String[] cadenas) {
   int maxCaracteres = 0;
   String cadenaMax = "";
   int posicion=0;
for (int i = 0; i < cadenas.length; i++) {
	        int longitudActual = cadenas[i].length();
	        if (longitudActual > maxCaracteres) {
	            maxCaracteres = longitudActual;
	            cadenaMax = cadenas[i];
	        posicion=i;}
	        
	    }
	    System.out.println("La cadena con más caracteres es: " + cadenaMax + ", y está en la posición " + posicion + ".");
   }
	public static void main(String[] args) {
   String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
	encontrarMaxCaracteres(cadenas);		
	}
}