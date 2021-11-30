package vehiculos;

public class Camioneta extends Veh�culo{
	protected static int cantidadCamionetas = 0;
	private boolean volco; 
	
	public Camioneta(String placa, int puertas, String nombre, long precio, long peso, 
			Fabricante fabricante, boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco = volco;
	}
	
	public boolean getVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public Camioneta() {
		cantidadCamionetas++;
	}
	public int getCantidadCamionetas() {
		return(cantidadCamionetas);
	}
}
