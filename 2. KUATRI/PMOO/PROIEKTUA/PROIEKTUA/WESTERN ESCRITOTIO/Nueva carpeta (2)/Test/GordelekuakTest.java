package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GordelekuakTest {
	Gordelekua g1,g2,g3,g4;

	@Before
	public void setUp() throws Exception {
		g1=new Gordelekua(0,0);
		g2=new Gordelekua(0,1);
		g3=new Gordelekua(1,0);
		g4=new Gordelekua(1,1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGordelekua() {
		assertNotNull(g1);
		assertNotNull(g2);
		assertNotNull(g3);
		assertNotNull(g4);
	}

	@Test
	public void testGetX() {
		assertEquals(g1.getX(),0);
		assertEquals(g2.getX(),0);
		assertEquals(g3.getX(),1);
		assertEquals(g4.getX(),1);
	}

	@Test
	public void testGetY() {
		assertEquals(g1.getY(),0);
		assertEquals(g2.getY(),1);
		assertEquals(g3.getY(),0);
		assertEquals(g4.getY(),1);
	}

}
