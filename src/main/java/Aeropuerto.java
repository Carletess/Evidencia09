import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();


	public Avion agregarAvion(String nombre, int anho) {
		throw new UnsupportedOperationException();
	}

	public void realizarVuelos() {
		throw new UnsupportedOperationException();
	}

	public List<Avion> getAviones() {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosFecha(Date fecha) {
		List<Pasajero> pasajerosEnFecha = new ArrayList<Pasajero>();
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getHoraVuelo().equals(fecha)) {
				pasajerosEnFecha.addAll(vuelo.getPasajeros());
			}
		}
		return pasajerosEnFecha;
	}

	public List<Pasajero> buscarPasajerosVuelo(Vuelo vuelo) {
		List<Pasajero> pasajerosEnVuelo = new ArrayList<Pasajero>();
		for (Vuelo v : vuelos) {
			if (v.equals(vuelo)) {
				pasajerosEnVuelo.addAll(v.getPasajeros());
			}
		}
		return pasajerosEnVuelo;
	}

	public List<Pasajero> buscarPasajerosCovid() {
		throw new UnsupportedOperationException();
	}

	public List<Vuelo> buscarVuelosConCovid() {
		List<Vuelo> vuelosConCovid = new ArrayList<Vuelo>();
		for (Vuelo vuelo : vuelos) {
			for (Pasajero pasajero : vuelo.getPasajeros()) {
				if (pasajero.pasaporteSanitario != null && pasajero.pasaporteSanitario.getResultadoPCR()) {
					vuelosConCovid.add(vuelo);
					break; // Si hay un caso positivo, agregamos el vuelo y salimos del bucle
				}
			}
		}
		return vuelosConCovid;
	}
}