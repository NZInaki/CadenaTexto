public class CadenaTexto2 {
    public static void main(String[] args) {
        String cadenas[] = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        
        String primeraCadena = cadenas[0];
        int posicion = 0;
        
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].compareTo(primeraCadena) < 0) {
                primeraCadena = cadenas[i];
                posicion = i;
            }
        }
        
        System.out.println("La primera cadena alfabéticamente es: " + primeraCadena);
        System.out.println("Está en la posición: " + posicion);
    }
}
