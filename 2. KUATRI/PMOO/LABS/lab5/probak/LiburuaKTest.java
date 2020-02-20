package packlabo5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LiburuaKTest {
	
	Liburua l1,l2,l3;

	@Before
	public void setUp() throws Exception {
		//String pTitulua, String pIdazlea, int pIdLiburua
		l1 = new Liburua("Memorias del BB", "Ander Prieto", 5755);
		l2 = new Liburua("#koparenBila", "Ander Prieto", 5657);
		l3 = new Liburua("Monzón Difsfraz", "Martin Amezola", 56767);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLiburua() {
		fail("Not yet implemented");
	}

	@Test
	public void testIdHauDu() {
		fail("Not yet implemented");
	}

	@Test
	public void testIdBerdinaDute() {
		fail("Not yet implemented");
	}

	@Test
	public void testInprimatu() {
		l1.inprimatu();
		l2.inprimatu();
		l3.inprimatu();
	}

}
