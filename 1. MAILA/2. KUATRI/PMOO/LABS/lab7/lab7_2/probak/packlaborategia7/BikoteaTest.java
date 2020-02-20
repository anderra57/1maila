package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class BikoteaTest extends TestCase {

	Bikotea b1,b2;
	Mutila mutila1,mutila2;
	Neska neska1, neska2;

	
	protected void setUp() throws Exception {
		mutila1 = new Mutila("5634H","Adei","Arias",18);
		neska1 = new Neska("6754L","Maite","Larrimbe",18);
		neska2 = new Neska("7563L","Ane","Gomez",23);
		mutila2 = new Mutila("7532W","Ander","Prieto",18);
		b1 = new Bikotea(mutila1, neska1);
		b2 = new Bikotea(mutila2, neska2);
	}

	protected void tearDown() throws Exception {
		b1 = null;
		b2 = null;
		mutila1 = null;
		neska1 = null;
		mutila2 = null;
		neska2 = null;
	}

	public void testBikotea() {
		assertNotNull(b1);
		assertNotNull(b2);
		assertNotNull(mutila1);
		assertNotNull(neska1);
		assertNotNull(mutila2);
		assertNotNull(neska2);
	}

	public void testGetNeska() {
		assertEquals(b1.getNeska(), neska1);
	}

	public void testGetMutila() {
		assertEquals(b1.getMutila(), mutila1);
	}

	public void testBadago() {
		assertTrue(b1.badago(mutila1));
		assertFalse(b1.badago(mutila2));
	}

}
