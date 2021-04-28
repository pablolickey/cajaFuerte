package ar.edu.unlam.pb2.cajafuerte;

import static org.junit.Assert.*;
import org.junit.Test;

public class CajaTest {
	
	private CajaFuerte caja;
	
	@Test
	public void alCrearUnaCajaFuerteEstaAbierta() {
		//preparacion(dado)
		
		//ejecucion(cuando)
		whenCreoUnaCajaFuerte();
		//contrastacion o validacion(entonces)
		thenLaCajaFuerteEstaAbierta();
	}
	
	private void whenCreoUnaCajaFuerte() {
		caja= new CajaFuerte();
	}
	
	private void thenLaCajaFuerteEstaAbierta() {
		assertTrue(caja.estaAbierta()==true);
	}
	
	
	@Test
	public void alCerrarDeberiaEstarCerrada() {
		CajaFuerte caja = givenExisteUnaCajaFuerte();
		whenCierroLaCajaFuerte(caja);
		thenLaCajaFuerteEstaCerrada(caja);
	}
	
	private CajaFuerte givenExisteUnaCajaFuerte() {
		return caja = new CajaFuerte();		
	}
	
	private void whenCierroLaCajaFuerte(CajaFuerte caja) {
		caja.cerrar(null);
	}
	
	private void thenLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		assertTrue(caja.estaAbierta()==false);
	}
	
	
	@Test
	public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaEstarAbierta() {
		Integer codigoApertura = 123;
		//CajaFuerte caja = givenExisteUnaCajaFuerte();
		CajaFuerte caja = new CajaFuerte();
		//givenCierroLaCajaFuerte(caja; codigoApertura);
		caja.cerrar(codigoApertura);
		
		//whenAbroLaCajaFuerteConCodigo(codigoApertura);
		caja.abrir(codigoApertura);
		
		//thenLaCajaFuerteEstaAbierta(caja);
		assertTrue(caja.estaAbierta());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
