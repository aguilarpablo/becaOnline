import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		System.out.println("Introduce frase por consola: ");
		
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		
		char[] letras = frase.toCharArray();
		
		int contador = 0;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == 'a' 
				|| letras[i] == 'e'
				|| letras[i] == 'i'
				|| letras[i] == 'o'
				|| letras[i] == 'u') {
				
				contador++;
				
			}
		}
		
		System.out.println("La frase introducida tiene " + contador + " vocales");
		//main(null);
	}
	
}
