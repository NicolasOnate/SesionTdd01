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
	
	@Test
	public void sumarMenosUnoMasSienteEsSeis(){
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.sumar(-1, 7);
		
		assertThat(resultado, is(6));
	}
	
	@Test
	public void restarDoscientosMenosSetentaYTresEsCientoVeintiSiete(){
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.restar(200, 73);
		
		assertThat(resultado, is(127));
	}
	
	@Test
	public void restarMenosDiezyCincoEsMenosQuince(){
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.restar(-10, 5);
		
		assertThat(resultado, is(-15));
	}
}
