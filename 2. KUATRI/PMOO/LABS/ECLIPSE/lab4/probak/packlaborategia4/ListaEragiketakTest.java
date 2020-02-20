package packlaborategia4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaEragiketakTest {

	ListaEragiketak lista1= ListaEragiketak.getListaEragiketak();
	
	Eragiketa e1;
	Bezeroa b1;
	
	@Before
	public void setUp() throws Exception {
		b1=new Bezeroa(1, "Cepeda CalBo", "cepedacalvo", 54180.00, true);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEragiketaKopurua() {
		assertEquals(lista1.eragiketaKopurua(),0);
		lista1.gehituEragiketa(1, 1, "cepedacalvo", 10.00);
		assertEquals(lista1.eragiketaKopurua(),1);
	}

	@Test
	public void testGehituEragiketa() {
		assertEquals(lista1.eragiketaKopurua(),0);
		lista1.gehituEragiketa(1, 1, "cepedacalvo", 10.00);
		assertEquals(lista1.eragiketaKopurua(),1);
	}

	@Test
	public void testErreseteatu() {
		lista1.erreseteatu();
		assertEquals(lista1.eragiketaKopurua(),0);
	}

	@Test
	public void testEragiketaGuztiakBurutu() {
	}

	@Test
	public void testBilatuEragiketaIdz() {
		
	
	}

}
