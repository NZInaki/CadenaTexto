public class CadenaTexto8 {
  static boolean verificacion(String palabra) {
	if (palabra.startsWith("a") || palabra.startsWith("A")) {
		return true;	
	}
	return false;
  }
	public static void main(String[] args) {
	String cadenas [] = {"Sue","Charlotte","Anna","Mike","William","Ed"};
		int cantidad =0;
		for (int i = 0; i<cadenas.length;i++) {
			if (verificacion(cadenas[i])) {
				cantidad ++;
			}
		}
		if (cantidad==1) {
			System.out.println("Sólo una cadena comienza por 'a'.");
		}
		else if (cantidad>1) {
		System.out.println("Hay " + cantidad + " cadenas que comienza por a.");}
	else 
	{System.out.println ("No hay cadenas que comiencen por 'a'.");}
}
}