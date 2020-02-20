package packlaborategia7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class ListaIkasleakKurtsoTest extends TestCase {

	Ikaslea mutila1,mutila2,neska1,neska2;
	ListaIkasleakKurtso l1 = ListaIkasleakKurtso.getListaIkasleakKurtso();

	protected void setUp() throws Exception {
		mutila1 = new Mutila("5642H","Adei","Arias",18);
		mutila2 = new Mutila("7532W","Ander","Prieto",18);
		neska1 = new Neska("7563L","Ane","Gomez",23);
		neska2 = new Neska("5311G","Maite","Larrimbe",18);
	}

	protected void tearDown() throws Exception {
		mutila1 = null;
		mutila2 = null;
		neska1 = null;
		neska2 = null;
		l1 = null;	
	}

	public void testGetListaIkasleakKurtso() {
		assertNotNull(ListaIkasleakKurtso.getListaIkasleakKurtso());
		}


	public void testGehituIkasleaKurtsoan() {
		l1.erreseteatu();
		l1.getListaIkasleakKurtso().gehituIkasleaKurtsoan(mutila1);
		l1.getListaIkasleakKurtso().gehituIkasleaKurtsoan(neska1);
	}

	public void testErreseteatu() {
		l1.getListaIkasleakKurtso().erreseteatu();
	}

	public void testBilatuIkasleaNANez() {
		l1.getListaIkasleakKurtso().erreseteatu();
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("5642H"), null);
		l1.getListaIkasleakKurtso().gehituIkasleaKurtsoan(mutila2);
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("7532W"), mutila2);
		
	}

	public void testBadagoIkaslerikBikoterikGabe() {
		assertTrue(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());
		assertFalse(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());
	}

}
