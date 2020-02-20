package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InbentarioaTest {
	Inbentarioa inb;
	Objetua oP,oK,oL;
	Protagonista p;

	@Before
	public void setUp() throws Exception {
		Inbentarioa.getNireInbentarioa();
		Protagonista.hasieratuProtagonista("Protagonista proba");
		Inbentarioa.getNireInbentarioa().inbentarioaSortu();
	}

	@After
	public void tearDown() throws Exception{
	}

	@Test
	public void testGetNireInbentarioa(){
		assertNotNull(Inbentarioa.getNireInbentarioa());
	}

	@Test
	public void testInbentarioaSortu() {
		assertNotNull(Inbentarioa.getNireInbentarioa().inbentarioaSortu());
	}

	@Test
	public void testObjetuaErabili() {
		//Pitia erabiltzen du
		Inbentarioa.getNireInbentarioa().objetuaErabili("Pitia");
		assertEquals(Protagonista.getNireProtagonista().getPv(),250,5);
		
		//Likorea erabiltzen badu
		Inbentarioa.getNireInbentarioa().objetuaErabili("Likorea");
		assertEquals(Protagonista.getNireProtagonista().getPv(),350,5);
		
		//Kapela erabiltzen badu
		Inbentarioa.getNireInbentarioa().objetuaErabili("Kapela");
		assertEquals(Protagonista.getNireProtagonista().getPv(),350,5);
	}

}
