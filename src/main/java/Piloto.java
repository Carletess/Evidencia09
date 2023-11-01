import java.util.ArrayList;

public class Piloto {
	private String rut;
	private String idPiloto;
	private ArrayList<Vuelo> vuelosinscritos = new ArrayList<Vuelo>();

	public String getRut() {
		return this.rut;
	}

	public String getIdPiloto() {
		return this.idPiloto;
	}
}