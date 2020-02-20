package org.pmoo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PertsonaTest {

	Pertsona pEtEOn, pEtBAn, pUsaEOp, pUsaBAp, pSerBBn, pSerEABn, pAusEABp, pAusBBp;
	
	@Before
	public void setUp() throws Exception {
		//String pIzena, int pAdina, int pId, char pSexua, 
		// , String pNazionalitatea, String pOdolMota
		pEtEOn= new Pertsona("Jon Paul Alima", 13, 1 , 'g', "Etiopia", "O-");
		pEtBAn= new Pertsona("George Alima", 16, 2 , 'g', "Etiopia", "A-");
		pUsaEOp= new Pertsona("James Jones", 15, 1 , 'g', "Estatu Batuak", "O+");
		pUsaBAp= new Pertsona("Alisha Damm", 18, 2 , 'e', "Estatu Batuak", "A+");
		pSerBBn= new Pertsona("Nikola Jokic", 21, 2 , 'g', "Serbia", "B-");
		pSerEABn= new Pertsona("Ante Zizica", 16, 1 , 'e', "Serbia", "AB-");
		pAusEABp= new Pertsona("Doreen James", 12, 1 , 'e', "Australia", "AB+");
		pAusBBp= new Pertsona("Casey Stoner", 40, 2 , 'g', "Australia", "B+");
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
	public void testOdolaEmanDiezaioke() {
		//AB+
		assertTrue(pEtEOn.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pUsaEOp.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pSerBBn.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pEtBAn.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pAusBBp.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pUsaBAp.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pSerEABn.odolaEmanDiezaioke(pAusEABp));
		assertTrue(pAusEABp.odolaEmanDiezaioke(pAusEABp));	

		//AB-
		assertTrue(pEtEOn.odolaEmanDiezaioke(pSerEABn));
		assertFalse(pUsaEOp.odolaEmanDiezaioke(pSerEABn));
		assertTrue(pSerBBn.odolaEmanDiezaioke(pSerEABn));
		assertTrue(pEtBAn.odolaEmanDiezaioke(pSerEABn));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pSerEABn));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pSerEABn));
		assertTrue(pSerEABn.odolaEmanDiezaioke(pSerEABn));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pSerEABn));
		
		//A+ 
		assertTrue(pEtEOn.odolaEmanDiezaioke(pUsaBAp));
		assertTrue(pUsaEOp.odolaEmanDiezaioke(pUsaBAp));
		assertFalse(pSerBBn.odolaEmanDiezaioke(pUsaBAp));
		assertTrue(pEtBAn.odolaEmanDiezaioke(pUsaBAp));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pUsaBAp));
		assertTrue(pUsaBAp.odolaEmanDiezaioke(pUsaBAp));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pUsaBAp));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pUsaBAp));

		//A-
		assertTrue(pEtEOn.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pUsaEOp.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pSerBBn.odolaEmanDiezaioke(pEtBAn));
		assertTrue(pEtBAn.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pEtBAn));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pEtBAn));
		
		//B+
		assertTrue(pEtEOn.odolaEmanDiezaioke(pAusBBp));
		assertTrue(pUsaEOp.odolaEmanDiezaioke(pAusBBp));
		assertTrue(pSerBBn.odolaEmanDiezaioke(pAusBBp));
		assertFalse(pEtBAn.odolaEmanDiezaioke(pAusBBp));
		assertTrue(pAusBBp.odolaEmanDiezaioke(pAusBBp));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pAusBBp));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pAusBBp));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pAusBBp));
				
		//B-
		assertTrue(pEtEOn.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pUsaEOp.odolaEmanDiezaioke(pSerBBn));
		assertTrue(pSerBBn.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pEtBAn.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pSerBBn));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pSerBBn));
		
		//O+
		assertTrue(pEtEOn.odolaEmanDiezaioke(pUsaEOp));
		assertTrue(pUsaEOp.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pSerBBn.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pEtBAn.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pUsaEOp));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pUsaEOp));
				
		//O-
		assertTrue(pEtEOn.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pUsaEOp.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pSerBBn.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pEtBAn.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pAusBBp.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pUsaBAp.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pSerEABn.odolaEmanDiezaioke(pEtEOn));
		assertFalse(pAusEABp.odolaEmanDiezaioke(pEtEOn));
		
	}

	@Test
	public void testGetIzenarenIniziala() {
		assertEquals(pEtEOn.getIzenarenIniziala(), 'J');
		assertEquals(pEtBAn.getIzenarenIniziala(), 'G');
		assertEquals(pUsaEOp.getIzenarenIniziala(), 'J');
		assertEquals(pUsaBAp.getIzenarenIniziala(), 'A');
		assertEquals(pSerBBn.getIzenarenIniziala(), 'N');
		assertEquals(pSerEABn.getIzenarenIniziala(), 'A');
		assertEquals(pAusEABp.getIzenarenIniziala(), 'D');
		assertEquals(pAusBBp.getIzenarenIniziala(), 'C');
	}

	@Test
	public void testGetAbizenarenIniziala() {
		assertEquals(pEtEOn.getAbizenarenIniziala(), 'A');
		assertEquals(pEtBAn.getAbizenarenIniziala(), 'A');
		assertEquals(pUsaEOp.getAbizenarenIniziala(), 'J');
		assertEquals(pUsaBAp.getAbizenarenIniziala(), 'D');
		assertEquals(pSerBBn.getAbizenarenIniziala(), 'J');
		assertEquals(pSerEABn.getAbizenarenIniziala(), 'Z');
		assertEquals(pAusEABp.getAbizenarenIniziala(), 'J');
		assertEquals(pAusBBp.getAbizenarenIniziala(), 'S');
	}

}
