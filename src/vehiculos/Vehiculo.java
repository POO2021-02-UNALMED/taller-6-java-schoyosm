package vehiculos;

public class Vehiculo {

	protected static int cantidadVehiculos = 0;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private long precio;
	private long peso;
	private String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, 
			long precio, long peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public long getPrecio() {
		return precio;
	}
	public long getPeso() {
		return peso;
	}
	public String getTraccion() {
		return traccion;
	}
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public void setPeso(long peso) {
		this.peso = peso;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Vehiculo() {
		cantidadVehiculos++;
	}
	public int getCantidadVehiculos() {
		return(cantidadVehiculos);
	}
	
	public void vehiculosPorTipo() {
		System.out.println("Automoviles: #" + Automovil.getCantidadAutomoviles()+ 
				"\n Camionetas: #" + Camioneta.getCantidadCamionetas()+
				"\n Camiones: #" + Camion.getCantidadCamiones());
	}
	
}
