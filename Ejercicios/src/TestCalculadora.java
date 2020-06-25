import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testSuma() {
		EjercicioUno calculadora = new EjercicioUno();
		assertEquals(5, calculadora.suma(2, 3));
	}

	@Test
	public void testResta() {
		EjercicioUno calculadora = new EjercicioUno();
		assertEquals(2, calculadora.resta(3, 1));
	}

	@Test
	public void testMultiplica() {
		EjercicioUno calculadora = new EjercicioUno();
		assertEquals(6, calculadora.multiplica(2, 3));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDivide() {
		EjercicioUno calculadora = new EjercicioUno();
		assertEquals(1, calculadora.divide(3, 3), 0.1);
	}

}
