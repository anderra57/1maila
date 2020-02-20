package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaloiaTest {
	ListaAkzioa l;

	@Before
	public void setUp() throws Exception {
		Saloia.getNireSaloia().eszenatokiaHasieratu();
		Protagonista.hasieratuProtagonista("Protagonista proba");
		l=new ListaAkzioa();
		l.listaAkzioakSortu(2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNireSaloia() {
		assertNotNull(Saloia.getNireSaloia());
	}

	@Test
	public void testMatrizekoBalioa() {
		assertEquals(Saloia.getNireSaloia().matrizekoBalioa(10,10), ' ');
		assertEquals(Saloia.getNireSaloia().matrizekoBalioa(1,1), '+');
		assertEquals(Saloia.getNireSaloia().matrizekoBalioa(7,8), ' ');
		assertEquals(Saloia.getNireSaloia().matrizekoBalioa(4,9), ' ');
		assertEquals(Saloia.getNireSaloia().matrizekoBalioa(8,14), ' ');
	}


	@Test
	public void testIsNullOrEmpty() {
		assertTrue(Saloia.getNireSaloia().isNullOrEmpty(""));
		assertFalse(Saloia.getNireSaloia().isNullOrEmpty("Kaixo"));
	}

}
