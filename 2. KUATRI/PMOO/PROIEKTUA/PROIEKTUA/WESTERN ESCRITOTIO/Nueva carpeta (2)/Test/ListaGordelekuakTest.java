package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaGordelekuakTest {
	ListaGordelekuak l;

	@Before
	public void setUp() throws Exception {
		l=ListaGordelekuak.getNireListaGordelekuak();
		l.gordelekuakSortu();
	}

	@After
	public void tearDown() throws Exception {
		l.erreseteatu();
	}

	@Test
	public void testGetNireListaGordelekuak() {
		assertNotNull(l);
	}

	@Test
	public void testOkupatutaDago() {
		assertFalse(l.okupatutaDago(4,4));
		assertTrue(l.okupatutaDago(5,5));
		assertTrue(l.okupatutaDago(5,6));
		assertTrue(l.okupatutaDago(6,5));
		assertTrue(l.okupatutaDago(6,6));
		assertTrue(l.okupatutaDago(15,15));
		assertTrue(l.okupatutaDago(15,16));
		assertTrue(l.okupatutaDago(16,15));
		assertTrue(l.okupatutaDago(16,16));
	}


	@Test
	public void testGordelekuakSortu() {
		l.erreseteatu();
		assertEquals(l.luzera(),0);
		l.gordelekuakSortu();
		assertEquals(l.luzera(),8);
		
	}

}
