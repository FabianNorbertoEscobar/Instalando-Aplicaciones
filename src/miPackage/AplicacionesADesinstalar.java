package miPackage;

@SuppressWarnings("rawtypes")
public class AplicacionesADesinstalar implements Comparable {

	private int cantidadApps;
	private int tamaņoApps;
	private int posPrimerApp;

	public int getCantidadApps() {
		return cantidadApps;
	}

	public void setCantidadApps(int cantidadApps) {
		this.cantidadApps = cantidadApps;
	}

	public int getTamaņoApps() {
		return tamaņoApps;
	}

	public void setTamaņoApps(int tamaņoApps) {
		this.tamaņoApps = tamaņoApps;
	}

	public int getPosPrimerApp() {
		return posPrimerApp;
	}

	public void setPosPrimerApp(int posPrimerApp) {
		this.posPrimerApp = posPrimerApp;
	}

	public AplicacionesADesinstalar(int cantidadApps, int tamaņoApps, int posPrimerApp) {
		this.cantidadApps = cantidadApps;
		this.tamaņoApps = tamaņoApps;
		this.posPrimerApp = posPrimerApp;
	}

	@Override
	public int compareTo(Object obj) {
		if (this.cantidadApps == ((AplicacionesADesinstalar) obj).cantidadApps)
			return this.tamaņoApps - ((AplicacionesADesinstalar) obj).tamaņoApps;
		return this.cantidadApps - ((AplicacionesADesinstalar) obj).cantidadApps;
	}
}
