package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import junit.framework.TestCase;

public class IkasleaTest extends TestCase {
	Ikaslea mutila1, mutila2, neska1, neska2;
	ListaIkasleak l1;
	protected void setUp() throws Exception {
		mutila1 = new Mutila("5642H","Adei","Arias",18);
		mutila2 = new Mutila("7532W","Ander","Prieto",18);
		neska1 = new Neska("7563L","Ane","Gomez",23);
		neska2 = new Neska("5311G","Maite","Larrimbe",18);
		l1 = new ListaIkasleak();
	}

	protected void tearDown() throws Exception {
			mutila1 = null;
		mutila2 = null;
		neska1 = null;
		neska2 = null;
	}

	public void testIkaslea() {
		assertNotNull(mutila1);
		assertNotNull(mutila2);
		assertNotNull(neska1);
		assertNotNull(neska2);
	}

	public void testGetListaPreferentziak() {
		assertEquals(mutila1.getListaPreferentziak(), this.l1);
		}

	public void testGetIzena() {
		assertEquals(mutila1.getIzena(), "Adei");
	}

	public void testGetAbizena() {
		assertEquals(mutila1.getAbizena(), "Arias");
	}

	public void testGetAdina() {
		assertEquals(mutila1.getAdina(), 18);
	}

	public void testGetNAN() {
		assertEquals(mutila1.getNAN(), "5642H");
	}


	public void testGehituPreferentzia() {
		mutila1.getListaPreferentziak().gehituIkaslea(neska1);
		mutila1.getListaPreferentziak().gehituIkaslea(neska2);
		assertEquals(mutila1.getListaPreferentziak().getTamaina(), 2);
	}
}
