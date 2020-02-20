package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HilerriaTest {
	ListaAkzioa l;

	@Before
	public void setUp() throws Exception {
		Hilerria.getNireHilerria().eszenatokiaHasieratu();
		Protagonista.hasieratuProtagonista("Protagonista proba");
		l=new ListaAkzioa();
		l.listaAkzioakSortu(2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNireHilerria() {
		assertNotNull(Hilerria.getNireHilerria());
	}

	@Test 
	public void testMatrizekoBalioa() {
		assertEquals(Hilerria.getNireHilerria().matrizekoBalioa(10,10), '|');
		assertEquals(Hilerria.getNireHilerria().matrizekoBalioa(1,1), '+');
	}

}
