package ar.edu.unlam.basica2.tp4Tragamonedas;

public class Tambor {

	private Integer posicion;
	
	public Tambor(NumberGenerator generator){
	
		posicion=generator.generate();
	}
	
	public Integer getPosicion(){
		return posicion;
	}
	
    public void girar(){
    	RandoNumberGenerator numero=new RandoNumberGenerator();
    	posicion=numero.generate();
    }

}
