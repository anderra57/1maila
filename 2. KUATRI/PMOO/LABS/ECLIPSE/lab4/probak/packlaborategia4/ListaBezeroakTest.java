package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaBezeroakTest {

	ListaBezeroak lista1= ListaBezeroak.getNireListaBezeroak();
		
	Bezeroa b1,b2;
	    
	@Before
	public void setUp() throws Exception {
		/*public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza,
		double pSaldoa, boolean pBerezia)*/
		//lista1.add(0,"","",0.0,false);
		b1=new Bezeroa(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
		b2=new Bezeroa(2, "Ander Prieto", "1ae2xdddnotevoyadarmipass", 5757.57, true);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBilatuBezeroaIdz() {
		lista1.gehituBezero(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
		assertEquals(lista1.bilatuBezeroaIdz(1).getIdBezeroa(),1);
	}

	@Test
	public void testBezeroKopurua() {
		assertEquals(lista1.bezeroKopurua(),0);
	}

	@Test
	public void testGehituBezero() {
		assertEquals(lista1.bezeroKopurua(),1);
		lista1.gehituBezero(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
		assertEquals(lista1.bezeroKopurua(),1);
		lista1.gehituBezero(2, "Monzon Furro", "1ae2xdddnotevoyadarmipass", 5757.57, true);
		assertEquals(lista1.bezeroKopurua(),2);
		lista1.gehituBezero(2, "a a", "1ae2xdddnotevoyadarmipass", 5757.57, true);
		assertEquals(lista1.bezeroKopurua(),2);
	}

	@Test
	public void testErreseteatu() {
		lista1.erreseteatu();
		assertEquals(lista1.bezeroKopurua(),0);
	}

}
