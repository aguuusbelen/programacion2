package trabajo;

public class Flete extends Transporte{
	private int acompaņante;
	private int costoAcompaņante;
	
	public Flete(int id, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompaņante) {
		super(id, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompaņante = acompaņante;
		
		
		
	}
	
	

}
