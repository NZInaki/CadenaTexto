public class CadenaTexto3 {
 public static int contarMayusculas(String palabra) {
    int contador = 0;
    for (int i = 0; i < palabra.length(); i++) {
        char caracter = palabra.charAt(i);
        if (Character.isUpperCase(caracter)) {
               contador++;
        }
    }
       return contador;
 }
	public static void main(String[] args) {
		String[] cadenas= {"SuE","cHaRlOtTe","AnNa","MiKe","WiLlIaM","eD"};	
       for (int i = 0; i < cadenas.length; i++) {
           int contadorMayusculas = contarMayusculas(cadenas[i]);
           System.out.println("Cantidad de mayúsculas en la posición " + i +
           ": " + contadorMayusculas);
       }
   		
	}
}