import java.util.ArrayList;

public class Avion {
	private String nombre;
	private int anho;
	private double kmRecorridos;
	private Aeropuerto aeropuerto;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnho() {
		return this.anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}