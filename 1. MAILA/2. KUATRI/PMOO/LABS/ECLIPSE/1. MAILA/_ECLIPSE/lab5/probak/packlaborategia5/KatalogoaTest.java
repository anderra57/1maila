package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KatalogoaTest {
	
	Katalogoa k1=Katalogoa.getKatalogoa();
	ListaErabiltzaileak l1=ListaErabiltzaileak.getListaErabiltzaileak();
	Liburua lib1,lib2,lib3,lib4;
	Erabiltzailea e1;
	
	
	@Before
	public void setUp() throws Exception {
		lib1=new Liburua("Harry Potter","J.K. Rowling",4754);
		lib2=new Liburua("La Casa de Bernarda Alba", "Fco Garcia", 2756);
		lib3=new Liburua("Liga Oro","BB",5755);
		e1=new Erabiltzailea("Adei Arias", 12);
		e1.gehituLiburua(lib1);
		e1.gehituLiburua(lib2);
	}

	@After
	public void tearDown() throws Exception {
		l1=null;
		lib1=null;
		lib2=null;
		lib3=null;
		e1=null;
	}

	@Test
	public void testLiburuKopuru() {
		k1.erreseteatu();
		assertEquals(k1.liburuKopuru(),0);
		k1.katalogatuLiburua(lib1);
		k1.katalogatuLiburua(lib2);
		assertEquals(k1.liburuKopuru(),2);
		k1.katalogatuLiburua(lib3);
		assertEquals(k1.liburuKopuru(),3);
	}

	@Test
	public void testBilatuLiburuaIdz() {
		k1.katalogatuLiburua(lib1);
		assertEquals(k1.bilatuLiburuaIdz(4754).getId(),4754);
	}

	@Test
	public void testMailegatuLiburua() {
		assertTrue(e1.maileguanDu(lib1));
		assertFalse(e1.maileguanDu(lib3));
		
	}
	
	@Test
	public void testItzuliLiburua() {
		k1.katalogatuLiburua(lib1);
		k1.itzuliLiburua(4754);
	}
	@Test
	public void testKatalogatuLiburua() {
		l1.erabiltzaileariAltaEman(e1);
		k1.katalogatuLiburua(lib3);
		l1.inprimatu();
	}

	@Test
	public void testDeskatalogatuLiburua() {
		k1.katalogatuLiburua(lib1);
		k1.deskatalogatuLiburua(4754);
		l1.inprimatu();
	}

	@Test
	public void testInprimatu() {
		k1.inprimatu();
	}

	@Test
	public void testErreseteatu() {
		k1.erreseteatu();
	}

}
