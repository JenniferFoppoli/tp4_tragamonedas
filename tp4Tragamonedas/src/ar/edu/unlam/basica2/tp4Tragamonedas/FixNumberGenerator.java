package ar.edu.unlam.basica2.tp4Tragamonedas;

public class FixNumberGenerator implements NumberGenerator {
	/* Este generador devolverá siempre number cuando se llame al método generate()
	*/
 private Integer number;
	public FixNumberGenerator(Integer number) {
		
	this.number=number;
	}

	//@Override
	public Integer generate(){
		// TODO Auto-generated method stub
		
		return this.number;
	}

}
