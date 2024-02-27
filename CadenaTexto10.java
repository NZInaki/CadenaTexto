public class CadenaTexto10 {
	static int contarRepetidas(String[] Array) {
	    int contador = 0;
	    for (int i = 0; i < Array.length; i++) {
	        for (int j = i + 1; j < Array.length; j++) {
	            if (Array[i].equalsIgnoreCase(Array[j])) {
	                contador++;
	                System.out.println(Array[i] + " " + Array[j]);
	            }
	        }
	    }
	    return contador;
	}
	public static void main(String[] args) {
       String cadenas[] = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
	        int cantidadRepetidas = contarRepetidas(cadenas);
	        System.out.println("En total se han encontrado " +
	        cantidadRepetidas + " palabras repetidas en esta tabla.");
	}
}