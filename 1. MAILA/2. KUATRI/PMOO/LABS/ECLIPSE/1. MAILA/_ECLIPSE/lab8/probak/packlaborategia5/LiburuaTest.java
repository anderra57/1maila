package packlaborategia5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import packlaborategia5.Liburua;

public class LiburuaTest {
	
	Liburua l1,l2,l3;

	@Before
	public void setUp() throws Exception {
		//String pTitulua, String pIdazlea, int pIdLiburua
		l1 = new Liburua("Memorias del BB", "Ander Prieto", 5755);
		l2 = new Liburua("koparenBila", "Ander Prieto", 5755);
		l3 = new Liburua("Monzon Difsfraz", "Martin Amezola", 56767);
	}

	@After
	public void tearDown() throws Exception {
		l1=null;
		l2=null;
		l3=null;
	}

	@Test
	public void testLiburua() {
		assertNotNull(l1);
		assertNotNull(l2);
		assertNotNull(l3);
	}

	@Test
	public void testIdHauDu() {
		assertTrue(l1.idHauDu(5755));
		assertFalse(l1.idHauDu(4664));
	}

	@Test
	public void testIdBerdinaDute() {
		assertTrue(l1.idBerdinaDute(l2));
		assertFalse(l1.idBerdinaDute(l3));
	}

	@Test
	public void testInprimatu() {
		l1.inprimatu();
		l2.inprimatu();
		l3.inprimatu();
	}

}
