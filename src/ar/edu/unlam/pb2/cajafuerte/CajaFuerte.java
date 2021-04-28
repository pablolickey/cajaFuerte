package ar.edu.unlam.pb2.cajafuerte;

public class CajaFuerte {
	
	private Boolean estadoApertura;
	private Integer codigoApertura;
	
	public CajaFuerte() {
		this.estadoApertura=Boolean.TRUE;
	}
	
	public Boolean estaAbierta() {
		return this.estadoApertura;
	}

	public void cerrar(Integer codigoApertura) {
		this.estadoApertura=Boolean.FALSE;
		this.codigoApertura=codigoApertura;
	}

	public void abrir(Integer codigoApertura) {
		if(this.codigoApertura==codigoApertura)
		this.estadoApertura=Boolean.TRUE;
	}

}
