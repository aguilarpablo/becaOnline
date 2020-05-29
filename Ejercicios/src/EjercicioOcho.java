import java.util.Scanner;

public class EjercicioOcho {

	public static void main(String[] args) {
		System.out.println("Introduce un texto y te muestro cada carácter en línes: ");
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		
		for (int i = 0; i < texto.toCharArray().length; i++) {
			
			System.out.println(texto.charAt(i));
			
		}
		
		//sin espacios
		String textoSinEspacios = texto.replace(" ", "");
		for (int j = 0; j < textoSinEspacios.toCharArray().length; j++) {
			
			System.out.println(textoSinEspacios.charAt(j));
			
		}

	}

}
