package cl.ubb.agil;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CalculadoraTest {
	
	
	@Test
	public void sumarDosMasTresEsCinco() {
		Calculadora  calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(2, 3);
		
		assertThat(resultado,  is(5));
	}

}
