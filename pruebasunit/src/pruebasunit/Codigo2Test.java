package pruebasunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Codigo2Test {
	private int n;
	private int fact;

public Codigo2Test(int n, int fact) {
this.n = n;
this.fact = fact;

}

	@Parameters
	public static Collection<Object[]> numeros() {
	
		return Arrays.asList(new Object[][] {{ 0, 1},{ 1, 1}, { 2, -1}, { 5, 120}, { 10,3628800}, { 32, -1}, { 33, -1} });
	}

	@Test
	public void testCOdigo2() {
		Codigo2 miCodigo = new Codigo2(n);
		int resultado = miCodigo.factorial();
		assertEquals(fact, resultado);
	}
}