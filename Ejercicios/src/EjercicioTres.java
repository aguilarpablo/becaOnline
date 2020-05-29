import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		String contrasena = "abcde";
		char[] letrascon = contrasena.toCharArray();

		System.out.println("Introduce la contraseña de 5 letras: ");
		Scanner scan = new Scanner(System.in);
		
		boolean acertar = false;

		while (!acertar) {

			String intento = scan.next();
			
			if (intento.equals(contrasena)) {
				
				acertar = true;
				
			} else {

				char[] letras = intento.toCharArray(); //intento.toChartArray().length e intento.chartAt(i)
				int contador = 0;
				String pista = "";

				for (int i = 0; i < letras.length; i++) {
					
					if (letras[i] == letrascon[i]) {
						
						contador = contador + 1;
						pista = pista.concat("Y");
						
					} else {
						
						pista = pista.concat("N");
						
					}
				}
				
				System.out.println(
						"Has acertado " + contador + " letras y estaban en la posición que marcan las Y: " + pista);
			}
		}
		
		System.out.println("Acertaste la contraseña!!");
	}

}
