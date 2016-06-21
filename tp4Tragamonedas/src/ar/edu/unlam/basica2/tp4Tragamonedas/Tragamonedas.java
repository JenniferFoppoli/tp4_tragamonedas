package ar.edu.unlam.basica2.tp4Tragamonedas;

public class Tragamonedas {

		public Tambor tambor1;
		public Tambor tambor2;
		public Tambor tambor3;
		
		FixNumberGenerator generator= new FixNumberGenerator(1);
		
		public Tragamonedas(){
			tambor1= new Tambor(generator);
			tambor2= new Tambor(generator);
			tambor3= new Tambor(generator);				
			}
		public void activar() {
			tambor1.girar();
			tambor2.girar();
			tambor3.girar();
		
		}
		
		public Boolean entregarPremio(){
			return (tambor1.getPosicion()==tambor2.getPosicion())&&
					(tambor1.getPosicion()==tambor3.getPosicion());
		
		}
		
}