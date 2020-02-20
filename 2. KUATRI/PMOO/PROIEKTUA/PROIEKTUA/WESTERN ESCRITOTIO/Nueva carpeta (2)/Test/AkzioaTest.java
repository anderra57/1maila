package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AkzioaTest {
	Akzioa a1,a2,a3;
	ListaEtsaiak ListEts,ListaEts2=new ListaEtsaiak();
	Mugitu m;
	Etsaia e1,e2,e3;

	@Before
	public void setUp() throws Exception {
		a1=new Akzioa("1.Akzioa",1);
		a2=new Akzioa("2.Akzioa",2);
		a3=new Akzioa("3.Akzioa",3);
		e1=new Etsaia("Etsaia1",10,15);
		e2=new Etsaia("Etsaia1",18,10);
		e3=new Etsaia("Etsaia1",14,15);
		Banketxea.getNireBanketxea().eszenatokiaHasieratu();
		ListEts=new ListaEtsaiak();
		ListaEts2=new ListaEtsaiak();
		ListEts.etsaiaGehitu(e1);
		ListEts.etsaiaGehitu(e2);
		ListEts.etsaiaGehitu(e3);
		Protagonista.hasieratuProtagonista("Proba");
		Protagonista.getNireProtagonista().hasierakoPosizioa(3);
	}

	@After
	public void tearDown() throws Exception {
		ListEts.erreseteatu();
	}

	@Test
	public void testAkzioa() {
		assertNotNull(a1);
		assertNotNull(a2);
		assertNotNull(a3);
	}

	@Test
	public void testKutxa() {
		
		assertFalse(a1.getKutxa());
		assertFalse(a2.getKutxa());
		assertFalse(a3.getKutxa());
		
		assertTrue(a1.kutxa());
		assertTrue(a2.kutxa());
		assertTrue(a3.kutxa());
	}

	@Test
	public void testBerdinakDira() {
		//ezin da egin (Memorian azalduta)
	}
}
