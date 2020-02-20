package packlaborategia3;

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
		
		//zat1+x
		
		zat1.gehitu(zat2);
		assertEquals(zat1.gehitu(zat2).getZenbakitzailea(),41);
		assertEquals(zat1.gehitu(zat2).getIzendatzailea(),18);
		
		zat1.gehitu(zat3);
		assertEquals(zat1.gehitu(zat3).getZenbakitzailea(),13);
		assertEquals(zat1.gehitu(zat3).getIzendatzailea(),18);

		zat1.gehitu(zat4);
		assertEquals(zat1.gehitu(zat4).getZenbakitzailea(),13);
		assertEquals(zat1.gehitu(zat4).getIzendatzailea(),18);
		
		zat1.gehitu(zat5);
		assertEquals(zat1.gehitu(zat5).getZenbakitzailea(),41);
		assertEquals(zat1.gehitu(zat5).getIzendatzailea(),18);

		//zat2+x
		
		zat2.gehitu(zat1);
		assertEquals(zat2.gehitu(zat1).getZenbakitzailea(),41);
		assertEquals(zat2.gehitu(zat1).getIzendatzailea(),18);
		
		zat2.gehitu(zat3);
		assertEquals(zat2.gehitu(zat3).getZenbakitzailea(),0);
		assertEquals(zat2.gehitu(zat3).getIzendatzailea(),1);

		zat2.gehitu(zat4);
		assertEquals(zat2.gehitu(zat4).getZenbakitzailea(),0);
		assertEquals(zat2.gehitu(zat4).getIzendatzailea(),1);
		
		zat2.gehitu(zat5);
		assertEquals(zat2.gehitu(zat4).getZenbakitzailea(),0);
		assertEquals(zat2.gehitu(zat4).getIzendatzailea(),1);
		
		
		//zat3+x
		
		zat3.gehitu(zat1);
		assertEquals(zat3.gehitu(zat1).getZenbakitzailea(),13);
		assertEquals(zat3.gehitu(zat1).getIzendatzailea(),18);
		
		zat3.gehitu(zat2);
		assertEquals(zat3.gehitu(zat2).getZenbakitzailea(),0);
		assertEquals(zat3.gehitu(zat2).getIzendatzailea(),1);

		zat3.gehitu(zat4);
		assertEquals(zat3.gehitu(zat4).getZenbakitzailea(),-14);
		assertEquals(zat3.gehitu(zat4).getIzendatzailea(),9);
		
		zat3.gehitu(zat5);
		assertEquals(zat3.gehitu(zat5).getZenbakitzailea(),0);
		assertEquals(zat3.gehitu(zat5).getIzendatzailea(),1);
		
		//zat4+x
		
		zat4.gehitu(zat1);
		assertEquals(zat4.gehitu(zat1).getZenbakitzailea(),13);
		assertEquals(zat4.gehitu(zat1).getIzendatzailea(),18);
		
		zat4.gehitu(zat2);
		assertEquals(zat4.gehitu(zat2).getZenbakitzailea(),0);
		assertEquals(zat4.gehitu(zat2).getIzendatzailea(),1);

		zat4.gehitu(zat3);
		assertEquals(zat4.gehitu(zat3).getZenbakitzailea(),-14);
		assertEquals(zat4.gehitu(zat3).getIzendatzailea(),9);
		
		zat4.gehitu(zat5);
		assertEquals(zat4.gehitu(zat5).getZenbakitzailea(),0);
		assertEquals(zat4.gehitu(zat5).getIzendatzailea(),1);
		
		//zat5+x
		
		zat5.gehitu(zat1);
		assertEquals(zat5.gehitu(zat1).getZenbakitzailea(),41);
		assertEquals(zat5.gehitu(zat1).getIzendatzailea(),18);
		
		zat5.gehitu(zat3);
		assertEquals(zat5.gehitu(zat3).getZenbakitzailea(),0);
		assertEquals(zat5.gehitu(zat3).getIzendatzailea(),1);

		zat5.gehitu(zat4);
		assertEquals(zat5.gehitu(zat4).getZenbakitzailea(),0);
		assertEquals(zat5.gehitu(zat4).getIzendatzailea(),1);
		
		zat5.gehitu(zat5);
		assertEquals(zat5.gehitu(zat2).getZenbakitzailea(),14);
		assertEquals(zat5.gehitu(zat2).getIzendatzailea(),9);
		
		
		
		
		
		zat1.gehitu(zat0);
		assertEquals(zat1.gehitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat1.gehitu(zat0).getIzendatzailea(),0);
		zat2.gehitu(zat0);
		assertEquals(zat2.gehitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat2.gehitu(zat0).getIzendatzailea(),0);
		zat3.gehitu(zat0);
		assertEquals(zat3.gehitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat3.gehitu(zat0).getIzendatzailea(),0);
		zat4.gehitu(zat0);
		assertEquals(zat4.gehitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat4.gehitu(zat0).getIzendatzailea(),0);
		zat5.gehitu(zat0);
		assertEquals(zat5.gehitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat5.gehitu(zat0).getIzendatzailea(),0);
	}

	@Test
	public void testKendu() {
		
		//zat1-x
		
		zat1.kendu(zat2);
		assertEquals(zat1.kendu(zat2).getZenbakitzailea(),13);
		assertEquals(zat1.kendu(zat2).getIzendatzailea(),18);

		zat1.kendu(zat3);
		assertEquals(zat1.kendu(zat3).getZenbakitzailea(),41);
		assertEquals(zat1.kendu(zat3).getIzendatzailea(),18);

		zat1.kendu(zat4);
		assertEquals(zat1.kendu(zat4).getZenbakitzailea(),41);
		assertEquals(zat1.kendu(zat4).getIzendatzailea(),18);
		
		zat1.kendu(zat5);
		assertEquals(zat1.kendu(zat5).getZenbakitzailea(),13);
		assertEquals(zat1.kendu(zat5).getIzendatzailea(),18);
		
		//zat2-x
		
		zat2.kendu(zat1);
		assertEquals(zat2.kendu(zat1).getZenbakitzailea(),-13);
		assertEquals(zat2.kendu(zat1).getIzendatzailea(),18);

		zat2.kendu(zat3);
		assertEquals(zat2.kendu(zat3).getZenbakitzailea(),14);
		assertEquals(zat2.kendu(zat3).getIzendatzailea(),9);

		zat2.kendu(zat4);
		assertEquals(zat2.kendu(zat4).getZenbakitzailea(),14);
		assertEquals(zat2.kendu(zat4).getIzendatzailea(),9);
		
		zat2.kendu(zat5);
		assertEquals(zat2.kendu(zat5).getZenbakitzailea(),0);
		assertEquals(zat2.kendu(zat5).getIzendatzailea(),1);
		
		//zat3-x
		
		zat3.kendu(zat1);
		assertEquals(zat3.kendu(zat1).getZenbakitzailea(),-41);
		assertEquals(zat3.kendu(zat1).getIzendatzailea(),18);

		zat3.kendu(zat2);
		assertEquals(zat3.kendu(zat2).getZenbakitzailea(),-14);
		assertEquals(zat3.kendu(zat2).getIzendatzailea(),9);

		zat3.kendu(zat4);
		assertEquals(zat3.kendu(zat4).getZenbakitzailea(),0);
		assertEquals(zat3.kendu(zat4).getIzendatzailea(),1);
		
		zat3.kendu(zat5);
		assertEquals(zat3.kendu(zat5).getZenbakitzailea(),-14);
		assertEquals(zat3.kendu(zat5).getIzendatzailea(),9);
		
		//zat4-x
		
		zat4.kendu(zat1);
		assertEquals(zat4.kendu(zat1).getZenbakitzailea(),-41);
		assertEquals(zat4.kendu(zat1).getIzendatzailea(),18);

		zat4.kendu(zat2);
		assertEquals(zat4.kendu(zat2).getZenbakitzailea(),-14);
		assertEquals(zat4.kendu(zat2).getIzendatzailea(),9);

		zat4.kendu(zat3);
		assertEquals(zat4.kendu(zat3).getZenbakitzailea(),0);
		assertEquals(zat4.kendu(zat3).getIzendatzailea(),1);
		
		zat4.kendu(zat5);
		assertEquals(zat4.kendu(zat5).getZenbakitzailea(),-14);
		assertEquals(zat4.kendu(zat5).getIzendatzailea(),9);
		
		//zat5-x
		
		zat5.kendu(zat1);
		assertEquals(zat5.kendu(zat1).getZenbakitzailea(),-13);
		assertEquals(zat5.kendu(zat1).getIzendatzailea(),18);

		zat5.kendu(zat2);
		assertEquals(zat5.kendu(zat2).getZenbakitzailea(),0);
		assertEquals(zat5.kendu(zat2).getIzendatzailea(),1);

		zat5.kendu(zat3);
		assertEquals(zat5.kendu(zat3).getZenbakitzailea(),14);
		assertEquals(zat5.kendu(zat3).getIzendatzailea(),9);
		
		zat5.kendu(zat4);
		assertEquals(zat5.kendu(zat4).getZenbakitzailea(),14);
		assertEquals(zat5.kendu(zat4).getIzendatzailea(),9);
		
	}

	@Test
	public void testBiderkatu() {
		
		//zat1*x
		
		zat1.biderkatu(zat2);
		assertEquals(zat1.biderkatu(zat2).getZenbakitzailea(),7);
		assertEquals(zat1.biderkatu(zat2).getIzendatzailea(),6);

		zat1.biderkatu(zat3);
		assertEquals(zat1.biderkatu(zat3).getZenbakitzailea(),-7);
		assertEquals(zat1.biderkatu(zat3).getIzendatzailea(),6);

		zat1.biderkatu(zat4);
		assertEquals(zat1.biderkatu(zat4).getZenbakitzailea(),-7);
		assertEquals(zat1.biderkatu(zat4).getIzendatzailea(),6);
		
		zat1.biderkatu(zat5);
		assertEquals(zat1.biderkatu(zat5).getZenbakitzailea(),7);
		assertEquals(zat1.biderkatu(zat5).getIzendatzailea(),6);
		
		//zat2*x
		
		zat2.biderkatu(zat1);
		assertEquals(zat2.biderkatu(zat1).getZenbakitzailea(),7);
		assertEquals(zat2.biderkatu(zat1).getIzendatzailea(),6);

		zat2.biderkatu(zat3);
		assertEquals(zat2.biderkatu(zat3).getZenbakitzailea(),-49);
		assertEquals(zat2.biderkatu(zat3).getIzendatzailea(),81);

		zat2.biderkatu(zat4);
		assertEquals(zat2.biderkatu(zat4).getZenbakitzailea(),-49);
		assertEquals(zat2.biderkatu(zat4).getIzendatzailea(),81);
		
		zat2.biderkatu(zat5);
		assertEquals(zat2.biderkatu(zat5).getZenbakitzailea(),49);
		assertEquals(zat2.biderkatu(zat5).getIzendatzailea(),81);		
		
		//zat3*x
		
		zat3.biderkatu(zat1);
		assertEquals(zat3.biderkatu(zat1).getZenbakitzailea(),-7);
		assertEquals(zat3.biderkatu(zat1).getIzendatzailea(),6);

		zat3.biderkatu(zat2);
		assertEquals(zat3.biderkatu(zat2).getZenbakitzailea(),-49);
		assertEquals(zat3.biderkatu(zat2).getIzendatzailea(),81);

		zat3.biderkatu(zat4);
		assertEquals(zat3.biderkatu(zat4).getZenbakitzailea(),49);
		assertEquals(zat3.biderkatu(zat4).getIzendatzailea(),81);
		
		zat3.biderkatu(zat5);
		assertEquals(zat3.biderkatu(zat5).getZenbakitzailea(),-49);
		assertEquals(zat3.biderkatu(zat5).getIzendatzailea(),81);	
		
		//zat4*x
		
		zat4.biderkatu(zat1);
		assertEquals(zat4.biderkatu(zat1).getZenbakitzailea(),-7);
		assertEquals(zat4.biderkatu(zat1).getIzendatzailea(),6);

		zat4.biderkatu(zat2);
		assertEquals(zat4.biderkatu(zat2).getZenbakitzailea(),-49);
		assertEquals(zat4.biderkatu(zat2).getIzendatzailea(),81);

		zat4.biderkatu(zat3);
		assertEquals(zat4.biderkatu(zat3).getZenbakitzailea(),49);
		assertEquals(zat4.biderkatu(zat3).getIzendatzailea(),81);
		
		zat4.biderkatu(zat5);
		assertEquals(zat4.biderkatu(zat5).getZenbakitzailea(),-49);
		assertEquals(zat4.biderkatu(zat5).getIzendatzailea(),81);	
		
		//zat5*x
		
		zat5.biderkatu(zat1);
		assertEquals(zat5.biderkatu(zat1).getZenbakitzailea(),7);
		assertEquals(zat5.biderkatu(zat1).getIzendatzailea(),6);

		zat5.biderkatu(zat2);
		assertEquals(zat5.biderkatu(zat2).getZenbakitzailea(),49);
		assertEquals(zat5.biderkatu(zat2).getIzendatzailea(),81);

		zat5.biderkatu(zat3);
		assertEquals(zat5.biderkatu(zat3).getZenbakitzailea(),-49);
		assertEquals(zat5.biderkatu(zat3).getIzendatzailea(),81);
		
		zat5.biderkatu(zat4);
		assertEquals(zat5.biderkatu(zat4).getZenbakitzailea(),-49);
		assertEquals(zat5.biderkatu(zat4).getIzendatzailea(),81);	
		
	}

	@Test
	public void testZatitu() {
		zat1.zatitu(zat2);
		assertEquals(zat1.zatitu(zat2).getZenbakitzailea(),27);
		assertEquals(zat1.zatitu(zat2).getIzendatzailea(),14);
		
		
		//zat1/x
		
		zat1.zatitu(zat2);
		assertEquals(zat1.zatitu(zat2).getZenbakitzailea(),27);
		assertEquals(zat1.zatitu(zat2).getIzendatzailea(),14);

		zat1.zatitu(zat3);
		assertEquals(zat1.zatitu(zat3).getZenbakitzailea(),-27);
		assertEquals(zat1.zatitu(zat3).getIzendatzailea(),14);

		zat1.zatitu(zat4);
		assertEquals(zat1.zatitu(zat4).getZenbakitzailea(),-27);
		assertEquals(zat1.zatitu(zat4).getIzendatzailea(),14);
		
		zat1.zatitu(zat5);
		assertEquals(zat1.zatitu(zat5).getZenbakitzailea(),27);
		assertEquals(zat1.zatitu(zat5).getIzendatzailea(),14);
		
		//zat2/x
		
		zat2.zatitu(zat1);
		assertEquals(zat2.zatitu(zat1).getZenbakitzailea(),14);
		assertEquals(zat2.zatitu(zat1).getIzendatzailea(),27);

		zat2.zatitu(zat3);
		assertEquals(zat2.zatitu(zat3).getZenbakitzailea(),-1);
		assertEquals(zat2.zatitu(zat3).getIzendatzailea(),1);

		zat2.zatitu(zat4);
		assertEquals(zat2.zatitu(zat4).getZenbakitzailea(),-1);
		assertEquals(zat2.zatitu(zat4).getIzendatzailea(),1);
		
		zat2.zatitu(zat5);
		assertEquals(zat2.zatitu(zat5).getZenbakitzailea(),1);
		assertEquals(zat2.zatitu(zat5).getIzendatzailea(),1);		
		
		//zat3/x
		
		zat3.zatitu(zat1);
		assertEquals(zat3.zatitu(zat1).getZenbakitzailea(),-14);
		assertEquals(zat3.zatitu(zat1).getIzendatzailea(),27);

		zat3.zatitu(zat2);
		assertEquals(zat3.zatitu(zat2).getZenbakitzailea(),-1);
		assertEquals(zat3.zatitu(zat2).getIzendatzailea(),1);

		zat3.zatitu(zat4);
		assertEquals(zat3.zatitu(zat4).getZenbakitzailea(),1);
		assertEquals(zat3.zatitu(zat4).getIzendatzailea(),1);
		
		zat3.zatitu(zat5);
		assertEquals(zat3.zatitu(zat5).getZenbakitzailea(),-1);
		assertEquals(zat3.zatitu(zat5).getIzendatzailea(),1);	
		
		//zat4/x
		
		zat4.zatitu(zat1);
		assertEquals(zat4.zatitu(zat1).getZenbakitzailea(),-14);
		assertEquals(zat4.zatitu(zat1).getIzendatzailea(),27);

		zat4.zatitu(zat2);
		assertEquals(zat4.zatitu(zat2).getZenbakitzailea(),-1);
		assertEquals(zat4.zatitu(zat2).getIzendatzailea(),1);

		zat4.zatitu(zat3);
		assertEquals(zat4.zatitu(zat3).getZenbakitzailea(),1);
		assertEquals(zat4.zatitu(zat3).getIzendatzailea(),1);
		
		zat4.zatitu(zat5);
		assertEquals(zat4.zatitu(zat5).getZenbakitzailea(),-1);
		assertEquals(zat4.zatitu(zat5).getIzendatzailea(),1);	
		
		//zat5/x
		
		zat5.zatitu(zat1);
		assertEquals(zat5.zatitu(zat1).getZenbakitzailea(),14);
		assertEquals(zat5.zatitu(zat1).getIzendatzailea(),27);

		zat5.zatitu(zat2);
		assertEquals(zat5.zatitu(zat2).getZenbakitzailea(),1);
		assertEquals(zat5.zatitu(zat2).getIzendatzailea(),1);

		zat5.zatitu(zat3);
		assertEquals(zat5.zatitu(zat3).getZenbakitzailea(),-1);
		assertEquals(zat5.zatitu(zat3).getIzendatzailea(),1);
		
		zat5.zatitu(zat4);
		assertEquals(zat5.zatitu(zat4).getZenbakitzailea(),-1);
		assertEquals(zat5.zatitu(zat4).getIzendatzailea(),1);	
		
		
		//zat0/x
		
		zat0.zatitu(zat0);
		assertEquals(zat0.zatitu(zat0).getZenbakitzailea(),0);
		assertEquals(zat0.zatitu(zat0).getIzendatzailea(),0);

		zat0.zatitu(zat2);
		assertEquals(zat0.zatitu(zat2).getZenbakitzailea(),0);
		assertEquals(zat0.zatitu(zat2).getIzendatzailea(),0);

		zat0.zatitu(zat3);
		assertEquals(zat0.zatitu(zat3).getZenbakitzailea(),0);
		assertEquals(zat0.zatitu(zat3).getIzendatzailea(),0);
		
		zat0.zatitu(zat4);
		assertEquals(zat0.zatitu(zat4).getZenbakitzailea(),0);
		assertEquals(zat0.zatitu(zat4).getIzendatzailea(),0);	
		
		zat0.zatitu(zat5);
		assertEquals(zat0.zatitu(zat4).getZenbakitzailea(),0);
		assertEquals(zat0.zatitu(zat4).getIzendatzailea(),0);
		
	}
	
	@Test
	public void testBerdinaDa() {
		assertFalse(zat1.berdinaDa(zat2));
		assertFalse(zat1.berdinaDa(zat3));
		assertFalse(zat1.berdinaDa(zat4));
		assertFalse(zat1.berdinaDa(zat5));
		assertFalse(zat1.berdinaDa(zat0));

		assertFalse(zat2.berdinaDa(zat1));
		assertFalse(zat2.berdinaDa(zat3));
		assertFalse(zat2.berdinaDa(zat4));
		assertTrue(zat2.berdinaDa(zat5));
		assertFalse(zat2.berdinaDa(zat0));
		
		assertFalse(zat3.berdinaDa(zat1));
		assertFalse(zat3.berdinaDa(zat2));
		assertTrue(zat3.berdinaDa(zat4));
		assertFalse(zat3.berdinaDa(zat5));
		assertFalse(zat3.berdinaDa(zat0));	
		
		assertFalse(zat4.berdinaDa(zat1));
		assertFalse(zat4.berdinaDa(zat2));
		assertTrue(zat4.berdinaDa(zat3));
		assertFalse(zat4.berdinaDa(zat5));
		assertFalse(zat4.berdinaDa(zat0));	

		assertFalse(zat5.berdinaDa(zat1));
		assertTrue(zat5.berdinaDa(zat2));
		assertFalse(zat5.berdinaDa(zat3));
		assertFalse(zat5.berdinaDa(zat4));
		assertFalse(zat5.berdinaDa(zat0));
	}
	
	@Test
	public void testHandiagoaDa() {
		assertTrue(zat1.handiagoaDa(zat2));
		assertTrue(zat1.handiagoaDa(zat3));
		assertTrue(zat1.handiagoaDa(zat4));
		assertTrue(zat1.handiagoaDa(zat5));
		assertTrue(zat1.handiagoaDa(zat0));
		
		assertFalse(zat2.handiagoaDa(zat1));
		assertTrue(zat2.handiagoaDa(zat3));
		assertTrue(zat2.handiagoaDa(zat4));
		assertFalse(zat2.handiagoaDa(zat5));
		assertTrue(zat2.handiagoaDa(zat0));
		
		assertFalse(zat3.handiagoaDa(zat1));
		assertFalse(zat3.handiagoaDa(zat2));
		assertFalse(zat3.handiagoaDa(zat4));
		assertFalse(zat3.handiagoaDa(zat5));
		assertFalse(zat3.handiagoaDa(zat0));
		
		assertFalse(zat4.handiagoaDa(zat1));
		assertFalse(zat4.handiagoaDa(zat2));
		assertFalse(zat4.handiagoaDa(zat3));
		assertFalse(zat4.handiagoaDa(zat5));
		assertFalse(zat4.handiagoaDa(zat0));
		
		assertFalse(zat5.handiagoaDa(zat1));		
		assertFalse(zat5.handiagoaDa(zat2));
		assertTrue(zat5.handiagoaDa(zat3));
		assertTrue(zat5.handiagoaDa(zat4));
		assertTrue(zat5.handiagoaDa(zat0));
		
	}
	
	@Test
	public void testTxikagoaDa() {
		assertFalse(zat1.txikiagoaDa(zat2));
		assertTrue(zat3.txikiagoaDa(zat2));
		
		assertFalse(zat1.txikiagoaDa(zat2));
		assertFalse(zat1.txikiagoaDa(zat3));
		assertFalse(zat1.txikiagoaDa(zat4));
		assertFalse(zat1.txikiagoaDa(zat5));
		assertFalse(zat1.txikiagoaDa(zat0));
		
		assertTrue(zat2.txikiagoaDa(zat1));
		assertFalse(zat2.txikiagoaDa(zat3));
		assertFalse(zat2.txikiagoaDa(zat4));
		assertFalse(zat2.txikiagoaDa(zat5));
		assertFalse(zat2.txikiagoaDa(zat0));
		
		assertTrue(zat3.txikiagoaDa(zat1));
		assertTrue(zat3.txikiagoaDa(zat2));
		assertFalse(zat3.txikiagoaDa(zat4));
		assertTrue(zat3.txikiagoaDa(zat5));
		assertTrue(zat3.txikiagoaDa(zat0));
		
		assertTrue(zat4.txikiagoaDa(zat1));
		assertTrue(zat4.txikiagoaDa(zat2));
		assertFalse(zat4.txikiagoaDa(zat3));
		assertTrue(zat4.txikiagoaDa(zat5));
		assertTrue(zat4.txikiagoaDa(zat0));
		
		assertTrue(zat5.txikiagoaDa(zat1));		
		assertFalse(zat5.txikiagoaDa(zat2));
		assertFalse(zat5.txikiagoaDa(zat3));
		assertFalse(zat5.txikiagoaDa(zat4));
		assertFalse(zat5.txikiagoaDa(zat0));
	}

	@Test
	public void testIzendatzaileBerdinaDu() {
		assertFalse(zat1.izendatzaileBerdinaDu(zat2));
		assertFalse(zat1.izendatzaileBerdinaDu(zat3));
		assertFalse(zat1.izendatzaileBerdinaDu(zat4));
		assertFalse(zat1.izendatzaileBerdinaDu(zat5));
		assertFalse(zat1.izendatzaileBerdinaDu(zat0));
		
		assertFalse(zat2.izendatzaileBerdinaDu(zat1));
		assertTrue(zat2.izendatzaileBerdinaDu(zat3));
		assertFalse(zat2.izendatzaileBerdinaDu(zat4));
		assertFalse(zat2.izendatzaileBerdinaDu(zat5));
		assertFalse(zat2.izendatzaileBerdinaDu(zat0));
		
		assertTrue(zat3.izendatzaileBerdinaDu(zat2));
		assertFalse(zat3.izendatzaileBerdinaDu(zat1));
		assertFalse(zat3.izendatzaileBerdinaDu(zat4));
		assertFalse(zat3.izendatzaileBerdinaDu(zat5));
		assertFalse(zat3.izendatzaileBerdinaDu(zat0));
		
		assertFalse(zat4.izendatzaileBerdinaDu(zat2));
		assertFalse(zat4.izendatzaileBerdinaDu(zat3));
		assertFalse(zat4.izendatzaileBerdinaDu(zat1));
		assertFalse(zat4.izendatzaileBerdinaDu(zat5));
		assertFalse(zat4.izendatzaileBerdinaDu(zat0));
		
		assertFalse(zat5.izendatzaileBerdinaDu(zat2));
		assertFalse(zat5.izendatzaileBerdinaDu(zat3));
		assertFalse(zat5.izendatzaileBerdinaDu(zat4));
		assertFalse(zat5.izendatzaileBerdinaDu(zat1));
		assertFalse(zat5.izendatzaileBerdinaDu(zat0));
	}

	@Test
	public void testZenbakitzaileBerdinaDu() {
		assertTrue(zat2.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat1));
		
		assertFalse(zat1.zenbakitzaileBerdinaDu(zat2));
		assertFalse(zat1.zenbakitzaileBerdinaDu(zat3));
		assertFalse(zat1.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat1.zenbakitzaileBerdinaDu(zat5));
		assertFalse(zat1.zenbakitzaileBerdinaDu(zat0));
		
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat1));
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat3));
		assertTrue(zat2.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat5));
		assertFalse(zat2.zenbakitzaileBerdinaDu(zat0));
		
		assertFalse(zat3.zenbakitzaileBerdinaDu(zat2));
		assertFalse(zat3.zenbakitzaileBerdinaDu(zat1));
		assertFalse(zat3.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat3.zenbakitzaileBerdinaDu(zat5));
		assertFalse(zat3.zenbakitzaileBerdinaDu(zat0));
		
		assertTrue(zat4.zenbakitzaileBerdinaDu(zat2));
		assertFalse(zat4.zenbakitzaileBerdinaDu(zat3));
		assertFalse(zat4.zenbakitzaileBerdinaDu(zat1));
		assertFalse(zat4.zenbakitzaileBerdinaDu(zat5));
		assertFalse(zat4.zenbakitzaileBerdinaDu(zat0));
		
		assertFalse(zat5.zenbakitzaileBerdinaDu(zat2));
		assertFalse(zat5.zenbakitzaileBerdinaDu(zat3));
		assertFalse(zat5.zenbakitzaileBerdinaDu(zat4));
		assertFalse(zat5.zenbakitzaileBerdinaDu(zat1));
		assertFalse(zat5.zenbakitzaileBerdinaDu(zat0));
	}

}
