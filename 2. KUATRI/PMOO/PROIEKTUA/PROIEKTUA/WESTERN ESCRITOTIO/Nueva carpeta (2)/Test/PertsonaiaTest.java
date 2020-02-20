package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PertsonaiaTest {
	Pertsonaia p1,p2,p3;

	@Before
	public void setUp() throws Exception {
		p1=new Pertsonaia("Pertsonaia1");
		p2=new Pertsonaia("Pertsonaia2");
		p3=new Pertsonaia("Pertsonaia3");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPertsonaia() {
		assertNotNull(p1);
		assertNotNull(p2);
		assertNotNull(p3);
	}
}
