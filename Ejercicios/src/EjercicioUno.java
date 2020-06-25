import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		// Ejercicio 1
		System.out.println("Primer ejercicio");
		
		System.out.println("Introduzca el primer número: ");
		Scanner teclado1 = new Scanner(System.in);
		double numeroUno = teclado1.nextDouble();
		
		System.out.println("Introduzca el segundo número: ");
		Scanner teclado2 = new Scanner(System.in);
		double numeroDos = teclado2.nextDouble();
		
		// Operaciones
		double suma = numeroUno + numeroDos;
		double multiplicacion = numeroUno*numeroDos;
		double resta = numeroUno - numeroDos;
		double division = numeroUno/numeroDos;
		
		// Salida
		System.out.println("La suma de los números introducidos es: " + suma);
		System.out.println("La resta de los números introducidos es: " + resta);
		System.out.println("La multiplicación de los números introducidos es: " + multiplicacion);
		System.out.println("La división de los números introducidos es: " + division);
		if (numeroUno > numeroDos) {
			System.out.println("El primer número introducido es el mayor de los dos, y es el " + numeroUno);
		} else {
			System.out.println("El segundo número introducido es el mayor de los dos, y es el " + numeroDos);
		}
		
		// Ejercicio 2
		System.out.println("Segundo ejercico");
		
		System.out.println("Introduzca el primer número entero: ");
		Scanner scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		
		System.out.println("Introduzca el segundo número entero: ");
		Scanner scan1 = new Scanner(System.in);
		int numero2 = scan1.nextInt();
		
		System.out.println("Introduzca la operación que desea hacer con los números: ");
		Scanner scan2 = new Scanner(System.in);
		String operacion = scan2.nextLine();
		
		switch (operacion) {
		case "suma":
			System.out.println("La suma de los números introducidos es: " + (numero1 + numero2));
			break;
		case "resta":
			System.out.println("La resta de los números introducidos es: " + (numero1 - numero2));
			break;
		case "multiplicación":
			System.out.println("La multiplicación de los números introducidos es: " + (numero1 * numero2));
			break;
		case "división":
			System.out.println("La división de los números introducidos es: " + (numero1 / numero2));
			break;
		default:
			System.out.println("Debes introducir suma, resta, división o multiplicación.");
			break;
		}
		main(null);
	}
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	
	public int multiplica(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		return a/b;
	}

}
