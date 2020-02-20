package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaErabiltzaileakTest {
	Erabiltzailea e1,e2,e3,e4;
	ListaErabiltzaileak l1=ListaErabiltzaileak.getListaErabiltzaileak();;
	Liburua lib1;
	@Before
	public void setUp() throws Exception {
		e1=new Erabiltzailea("Adei Arias",4565);
		e2=new Erabiltzailea("Ander Prieto",5645);
		e3=new Erabiltzailea("Jose Luis Lopez",4564);
		e4=new Erabiltzailea("Ainhoa Gomez", 4654);
		lib1=new Liburua("Norman y Mix","Wismichu",4774);
		
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testErabiltzaileKopurua() {
		l1.erreseteatu();
		assertEquals(l1.erabiltzaileKopurua(), 0);
		l1.erabiltzaileariAltaEman(e4);
		assertEquals(l1.erabiltzaileKopurua(), 1);
	}

	@Test
	public void testBilatuErabiltzaileaIdz() {
		l1.erabiltzaileariAltaEman(e1);
		l1.erabiltzaileariAltaEman(e2);
		l1.erabiltzaileariAltaEman(e3);
		assertEquals(l1.bilatuErabiltzaileaIdz(4565).getId(), 4565);
	}
	@Test
	public void testBadagoIdBerdinekoErabiltzailerik() {
		l1.erabiltzaileariAltaEman(e1);
		l1.erabiltzaileariAltaEman(e2);
		l1.erabiltzaileariAltaEman(e3);
		assertTrue(l1.badagoIdBerdinekoErabiltzailerik(e1));
		l1.erreseteatu();
		assertFalse(l1.badagoIdBerdinekoErabiltzailerik(e2));
		
	}

	@Test
	public void testErabiltzaileariAltaEman() {
		l1.erabiltzaileariAltaEman(e1);
		l1.erabiltzaileariAltaEman(e2);
		l1.erabiltzaileariAltaEman(e3);
		assertEquals(l1.erabiltzaileKopurua(), 3);
		l1.erabiltzaileariAltaEman(e4);
		assertEquals(l1.erabiltzaileKopurua(), 4);
	}

	@Test
	public void testErabiltzaileaBajaEman() {
		l1.erabiltzaileariAltaEman(e1);
		assertEquals(l1.erabiltzaileKopurua(), 1);
		l1.erabiltzaileaBajaEman(4565);
		assertEquals(l1.erabiltzaileKopurua(), 0);
	}

	@Test
	public void testNorkDaukaMaileguan() {
		l1.erreseteatu();
		assertEquals(l1.norkDaukaMaileguan(lib1), null);
	}

	@Test
	public void testInprimatu() {
		l1.erreseteatu();
		l1.erabiltzaileariAltaEman(e2);
		l1.inprimatu();
	}

	@Test
	public void testErreseteatu() {
		l1.erreseteatu();
	}
}
