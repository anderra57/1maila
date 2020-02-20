package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class MutilaTest extends TestCase {

	Mutila mutila1,mutila2;
	Neska neska1,neska2;
	ListaIkasleak l1;

	protected void setUp() throws Exception {
		mutila1 = new Mutila("5356H","Adei","Arias",18);
		mutila2 = new Mutila("4752S","Ander","Prieto",18);
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

	public void testGehituPreferentzia() {
		mutila1.gehituPreferentzia(neska1);
		assertEquals(mutila1.getListaPreferentziak().badago(neska1), true);
		assertEquals(mutila1.getListaPreferentziak().badago(neska2), false);
	}

	public void testMutila() {
		assertNotNull(mutila1);
		assertNotNull(mutila2);
		assertNotNull(neska1);
		assertNotNull(neska2);
	}

	public void testOnartu() {
		mutila1.getListaPreferentziak().gehituIkaslea(neska1);
		assertTrue(mutila1.onartu(neska1));
		assertFalse(mutila1.onartu(neska2));
	}

}
