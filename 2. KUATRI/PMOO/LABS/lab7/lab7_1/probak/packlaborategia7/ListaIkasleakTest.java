package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class ListaIkasleakTest extends TestCase {
	
	ListaIkasleak l1,l2,l3,l4,l5;
	Ikaslea mutila1,mutila2,neska1,neska2;
	
	protected void setUp() throws Exception {
		l1 = new ListaIkasleak();
		l2 = new ListaIkasleak();
		l3 = new ListaIkasleak();
		l4 = new ListaIkasleak();
		l5 = new ListaIkasleak();
		mutila1 = new Mutila("4656H","Adei","Arias",18);
		mutila2 = new Mutila("3556S","Ander","Prieto",18);
		neska1 = new Neska("7976K","Ane","Gomez",18);
		neska2 = new Neska("3031E","Maite","Larrimbe",18);
		
	}

	protected void tearDown() throws Exception {
		l1 = null;
		l2 = null;
		l3 = null;
		l4 = null;
		l5 = null;
		mutila1 = null;
		mutila2 = null;
		neska1 = null;
		neska2 = null;
	}

	public void testListaIkasleak() {
		assertNotNull(l1);
		assertNotNull(l2);
		assertNotNull(l3);
		assertNotNull(l4);
		assertNotNull(l5);
		assertNotNull(neska1);
		assertNotNull(neska2);
		assertNotNull(mutila1);
		assertNotNull(mutila2);
	}

	public void testGehituIkaslea() {
		assertEquals(l1.getTamaina(), 0);
		l1.gehituIkaslea(mutila1);
		assertEquals(l1.getTamaina(), 1);
	}

	public void testKenduIkaslea() {
		l2.gehituIkaslea(mutila1);
		l2.gehituIkaslea(neska1);
		assertEquals(l2.getTamaina(), 2);
		l2.kenduIkaslea(mutila1);
		assertEquals(l2.getTamaina(), 1);
	}

	public void testBadago() {
		l5.gehituIkaslea(mutila1);
		assertTrue(l5.badago(mutila1));
		assertFalse(l5.badago(neska1));
	}

	public void testGetTamaina() {
		l3.gehituIkaslea(mutila1);
		l3.gehituIkaslea(mutila2);
		assertEquals(l3.getTamaina(), 2);
	}

	public void testGetIkasleaPos() {
		l4.gehituIkaslea(mutila1);
		l4.gehituIkaslea(mutila2);
		l4.gehituIkaslea(neska1);
		l4.gehituIkaslea(neska2);
		assertEquals(l4.getIkasleaPos(0), mutila1);
		assertEquals(l4.getIkasleaPos(4), null);
	}

}
