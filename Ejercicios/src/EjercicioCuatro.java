
public class EjercicioCuatro {

	public static void main(String[] args) {
		// Mostramos números del 1 al 100 usando diferentes bucles
		
		System.out.println("Mostramos con for:");
		for (int i = 1; i < 101; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Mostramos con while:");
		int j = 1;
		while (j < 101) {
			System.out.println(j);
			j++;
			
		}
		System.out.println("Mostramos con dowhile:");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k < 101);

	}

}
