package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KapelaTest {

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
		Protagonista.getNireProtagonista().objetuaErabili("Kapela");
		assertEquals(Protagonista.getNireProtagonista().getPv(),250); //Da el mismo error que In
	}

}
