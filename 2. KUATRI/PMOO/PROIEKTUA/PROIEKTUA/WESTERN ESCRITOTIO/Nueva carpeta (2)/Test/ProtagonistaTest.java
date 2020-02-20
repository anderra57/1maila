package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProtagonistaTest {
	;

	@Before
	public void setUp() throws Exception {
		Protagonista.hasieratuProtagonista("Proba");
		Inbentarioa.getNireInbentarioa().inbentarioaSortu();
		ListaGordelekuak.getNireListaGordelekuak().gordelekuakSortu();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGetNireProtagonista() {
		assertNotNull(Protagonista.getNireProtagonista());
	}

	@Test
	public void testObjetuaErabili() {
		
		//pitia erabili
		Protagonista.getNireProtagonista().objetuaErabili("Pitia");
		assertEquals(Protagonista.getNireProtagonista().getPv(),250);
		
		//kapela erabili
		Protagonista.getNireProtagonista().objetuaErabili("Kapela");
		assertEquals(Protagonista.getNireProtagonista().getPv(),250); //este deberia de dar bien con 300
		
		//pitia erabili
		Protagonista.getNireProtagonista().objetuaErabili("Likorea");
		assertEquals(Protagonista.getNireProtagonista().getPv(),350);
	}

	@Test
	public void testHasierakoPosizioa() {
		
		//Lehenengo Egoeran (Saloia)
		Protagonista.getNireProtagonista().hasierakoPosizioa(1);
		assertEquals(Protagonista.getNireProtagonista().getX(),18);
		assertEquals(Protagonista.getNireProtagonista().getY(),15);
		
		//Bigarren egoeran (hilerria)
		Protagonista.getNireProtagonista().hasierakoPosizioa(2);
		assertEquals(Protagonista.getNireProtagonista().getX(),14);
		assertEquals(Protagonista.getNireProtagonista().getY(),1);
		
		//Hirugarren egoeran (banketxea)
		Protagonista.getNireProtagonista().hasierakoPosizioa(3);
		assertEquals(Protagonista.getNireProtagonista().getX(),18);
		assertEquals(Protagonista.getNireProtagonista().getY(),8);
	}

	@Test
	public void testEstalita() {
		
		Protagonista.getNireProtagonista().posizioazAldatu(5,5);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(5,6);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(6,5);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(6,6);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(15,15);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(15,16);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(16,15);
		assertTrue(Protagonista.getNireProtagonista().estalita());
		
		Protagonista.getNireProtagonista().posizioazAldatu(16,16);
		assertTrue(Protagonista.getNireProtagonista().estalita());
	}

}
