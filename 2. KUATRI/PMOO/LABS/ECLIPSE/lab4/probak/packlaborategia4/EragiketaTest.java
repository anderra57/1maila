package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EragiketaTest {

	Eragiketa e1, e2, enull;
	Bezeroa b1;
	
	@Before
	public void setUp() throws Exception {
		//public Eragiketa(int pId, int pIdBezeroa, String pPasaHitza, double pDiruKop)
		e1=new Eragiketa(1, 1, "cepedacalvo", 10.00);
		e2=new Eragiketa(2, 1, "cepedacalvo", 7877870.00);
		enull=null;
		
		b1=new Bezeroa(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdBerdinaDu() {
		assertTrue(e1.idBerdinaDu(1));
	}

	@Test
	public void testEragiketaBurutu() {
		e1.eragiketaBurutu();
		assertEquals(b1.saldoaLortu("cepedacalvo"),54170.00,2);
	}

}
