package trabajo;

import java.util.HashSet;

public class Deposito {
	private HashSet<Paquete> paquetes; 
	private boolean refrigeracion;
	private Integer capacidad;
	
	public Deposito (boolean refrigeracion, int capacidad) {
		this.refrigeracion = refrigeracion;
		this.capacidad = capacidad;
		this.paquetes = new HashSet<>();
	}
	
	public boolean agregarPaquete (Paquete paquete) { //recibe un paquete. Si dentro del deposito hay espacio, lo guarda y devuelve true.
		if (paquetes.size() < capacidad) {            //caso contrario, devuelve false.
			paquetes.add(paquete);
			capacidad = capacidad -1;
			return true;
		}
		return false;
	}
}
