package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DadoaTest {
	Dadoa d=new Dadoa(6);

	@Before
	public void setUp() throws Exception {
		//Dadoa d=new Dadoa(6);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDadoa() {
		assertNotNull(d);
	}

	@Test
	public void testBota() {
		d.bota();
		assertTrue(d.getGoikoAldea()<=6);
		assertTrue(d.getGoikoAldea()>=0); 
	}

}
