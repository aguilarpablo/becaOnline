import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		
		System.out.println("Dibujaremos un rerectángulo de tantas filas y columnas como las que indiques y con el carácter que indiques.");
		
		System.out.println("Introduce número de filas: ");
		Scanner scan = new Scanner(System.in);
		int filas = scan.nextInt();
		
		System.out.println("Introduce número de columnas: ");
		int columnas = scan.nextInt();
		
		System.out.println("Introduce carácter: ");
		String caracter = scan.next();
		
		//rectángulo
		//rellenamos
//		for (int i = 0; i < filas; i++) {
//			
//			for (int j = 0; j < columnas; j++) {
//				
//				System.out.print(caracter.charAt(0));
//				
//			}
//			
//			System.out.println("");
//		}	
		//Otra forma
		for (int i = 0; i < filas; i++) {
			String rectangulo = "";
			for (int j = 0; j < columnas; j++) {
				
				rectangulo = rectangulo.concat(caracter);
				
			}
			
			System.out.println(rectangulo);
		}	
	}
}
