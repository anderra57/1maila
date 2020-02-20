package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import junit.framework.TestCase;

public class NeskaTest extends TestCase {

	Neska neska1,neska2;
	Mutila mutila1,mutila2;

	protected void setUp() throws Exception {
		neska1 = new Neska("2667L","Ane","Gomez",18);
		neska2 = new Neska("5743J","Maite","Larrimbe",18);
		mutila1 = new Mutila("5642H","Adei","Arias",18);
		mutila2 = new Mutila("7532W","Ander","Prieto",18);
	}

	protected void tearDown() throws Exception {
		neska1 = null;
		neska2 = null;
		mutila1 = null;
		mutila2 = null;
	}

	public void testGehituPreferentzia() {
		neska1.gehituPreferentzia(mutila1);
		assertEquals(neska1.getListaPreferentziak().badago(mutila1), true);
		assertEquals(neska1.getListaPreferentziak().badago(mutila2), false);
	}

	public void testNeska() {
		assertNotNull(neska1);
		assertNotNull(neska2);
		assertNotNull(mutila1);
		assertNotNull(mutila2);
	}

	public void testEnparejatu() {
		fail("Not yet implemented");
	}

}
