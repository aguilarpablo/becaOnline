import java.util.Scanner;

public class EjercicioSiete {

	public static void main(String[] args) {
		System.out.println("Introduce un texto y te lo muestro al revés: ");
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		
		int i = texto.toCharArray().length - 1;
		while(i >= 0) {
			
			System.out.print(texto.charAt(i));
			i--;
		}
	}

}
