import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date horaVuelo;
	private Avion avion;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}
}