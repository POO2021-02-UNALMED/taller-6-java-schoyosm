package vehiculos;

public class Automóvil extends Vehículo{
	protected static int cantidadAutomoviles = 0;
	private int puestos;
	
	public Automóvil(String placa, String nombre, 
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
	public Automóvil() {
		cantidadAutomoviles++;
	}
	public int getCantidadAutomoviles() {
		return(cantidadAutomoviles);
	}

}
