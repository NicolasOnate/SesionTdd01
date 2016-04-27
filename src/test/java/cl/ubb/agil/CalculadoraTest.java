package cl.ubb.agil;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CalculadoraTest {
	
	
	@Test
	public void sumarDosMasTresEsCinco() {
		//Arrange
		Calculadora  calculadora = new Calculadora();
		
		//Act
		int resultado = calculadora.sumar(2, 3);
		
		//Assert
		assertThat(resultado,  is(5));
	}

}
