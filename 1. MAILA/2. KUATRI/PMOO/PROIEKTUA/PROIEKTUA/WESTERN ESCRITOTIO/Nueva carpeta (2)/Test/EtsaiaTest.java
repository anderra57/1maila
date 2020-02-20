package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EtsaiaTest {
	Etsaia e1,e2,e3;
	
	@Before
	public void setUp() throws Exception {
		e1=new Etsaia("Lehenengo Etsaia",10,10);
		e2=new Etsaia("Bigarren Etsaia",11,11);
		e3=new Etsaia("Hirugarren Etsaia",12,12);
		Protagonista.hasieratuProtagonista("Protagonista proba");
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testEtsaia() {
		assertNotNull(e1);
		assertNotNull(e2);
		assertNotNull(e3);
	}
	
	@Test
	public void testEraso() {
		
		e1.eraso();
		if(Protagonista.getNireProtagonista().estalita()){
			assertEquals(Protagonista.getNireProtagonista().getPv(),250);
		}
		else {
			assertTrue(Protagonista.getNireProtagonista().getPv()<=240);
		}
	}
	
	@Test
	public void testHilda() {
		
		assertFalse(e1.hilda());
		e1.setBizitza(0);
		assertTrue(e1.hilda());
		
		assertFalse(e2.hilda());
		e2.setBizitza(0);
		assertTrue(e2.hilda());
		
		assertFalse(e3.hilda());
		e3.setBizitza(0);
		assertTrue(e3.hilda());
	}
}
