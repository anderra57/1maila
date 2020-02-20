package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaEtsaiakTest {
	ListaEtsaiak l1;
	Etsaia e1,e2;

	@Before
	public void setUp() throws Exception {
		l1=new ListaEtsaiak();
		l1.etsaiakSortu();
		e1=new Etsaia("Etsaia",15,16);
		l1.etsaiaGehitu(e1);
		e2=new Etsaia("Etsaia2",16,19);
		Protagonista.hasieratuProtagonista("Protagonista_Proba");
	}

	@After
	public void tearDown() throws Exception {
		l1.erreseteatu();
	}
	
	@Test
	public void testListaEtsaiak() {
		assertNotNull(l1);
	}


	@Test
	public void testLuzera() {
		assertEquals(l1.luzera(),8);
	}

	@Test
	public void testEtsaiaGehitu() {
		l1.etsaiaGehitu(e2);
		assertEquals(l1.luzera(),9);
	}

	@Test
	public void testEraso() {
		l1.eraso();
		assertTrue(Protagonista.getNireProtagonista().getPv()<=250);
	}

	@Test
	public void testEtsaiaBilatuIzenez() {
		try{
		assertEquals(e1, l1.etsaiaBilatuIzenez("Etsaia"));
		l1.etsaiaGehitu(e2);
		assertEquals(e2,l1.etsaiaBilatuIzenez("Etsaia2"));
		}
		catch(BalioEzEgokia e){
			System.out.println("Ez da aurkitu etsaia hori");
		}
	}


	@Test
	public void testReturnPosizioan() throws NotZenbakiEgokia { 
		assertEquals(l1.returnPosizioan(8),e1);
	}

	@Test
	public void testBadago() throws BalioEzEgokia {
		assertTrue(l1.badago(e1));
		l1.etsaiaGehitu(e2);
		assertTrue(l1.badago(e2));
	}

	@Test
	public void testEtsaiaHildaBadagoKendu() {
		e1.setBizitza(0);
		l1.etsaiaHildaBadagoKendu();
		assertEquals(l1.luzera(),8);
	}

	@Test
	public void testEtsaiakHilBETATESTER() {
		l1.etsaiakHilBETATESTER();
		assertTrue(l1.etsaiaGuztiakHilda());
	}

	@Test
	public void testEtsaiaGuztiakHilda() {
		l1.etsaiakHilBETATESTER();
		l1.etsaiaHildaBadagoKendu();
		assertTrue(l1.etsaiaGuztiakHilda());
	}

	@Test
	public void testEtsaiakSortu() {
		assertNotNull(l1); 
	}
}
