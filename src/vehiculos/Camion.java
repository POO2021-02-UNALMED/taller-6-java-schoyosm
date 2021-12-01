package vehiculos;

public class Camion extends Vehiculo{
	protected static int cantidadCamiones = 0;
	private int ejes;
	
	public Camion(String placa, String nombre, long precio, long peso, 
			Fabricante fabricante, int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public Camion() {
		cantidadCamiones++;
	}
	public static int getCantidadCamiones() {
		return(cantidadCamiones);
	}
}
