public class CadenaTexto5 {
	static String convertirMayuscula(String palabra) {
		String resultado = "";
		for (int i = 0; i < palabra.length(); i++) {
			char caracter;
	         caracter = palabra.charAt(i);
	        if (Character.isLowerCase(caracter)) {
	           caracter= Character.toUpperCase(caracter);        
	        }
	        resultado += caracter;
	    }
		return resultado;	    	
	}
	public static void main(String[] args) {
	String cadenas [] = {"SUe","Charlotte","AnNa","MIkE","WiLLiam","Ed"};
		for (int i = 0; i < cadenas.length; i++) {
		String resultado=convertirMayuscula(cadenas[i]);
		System.out.println(resultado);	
		}
	}
}