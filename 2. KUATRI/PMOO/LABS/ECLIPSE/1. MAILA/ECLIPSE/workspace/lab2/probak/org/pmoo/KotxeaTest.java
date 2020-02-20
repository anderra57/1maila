package org.pmoo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KotxeaTest {

	Pertsona pEtEOn, pEtBAn, pUsaEOp, pUsaBAp, pSerBBn, pSerEABn, pAusEABp, pAusBBp;
	Kotxea pFiat2018, pRenault2019, pDacia2020, pMini2021;
	
	@Before
	public void setUp() throws Exception {

		
		pEtEOn= new Pertsona("Jon Paul Alima", 13, 1 , 'g', "Etiopia", "O-");
		pEtBAn= new Pertsona("George Alima", 16, 2 , 'g', "Etiopia", "A-");
		pUsaEOp= new Pertsona("James Jones", 15, 1 , 'g', "Estatu Batuak", "O+");
		pUsaBAp= new Pertsona("Alisha Damm", 18, 2 , 'e', "Estatu Batuak", "A+");
		pSerBBn= new Pertsona("Nikola Jokic", 21, 2 , 'g', "Serbia", "B-");
		pSerEABn= new Pertsona("Ante Zizica", 16, 1 , 'e', "Serbia", "AB-");
		pAusEABp= new Pertsona("Doreen James", 12, 1 , 'e', "Australia", "AB+");
		pAusBBp= new Pertsona("Casey Stoner", 40, 2 , 'g', "Australia", "B+");
			/*
		 	private String matrikula;
			private String markaModeloa;
			private Pertsona jabea;
			 */	
		pFiat2018=new Kotxea("2018", "Fiat");
		pRenault2019=new Kotxea("2019", "Renault");
		pDacia2020=new Kotxea("2020", "Dacia");
		pMini2021=new Kotxea("2021", "Mini");
	}
	//atributuak

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKotxea() {
		assertNotNull(pFiat2018);
		assertNotNull(pRenault2019);
		assertNotNull(pDacia2020);
		assertNotNull(pMini2021);
	}

	@Test
	public void testAldatuJabea() {
	
		//fiat
		assertNull(pFiat2018.getJabea());
		pFiat2018.aldatuJabea(pEtEOn);
		assertTrue(pFiat2018.jabeaAlDa(pEtEOn));
		pFiat2018.aldatuJabea(pEtBAn);
		assertTrue(pFiat2018.jabeaAlDa(pEtBAn));
		pFiat2018.aldatuJabea(pUsaEOp);
		assertTrue(pFiat2018.jabeaAlDa(pUsaEOp));
		pFiat2018.aldatuJabea(pUsaBAp);
		assertTrue(pFiat2018.jabeaAlDa(pUsaBAp));
		pFiat2018.aldatuJabea(pSerBBn);
		assertTrue(pFiat2018.jabeaAlDa(pSerBBn));
		pFiat2018.aldatuJabea(pSerEABn);
		assertTrue(pFiat2018.jabeaAlDa(pSerEABn));
		pFiat2018.aldatuJabea(pAusEABp);
		assertTrue(pFiat2018.jabeaAlDa(pAusEABp));
		pFiat2018.aldatuJabea(pAusBBp);
		assertTrue(pFiat2018.jabeaAlDa(pAusBBp));
		pFiat2018.aldatuJabea(null);
		
		//renault
		assertNull(pRenault2019.getJabea());
		pRenault2019.aldatuJabea(pEtEOn);
		assertTrue(pRenault2019.jabeaAlDa(pEtEOn));
		pRenault2019.aldatuJabea(pEtBAn);
		assertTrue(pRenault2019.jabeaAlDa(pEtBAn));
		pRenault2019.aldatuJabea(pUsaEOp);
		assertTrue(pRenault2019.jabeaAlDa(pUsaEOp));
		pRenault2019.aldatuJabea(pUsaBAp);
		assertTrue(pRenault2019.jabeaAlDa(pUsaBAp));
		pRenault2019.aldatuJabea(pSerBBn);
		assertTrue(pRenault2019.jabeaAlDa(pSerBBn));
		pRenault2019.aldatuJabea(pSerEABn);
		assertTrue(pRenault2019.jabeaAlDa(pSerEABn));
		pRenault2019.aldatuJabea(pAusEABp);
		assertTrue(pRenault2019.jabeaAlDa(pAusEABp));
		pRenault2019.aldatuJabea(pAusBBp);
		assertTrue(pRenault2019.jabeaAlDa(pAusBBp));
		pRenault2019.aldatuJabea(null);
				
		//dacia
		assertNull(pDacia2020.getJabea());
		pDacia2020.aldatuJabea(pEtEOn);
		assertTrue(pDacia2020.jabeaAlDa(pEtEOn));
		pDacia2020.aldatuJabea(pEtBAn);
		assertTrue(pDacia2020.jabeaAlDa(pEtBAn));
		pDacia2020.aldatuJabea(pUsaEOp);
		assertTrue(pDacia2020.jabeaAlDa(pUsaEOp));
		pDacia2020.aldatuJabea(pUsaBAp);
		assertTrue(pDacia2020.jabeaAlDa(pUsaBAp));
		pDacia2020.aldatuJabea(pSerBBn);
		assertTrue(pDacia2020.jabeaAlDa(pSerBBn));
		pDacia2020.aldatuJabea(pSerEABn);
		assertTrue(pDacia2020.jabeaAlDa(pSerEABn));
		pDacia2020.aldatuJabea(pAusEABp);
		assertTrue(pDacia2020.jabeaAlDa(pAusEABp));
		pDacia2020.aldatuJabea(pAusBBp);
		assertTrue(pDacia2020.jabeaAlDa(pAusBBp));
		pDacia2020.aldatuJabea(null);
		
		//mini
		assertNull(pMini2021.getJabea());
		pMini2021.aldatuJabea(pEtEOn);
		assertTrue(pMini2021.jabeaAlDa(pEtEOn));
		pMini2021.aldatuJabea(pEtBAn);
		assertTrue(pMini2021.jabeaAlDa(pEtBAn));
		pMini2021.aldatuJabea(pUsaEOp);
		assertTrue(pMini2021.jabeaAlDa(pUsaEOp));
		pMini2021.aldatuJabea(pUsaBAp);
		assertTrue(pMini2021.jabeaAlDa(pUsaBAp));
		pMini2021.aldatuJabea(pSerBBn);
		assertTrue(pMini2021.jabeaAlDa(pSerBBn));
		pMini2021.aldatuJabea(pSerEABn);
		assertTrue(pMini2021.jabeaAlDa(pSerEABn));
		pMini2021.aldatuJabea(pAusEABp);
		assertTrue(pMini2021.jabeaAlDa(pAusEABp));
		pMini2021.aldatuJabea(pAusBBp);
		assertTrue(pMini2021.jabeaAlDa(pAusBBp));
		pMini2021.aldatuJabea(null);	
	}

	/* DELETE
	public void testJabeaAlDa() {
		assertEquals(, pAusBBp);
	}*/

	
}
