package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import packlaborategia5.Liburua;
import packlaborategia5.ListaLiburuak;

public class ListaLiburuakTest {
	ListaLiburuak l1,l2;
	Liburua lib1,lib2,lib3,lib4,lib5;
	@Before
	public void setUp() throws Exception {
		l1= new ListaLiburuak();
		l2= new ListaLiburuak();
		lib1=new Liburua("Harry Potter","J.K. Rowling",4754);
		lib2=new Liburua("La Casa de Bernarda Alba", "Fco Garcia", 4755);
		lib3=new Liburua("Liga Oro","BB",5755);
	}

	@After
	public void tearDown() throws Exception {
		l1=null;
		lib1=null;
		lib2=null;
		lib3=null;
		l2=null;
	}

	@Test
	public void testListaLiburuak() {
		assertNotNull(l1);
		assertNotNull(l2);
		assertNotNull(lib1);
		assertNotNull(lib2);
		assertNotNull(lib3);
		
	}

	@Test
	public void testListarenTamaina() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l2.listarenTamaina(), 0);
		assertEquals(l1.listarenTamaina(), 3);
		
	}

	@Test
	public void testBilatuLiburuaIdz() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l1.listarenTamaina(), 3);
		assertEquals(l1.bilatuLiburuaIdz(5755).getId(),5755);
		
	}

	@Test
	public void testBadago() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l1.listarenTamaina(), 3);
		assertTrue(l1.badago(lib1));
		assertFalse(l1.badago(lib4));
		
	}

	@Test
	public void testIdBerdinekoLibururikBaAlDa() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l1.listarenTamaina(), 3);
		assertTrue(l1.badago(lib1));
		assertFalse(l1.badago(lib5));
		
	}

	@Test
	public void testGehituLiburua() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l1.listarenTamaina(), 3);
		lib4= new Liburua("El Faro del Silencio","Reviver",57);
		l1.gehituLiburua(lib4);
		assertEquals(l1.listarenTamaina(), 4);
	}

	@Test
	public void testKenduLiburua() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		assertEquals(l1.listarenTamaina(), 3);
		l1.kenduLiburua(lib2);
		assertEquals(l1.listarenTamaina(), 2);
	}

	@Test
	public void testInprimatu() {
		l1.gehituLiburua(lib1);
		l1.gehituLiburua(lib2);
		l1.gehituLiburua(lib3);
		l2.gehituLiburua(lib1);
		assertEquals(l1.listarenTamaina(), 3);
		assertEquals(l2.listarenTamaina(), 1);
		l1.inprimatu();
		l2.inprimatu();
	}

}
