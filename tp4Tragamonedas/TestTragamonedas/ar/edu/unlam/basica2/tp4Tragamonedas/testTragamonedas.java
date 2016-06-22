package ar.edu.unlam.basica2.tp4Tragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTragamonedas {
	
	@Test
	public void comprobarQueLosTamboresEstenEnUnoAntesDeActivar(){
		
		Tragamonedas tragamonedas = new Tragamonedas();
		
		Integer esperado = 1;
		
		assertEquals(esperado, tragamonedas.tambor1.getPosicion(), 0.01);
		assertEquals(tragamonedas.tambor1.getPosicion(), tragamonedas.tambor2.getPosicion() , 0.01);
		assertEquals(tragamonedas.tambor1.getPosicion(), tragamonedas.tambor3.getPosicion() , 0.01);
	}			

	@Test
	public void UnNumeroAleatorioEntreUnoYDiez() {
		RandoNumberGenerator numAleatorio = new RandoNumberGenerator();
		Integer numeroAleatorio = numAleatorio.generate();
		assertTrue(numeroAleatorio >0 && numeroAleatorio <= 10);
	}

	
		@Test
		public void FuncionamientoDelTragamonedas() {
			
			Tragamonedas tragamonedas = new Tragamonedas();
			
			tragamonedas.activar();
				
			assertTrue(tragamonedas.entregarPremio());
			
				//assertTrue(tragamonedas.tambor1.getPosicion() + " // " + tragamonedas.tambor2.getPosicion() + " // " + tragamonedas.tambor3.getPosicion());
		
			/*if(tragamonedas.entregarPremio() == true){
				System.out.println("Has ganado!!");
			} else {
				
				System.out.println("Sigue intentando");
				
			}*/
		}
	
	
	
		
		
	}
		
	


