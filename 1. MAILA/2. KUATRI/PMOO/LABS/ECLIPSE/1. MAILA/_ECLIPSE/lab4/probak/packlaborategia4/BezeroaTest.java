package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BezeroaTest {

	Bezeroa b1,b2,b3,b4;
	
	@Before
	public void setUp() throws Exception {
		/*public Bezeroa(int pId, String pIzenAbizena, String pPasaHitza,
				double pSaldoa, boolean pBerezia)*/
		b1=new Bezeroa(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
		b2=new Bezeroa(2, "Ander Prieto", "1ae2xdddnotevoyadarmipass", 5757.57, true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBereziaDa() {
		assertTrue(b1.bereziaDa());
	}

	@Test
	public void testIdBerdinaDu() {
		assertTrue(b1.idBerdinaDu(1));
		assertFalse(b1.idBerdinaDu(2));
	}

	@Test
	public void testSaldoaLortu() {
		assertEquals(b1.saldoaLortu("cepedacalvo"),54180.00,2);
	}

	@Test
	public void testSaldoaEguneratu() {
		b1.saldoaEguneratu("cepedacalvo", 10.00);
		assertEquals(b1.saldoaLortu("cepedacalvo"),54170.00,2);
	}
	/*
	@Test
	public void testGetIdBezeroa() {
	}
	 */
}
