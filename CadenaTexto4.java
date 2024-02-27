public class CadenaTexto4 {
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
	String cadenas [] = {"Sue","ChArLOTte","AnNa","MikE","WiLLiAm","Ed"};	
   	for (int i = 0; i < cadenas.length; i++) {
   		int contarMinusculas =0;
   		int contadorMayusculas = contarMayusculas(cadenas[i]);
   		contarMinusculas= cadenas[i].length()- contadorMayusculas; 
   		if (contadorMayusculas > contarMinusculas) {
   		System.out.println("Hay una cantidad de mayúsculas mayor que de minúsculas en la posición " + i + ".");
   		} else if (contadorMayusculas < contarMinusculas) {
               System.out.println("Hay mayor cantidad de minúsculas que de mayúsculas en la posición " + i + ".");
           } else {
               System.out.println("Hay tantas mayúsculas como minúsculas en la posición " + i + ".");
           }
   	}
	}
}