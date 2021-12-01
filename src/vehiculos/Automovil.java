package vehiculos;

public class Automovil extends Vehiculo{
	protected static int cantidadAutomoviles = 0;
	private int puestos;
	
	public Automovil(String placa, String nombre, 
			long precio, long peso, Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public Automovil() {
		cantidadAutomoviles++;
	}
	public static int getCantidadAutomoviles() {
		return(cantidadAutomoviles);
	}

}
