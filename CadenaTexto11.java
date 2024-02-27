public class CadenaTexto11 {
	static void encontrarMaxVocales(String[] cadenas) {
       int maxVocales = 0;
       int posicion=0;
       String cadenaMax = "";
       for (int i = 0; i < cadenas.length; i++) {
           int vocalesActuales = 0;
           for (int j = 0; j < cadenas[i].length(); j++) {
               char letra = Character.toLowerCase(cadenas[i].charAt(j));
               if ("aeiou".indexOf(letra) != -1) {
                   vocalesActuales++;
               }
           }		            if (vocalesActuales > maxVocales) {
		                maxVocales = vocalesActuales;
		                cadenaMax = cadenas[i];
		                posicion=i;
		            }
       }
       System.out.println("La cadena con más vocales es: " + cadenaMax + " y está en la posición " + posicion + ".");
   }	
	public static void main(String[] args) {
	 String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
    encontrarMaxVocales(cadenas);
	}
}