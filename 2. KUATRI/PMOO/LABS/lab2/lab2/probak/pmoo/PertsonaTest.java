package pmoo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pmoo.Pertsona;

public class PertsonaTest {

	Pertsona pEtEOn, pEtBAn, pUsaEOp, pUsaBAp, pSerBBn, pSerEABn, pAusEABp, pAusBBp;
	
	@Before
	public void setUp() throws Exception {
		//String pIzena, int pAdina, int pId, char pSexua, 
		// , String pNazionalitatea, String pOdolMota
		pEtEOn= new Pertsona(1, "Jon Paul Alima", 13, "O-", "Etiopia");
		pEtBAn= new Pertsona(2, "George Alima", 16, "A-", "Etiopia");
		pUsaEOp= new Pertsona(1, "James Jones", 15, "O+", "Estatu Batuak");
		pUsaBAp= new Pertsona(2, "Alisha Damm", 18, "A+", "Estatu Batuak");
		pSerBBn= new Pertsona(2, "Nikola Jokic", 21, "B-", "Serbia");
		pSerEABn= new Pertsona(1, "Ante Zizica", 16, "AB-", "Serbia");
		pAusEABp= new Pertsona(1, "Doreen James", 12, "AB+", "Australia");
		pAusBBp= new Pertsona(2, "Casey Stoner", 40, "B+", "Australia");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPertsona() {
		assertNotNull(pEtEOn);
		assertNotNull(pEtBAn);
		assertNotNull(pUsaEOp);
		assertNotNull(pUsaBAp);
		assertNotNull(pSerBBn);
		assertNotNull(pSerEABn);
		assertNotNull(pAusEABp);
		assertNotNull(pAusBBp);
	}

	@Test
	public void testIdBerdinaDu() {
		assertFalse(pEtEOn.idBerdinaDu(pEtBAn));
		
		//pEtEOn (1)

		assertTrue(pUsaEOp.idBerdinaDu(pEtEOn));
		assertFalse(pSerBBn.idBerdinaDu(pEtEOn));
		assertFalse(pEtBAn.idBerdinaDu(pEtEOn));
		assertFalse(pAusBBp.idBerdinaDu(pEtEOn));
		assertFalse(pUsaBAp.idBerdinaDu(pEtEOn));
		assertTrue(pSerEABn.idBerdinaDu(pEtEOn));
		assertTrue(pAusEABp.idBerdinaDu(pEtEOn));	
		
		//pEtBAn (2)
		assertFalse(pEtEOn.idBerdinaDu(pEtBAn));
		assertFalse(pUsaEOp.idBerdinaDu(pEtBAn));
		assertTrue(pSerBBn.idBerdinaDu(pEtBAn));

		assertTrue(pAusBBp.idBerdinaDu(pEtBAn));
		assertTrue(pUsaBAp.idBerdinaDu(pEtBAn));
		assertFalse(pSerEABn.idBerdinaDu(pEtBAn));
		assertFalse(pAusEABp.idBerdinaDu(pEtBAn));	
		
		//pUsaEOp (1)
		assertTrue(pEtEOn.idBerdinaDu(pUsaEOp));

		assertFalse(pSerBBn.idBerdinaDu(pUsaEOp));
		assertFalse(pEtBAn.idBerdinaDu(pUsaEOp));
		assertFalse(pAusBBp.idBerdinaDu(pUsaEOp));
		assertFalse(pUsaBAp.idBerdinaDu(pUsaEOp));
		assertTrue(pSerEABn.idBerdinaDu(pUsaEOp));
		assertTrue(pAusEABp.idBerdinaDu(pUsaEOp));	
		
		//pUsaBAp (2)
		assertFalse(pEtEOn.idBerdinaDu(pUsaBAp));
		assertFalse(pUsaEOp.idBerdinaDu(pUsaBAp));
		assertTrue(pSerBBn.idBerdinaDu(pUsaBAp));
		assertTrue(pEtBAn.idBerdinaDu(pUsaBAp));
		assertTrue(pAusBBp.idBerdinaDu(pUsaBAp));

		assertFalse(pSerEABn.idBerdinaDu(pUsaBAp));
		assertFalse(pAusEABp.idBerdinaDu(pUsaBAp));	
		
		//pSerEABn (1)
		assertTrue(pEtEOn.idBerdinaDu(pSerEABn));
		assertTrue(pUsaEOp.idBerdinaDu(pSerEABn));
		assertFalse(pSerBBn.idBerdinaDu(pSerEABn));
		assertFalse(pEtBAn.idBerdinaDu(pSerEABn));
		assertFalse(pAusBBp.idBerdinaDu(pSerEABn));
		assertFalse(pUsaBAp.idBerdinaDu(pSerEABn));

		assertTrue(pAusEABp.idBerdinaDu(pSerEABn));	
		
		//pSerBBn (2)
		assertFalse(pEtEOn.idBerdinaDu(pSerBBn));
		assertFalse(pUsaEOp.idBerdinaDu(pSerBBn));

		assertTrue(pEtBAn.idBerdinaDu(pSerBBn));
		assertTrue(pAusBBp.idBerdinaDu(pSerBBn));
		assertTrue(pUsaBAp.idBerdinaDu(pSerBBn));
		assertFalse(pSerEABn.idBerdinaDu(pSerBBn));
		assertFalse(pAusEABp.idBerdinaDu(pSerBBn));	
		
		//pAusEABp (1)
		assertTrue(pEtEOn.idBerdinaDu(pAusEABp));
		assertTrue(pUsaEOp.idBerdinaDu(pAusEABp));
		assertFalse(pSerBBn.idBerdinaDu(pAusEABp));
		assertFalse(pEtBAn.idBerdinaDu(pAusEABp));
		assertFalse(pAusBBp.idBerdinaDu(pAusEABp));
		assertFalse(pUsaBAp.idBerdinaDu(pAusEABp));
		assertTrue(pSerEABn.idBerdinaDu(pAusEABp));

		
		//pAusBBp (2)
		assertFalse(pEtEOn.idBerdinaDu(pAusBBp));
		assertFalse(pUsaEOp.idBerdinaDu(pAusBBp));
		assertTrue(pSerBBn.idBerdinaDu(pAusBBp));
		assertTrue(pEtBAn.idBerdinaDu(pAusBBp));

		assertTrue(pUsaBAp.idBerdinaDu(pAusBBp));
		assertFalse(pSerEABn.idBerdinaDu(pAusBBp));
		assertFalse(pAusEABp.idBerdinaDu(pAusBBp));	
		
	}

	@Test
	public void testGidatuDezake() {
		assertTrue(pEtBAn.gidatuDezake());
		assertFalse(pEtEOn.gidatuDezake());

		assertTrue(pUsaBAp.gidatuDezake());
		assertFalse(pUsaEOp.gidatuDezake());

		assertTrue(pSerBBn.gidatuDezake());
		assertFalse(pSerEABn.gidatuDezake());

		assertTrue(pAusBBp.gidatuDezake());
		assertFalse(pAusEABp.gidatuDezake());
	}

	@Test
	public void testemanDiezaiokeOdola() {
		//AB+
		assertTrue(pEtEOn.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pUsaEOp.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pSerBBn.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pEtBAn.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pAusBBp.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pUsaBAp.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pSerEABn.emanDiezaiokeOdola(pAusEABp));
		assertTrue(pAusEABp.emanDiezaiokeOdola(pAusEABp));	

		//AB-
		assertTrue(pEtEOn.emanDiezaiokeOdola(pSerEABn));
		assertFalse(pUsaEOp.emanDiezaiokeOdola(pSerEABn));
		assertTrue(pSerBBn.emanDiezaiokeOdola(pSerEABn));
		assertTrue(pEtBAn.emanDiezaiokeOdola(pSerEABn));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pSerEABn));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pSerEABn));
		assertTrue(pSerEABn.emanDiezaiokeOdola(pSerEABn));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pSerEABn));
		
		//A+ 
		assertTrue(pEtEOn.emanDiezaiokeOdola(pUsaBAp));
		assertTrue(pUsaEOp.emanDiezaiokeOdola(pUsaBAp));
		assertFalse(pSerBBn.emanDiezaiokeOdola(pUsaBAp));
		assertTrue(pEtBAn.emanDiezaiokeOdola(pUsaBAp));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pUsaBAp));
		assertTrue(pUsaBAp.emanDiezaiokeOdola(pUsaBAp));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pUsaBAp));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pUsaBAp));

		//A-
		assertTrue(pEtEOn.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pUsaEOp.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pSerBBn.emanDiezaiokeOdola(pEtBAn));
		assertTrue(pEtBAn.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pEtBAn));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pEtBAn));
		
		//B+
		assertTrue(pEtEOn.emanDiezaiokeOdola(pAusBBp));
		assertTrue(pUsaEOp.emanDiezaiokeOdola(pAusBBp));
		assertTrue(pSerBBn.emanDiezaiokeOdola(pAusBBp));
		assertFalse(pEtBAn.emanDiezaiokeOdola(pAusBBp));
		assertTrue(pAusBBp.emanDiezaiokeOdola(pAusBBp));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pAusBBp));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pAusBBp));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pAusBBp));
				
		//B-
		assertTrue(pEtEOn.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pUsaEOp.emanDiezaiokeOdola(pSerBBn));
		assertTrue(pSerBBn.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pEtBAn.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pSerBBn));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pSerBBn));
		
		//O+
		assertTrue(pEtEOn.emanDiezaiokeOdola(pUsaEOp));
		assertTrue(pUsaEOp.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pSerBBn.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pEtBAn.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pUsaEOp));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pUsaEOp));
				
		//O-
		assertTrue(pEtEOn.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pUsaEOp.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pSerBBn.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pEtBAn.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pAusBBp.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pUsaBAp.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pSerEABn.emanDiezaiokeOdola(pEtEOn));
		assertFalse(pAusEABp.emanDiezaiokeOdola(pEtEOn));
		
	}

	@Test
	public void testizenarenIniziala() {
		assertEquals(pEtEOn.izenarenIniziala(), 'J');
		assertEquals(pEtBAn.izenarenIniziala(), 'G');
		assertEquals(pUsaEOp.izenarenIniziala(), 'J');
		assertEquals(pUsaBAp.izenarenIniziala(), 'A');
		assertEquals(pSerBBn.izenarenIniziala(), 'N');
		assertEquals(pSerEABn.izenarenIniziala(), 'A');
		assertEquals(pAusEABp.izenarenIniziala(), 'D');
		assertEquals(pAusBBp.izenarenIniziala(), 'C');
	}

	@Test
	public void testabizenarenIniziala() {
		assertEquals(pEtEOn.abizenarenIniziala(), 'A');
		assertEquals(pEtBAn.abizenarenIniziala(), 'A');
		assertEquals(pUsaEOp.abizenarenIniziala(), 'J');
		assertEquals(pUsaBAp.abizenarenIniziala(), 'D');
		assertEquals(pSerBBn.abizenarenIniziala(), 'J');
		assertEquals(pSerEABn.abizenarenIniziala(), 'Z');
		assertEquals(pAusEABp.abizenarenIniziala(), 'J');
		assertEquals(pAusBBp.abizenarenIniziala(), 'S');
	}

}
