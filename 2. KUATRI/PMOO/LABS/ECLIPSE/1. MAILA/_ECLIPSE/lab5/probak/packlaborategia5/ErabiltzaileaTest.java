
package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ErabiltzaileaTest {
	Erabiltzailea e1,e2,e3;
	ListaLiburuak l1,l2;
	Liburua lib1,lib2,lib3,lib4,lib5;

	@Before
	public void setUp() throws Exception {
		e1= new Erabiltzailea("Adei Arias",5);
		e2= new Erabiltzailea("Ander Prieto",5);
		e3= new Erabiltzailea("Marije Albeniz",7);
		l1= new ListaLiburuak();
		l2=new ListaLiburuak();
		lib1=new Liburua("Harry Potter","J.K. Rowling",4754);
		e1.gehituLiburua(lib1);
		lib2=new Liburua("La Casa de Bernarda Alba", "Fco Garcia", 4755);
		e1.gehituLiburua(lib2);
		lib3=new Liburua("Liga Oro","BB",5755);
		e1.gehituLiburua(lib3);
		lib4=new Liburua("Liga Plata","BBB",5767);
		e1.gehituLiburua(lib4);
		lib5=new Liburua("IT","Stephen King",2344);
		e2.gehituLiburua(lib4);
		
	}

	@After
	public void tearDown() throws Exception {
		e1=null;
		e2=null;
		l1=null;
		lib1=null;
		lib2=null;
		lib3=null;
		lib4=null;
		lib5=null;
		l2=null;
	}

	@Test
	public void testErabiltzailea() {
		assertNotNull(e1);
		assertNotNull(e2);
		assertNotNull(e3);
		assertNotNull(l1);
		assertNotNull(lib1);
		assertNotNull(lib2);
		assertNotNull(lib3);
		assertNotNull(lib4);
		assertNotNull(lib5);
		
		assertNotNull(l2);
	}

	@Test
	public void testIdHauDu() {
		assertTrue(e1.idHauDu(5));
		assertFalse(e1.idHauDu(4));
	}

	@Test
	public void testIdBerdinaDute() {
		assertTrue(e1.idBerdinaDute(e2));
		assertFalse(e1.idBerdinaDute(e3));
	}

	@Test
	public void testMailegatzekoMaximoaGainditua() {
		assertTrue(e1.mailegatzekoMaximoaGainditua());
		assertFalse(e2.mailegatzekoMaximoaGainditua());
		
	}

	@Test
	public void testGehituLiburua() {
		assertEquals(l2.listarenTamaina(),0);
		l2.gehituLiburua(lib1);
		assertEquals(l2.listarenTamaina(), 1);
	}

	@Test
	public void testKenduLiburua() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		assertEquals(l1.listarenTamaina(),2);
		l1.kenduLiburua(lib1);
		assertEquals(l1.listarenTamaina(),1);
	}

	@Test
	public void testMaileguanDu() {
		assertTrue(e1.maileguanDu(lib1));
		assertFalse(e1.maileguanDu(lib5));
		
	}

	@Test
	public void testInprimatu() {
		e1.inprimatu();
		
	}

}
