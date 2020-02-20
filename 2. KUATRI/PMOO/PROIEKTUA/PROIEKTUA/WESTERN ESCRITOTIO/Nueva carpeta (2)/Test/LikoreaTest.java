package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LikoreaTest {

	@Before
	public void setUp() throws Exception {
		Protagonista.hasieratuProtagonista("Proba");
		Inbentarioa.getNireInbentarioa().inbentarioaSortu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testObjektuaErabili() {
		Protagonista.getNireProtagonista().objetuaErabili("Likorea");
		assertEquals(Protagonista.getNireProtagonista().getPv(),350);
	}
}
