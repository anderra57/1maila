//package packlaborategia3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZatikiaTest {
	
	Zatikia zat1,zat2,zat3,zat4,zat5,zat0;

	@Before
	public void setUp() throws Exception {
		zat1=new Zatikia(15,10);
		zat2=new Zatikia(7,9);
		zat3=new Zatikia(-7,9);
		zat4=new Zatikia(7,-9);
		zat5=new Zatikia(14,18);
		zat0=new Zatikia(0,0);
	}

	@After
	public void tearDown() throws Exception {
	}
/*
	@Test
	public void testZatikia() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testSinplifikatu() {
		zat1.sinplifikatu();
		assertEquals(zat1.getIzendatzailea(),2);
		assertEquals(zat1.getZenbakitzailea(),3);
	}

	@Test
	public void testGehitu() {
		zat1.gehitu(zat2);
		assertEquals(zat1.gehitu(zat2).getZenbakitzailea(),41);
		assertEquals(zat1.gehitu(zat2).getIzendatzailea(),18);
		
		zat1.gehitu(zat3);
		assertEquals(zat1.gehitu(zat3).getZenbakitzailea(),13);
		assertEquals(zat1.gehitu(zat3).getIzendatzailea(),18);

		zat1.gehitu(zat4);
		assertEquals(zat1.gehitu(zat4).getZenbakitzailea(),13);
		assertEquals(zat1.gehitu(zat4).getIzendatzailea(),18);
	}

	@Test
	public void testKendu() {
		zat1.kendu(zat2);
		assertEquals(zat1.kendu(zat2).getZenbakitzailea(),13);
		assertEquals(zat1.kendu(zat2).getIzendatzailea(),18);

		zat1.kendu(zat3);
		assertEquals(zat1.kendu(zat3).getZenbakitzailea(),41);
		assertEquals(zat1.kendu(zat3).getIzendatzailea(),18);

		zat1.kendu(zat4);
		assertEquals(zat1.kendu(zat4).getZenbakitzailea(),41);
		assertEquals(zat1.kendu(zat4).getIzendatzailea(),18);
		
	}

	@Test
	public void testBiderkatu() {
		zat1.biderkatu(zat2);
		assertEquals(zat1.biderkatu(zat2).getZenbakitzailea(),7);
		assertEquals(zat1.biderkatu(zat2).getIzendatzailea(),6);

		zat1.biderkatu(zat3);
		assertEquals(zat1.biderkatu(zat3).getZenbakitzailea(),-7);
		assertEquals(zat1.biderkatu(zat3).getIzendatzailea(),6);

		zat1.biderkatu(zat4);
		assertEquals(zat1.biderkatu(zat4).getZenbakitzailea(),-7);
		assertEquals(zat1.biderkatu(zat4).getIzendatzailea(),6);
		
	}

	@Test
	public void testZatitu() {
		zat1.zatitu(zat2);
		assertEquals(zat1.zatitu(zat2).getZenbakitzailea(),27);
		assertEquals(zat1.zatitu(zat2).getIzendatzailea(),14);
	}
	
	@Test
	public void testBerdinaDa() {
		assertFalse(zat1.berdinaDa(zat2));
		assertTrue(zat2.berdinaDa(zat5));
	}
	
	@Test
	public void testHandiagoaDa() {
		assertTrue(zat1.handiagoaDa(zat2));
		assertFalse(zat3.handiagoaDa(zat2));
	}
	
	@Test
	public void testTxikagoaDa() {
		assertFalse(zat1.txikiagoaDa(zat2));
		assertTrue(zat3.txikiagoaDa(zat2));
	}

	@Test
	public void testIzendatzaileBerdinaDu() {
		assertTrue(zat2.izendatzaileBerdinaDu(zat3));
		assertFalse(zat2.izendatzaileBerdinaDu(zat1));
	}

	@Test
	public void testZenbakitzaileBerdinaDu() {
		assertTrue(zat2.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat1));
	}

}
