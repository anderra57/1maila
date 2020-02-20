package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaAkzioaTest {
	ListaAkzioa ls,lh,lb,ls1,lh1,lb1,ls2,lh2,lb2;
	Akzioa a;

	@Before
	public void setUp() throws Exception {
		ls=new ListaAkzioa();
		ls1=new ListaAkzioa();
		lh=new ListaAkzioa();
		lh1=new ListaAkzioa();
		lb=new ListaAkzioa();
		lb1=new ListaAkzioa();
		ls2=new ListaAkzioa();
		lh2=new ListaAkzioa();
		lb2=new ListaAkzioa();
		ls1=ls.listaAkzioakSortu(1);
		lh1=lh.listaAkzioakSortu(2);
		lb1=lb.listaAkzioakSortu(3);
	}

	@After
	public void tearDown() throws Exception {
		ls1.clear();
		lh1.clear();
		lb1.clear();
	}

	@Test
	public void testGetEliza() {
		
		assertFalse(lh1.getEliza());
		lh1.setElizaT();
		assertTrue(lh1.getEliza());
	
	}

	@Test
	public void testListaAkzioakSortu() {
		assertTrue(ls2.hutsa());
		ls2=ls.listaAkzioakSortu(1);
		assertFalse(ls1.hutsa());
		
		assertTrue(lh2.hutsa());
		lh2=lh.listaAkzioakSortu(2);
		assertFalse(lh2.hutsa());
		
		assertTrue(lb2.hutsa());
		lb2=lb.listaAkzioakSortu(3);
		assertFalse(lb2.hutsa());
		
	}

}
