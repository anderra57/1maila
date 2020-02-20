package packlaborategia7;



import junit.framework.TestCase;
import packlaborategia7.KurtsoDantza;
import packlaborategia7.ListaBikoteak;
import packlaborategia7.ListaIkasleakKurtso;
import packlaborategia7.Mutila;
import packlaborategia7.Neska;

public class KurtsoDantzaTest extends TestCase{
	
	private Mutila h1, h2, h3, h4;
	private Neska m1, m2, m3, m4;
	ListaIkasleakKurtso l1 = ListaIkasleakKurtso.getListaIkasleakKurtso();
	
	public void setUp()
	{
		// anadir 8 alumnos
		
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("11","Izena1", "Abizena1", 22, 'm');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("22", "Izena2", "Abizena2", 22, 'n');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("33","Izena3", "Abizena3", 32, 'm');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("44", "Izena4", "Abizena4", 32, 'N');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("55","Izena5", "Abizena5", 42, 'm');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("66", "Izena6", "Abizena6", 42, 'n');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("77","Izena7", "Abizena7", 52, 'M');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("88", "Izena8", "Abizena8", 52, 'n');
		h1 = (Mutila)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11");
		m1 = (Neska)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22");
		h2 = (Mutila)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("33");
		m2 = (Neska)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("44");
		h3 = (Mutila)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("55");
		m3 = (Neska)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("66");
		h4 = (Mutila)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("77");
		m4 = (Neska)l1.getListaIkasleakKurtso().bilatuIkasleaNANez("88");
	}

	public void tearDown()
	{
		KurtsoDantza.getKurtsoDantza().hasieratuKurtsoa();
	}

	public void testGetKurtsoDantza()
	{
		assertNotNull(KurtsoDantza.getKurtsoDantza());
	}

	public void testGehituIkaslea()
	{
		
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("33"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("44"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("55"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("66"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("77"));
		assertNotNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("88"));

		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("12"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("21"));
		
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11").getIzena(), "Izena1");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22").getIzena(), "Izena2");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("33").getIzena(), "Izena3");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("44").getIzena(), "Izena4");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("55").getIzena(), "Izena5");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("66").getIzena(), "Izena6");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("77").getIzena(), "Izena7");
		assertEquals(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("88").getIzena(), "Izena8");
		
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11") instanceof Mutila);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("33") instanceof Mutila);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("55") instanceof Mutila);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("77") instanceof Mutila);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22") instanceof Neska);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("44") instanceof Neska);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("66") instanceof Neska);
		assertTrue(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("88") instanceof Neska);
			
		// alumnos con el valor del caracter sexo incorrecto....
		
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("12","Izena12", "Abizena12", 12, 'P');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("21", "Izena21", "Abizena21", 21, 'p');
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("12"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("21"));
		
		// alumnos con Id repetido
		
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("11","IzenaRepe", "AbizenaRepe", 12, 'h');
		KurtsoDantza.getKurtsoDantza().gehituIkaslea("22","IzenaRepe", "AbizenaRepe", 12, 'm');
		
		assertEquals(h1, l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11"));
		assertEquals(m1, l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22"));				
	}
	
	public void testInskribatuBikotea()
	{
	
		
		// parejas el-ella y ella-el
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		
		assertFalse(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());
		
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
				
		ListaBikoteak.getListaBikoteak().erreseteatu();
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		// dar de alta parejas del mismo sexo
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("22", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("77", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "66");
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		// no existe ella en el curso

		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "1000");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "1200");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1100", "11");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1300", "33");
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		// no existe el en el curso

		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("22", "1000");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "1200");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1100", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1300", "88");
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		// no existe ninguno de los dos en el curso

		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1200", "1000");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("1100", "1300");
		

		

	}

	public void testInskribatuBikotea2()
	{
		
		// ya badago emparejada ella
		
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");

				assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
				assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
				assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
				assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));

				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "22");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "77");
				
				assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
				assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
				assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
				assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
				
				// ya badago emparejado el

				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "11");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "88");
				
				assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
				assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
				assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
				assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
				
				// ya estan emparejados los dos
				
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "44");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("22", "11");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("22", "33");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "22");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "11");
				KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");
				
				assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
				assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
				assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
				assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
				assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}
	public void testGehituPreferentzia()
	{
		
		
		
		
		assertNotNull(h1.getListaPreferentziak());
		assertNotNull(m1.getListaPreferentziak());
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");

		assertTrue(h1.getListaPreferentziak().badago(m1));
		assertFalse("No deberia haber Mutilas entre las preferencias de un Mutila", h1.getListaPreferentziak().badago(h1));
		assertFalse("No deberia haber Neskaes entre las preferencias de una Neska", m1.getListaPreferentziak().badago(m1));
		assertTrue(m1.getListaPreferentziak().badago(h1));

		// no estan ni los tienen
		
		assertFalse(m1.getListaPreferentziak().badago(h2));
		assertFalse(m1.getListaPreferentziak().badago(m1));
		assertFalse(m1.getListaPreferentziak().badago(m2));
		assertFalse(m2.getListaPreferentziak().badago(h1));
		assertFalse(m2.getListaPreferentziak().badago(h2));
		assertFalse(m2.getListaPreferentziak().badago(m1));
		assertFalse(m2.getListaPreferentziak().badago(m2));
		assertFalse(h1.getListaPreferentziak().badago(h1));
		assertFalse(h1.getListaPreferentziak().badago(h2));
		assertFalse(h1.getListaPreferentziak().badago(m2));
		assertFalse(h2.getListaPreferentziak().badago(h1));
		assertFalse(h2.getListaPreferentziak().badago(h2));
		assertFalse(h2.getListaPreferentziak().badago(m1));
		assertFalse(h2.getListaPreferentziak().badago(m2));
	}

	public void testHasieratuKurtsoa()
	{
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		
		KurtsoDantza.getKurtsoDantza().hasieratuKurtsoa();
		
		assertNotNull(ListaBikoteak.getListaBikoteak());
		assertNotNull(l1.getListaIkasleakKurtso());

		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
				
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("11"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("22"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("33"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("44"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("55"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("66"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("77"));
		assertNull(l1.getListaIkasleakKurtso().bilatuIkasleaNANez("88"));
	}

	public void testAjustatuBikoteakPreferentzienArabera01()
	{
		// Aun hay alumnos sin emparejar, por lo que no hay cambios 
		// Todos los alumnos quieren quedarse como estan
		
		
		System.out.println(h1.getIzena());
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
				
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		assertTrue(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());

		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");

		assertTrue(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());

		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
			
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		
		// ahora ya no hay alumnos sin pareja
		
		assertFalse(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}

	public void testAjustatuBikoteakPreferentzienArabera02()
	{
		// Aun hay alumnos sin emparejar, por lo que no hay cambios hasta el final
		// Todos los alumnos quieren cambiar
		
		
		
	
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		assertTrue(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());

		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");

		assertTrue(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());

		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertNull(ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
			
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		
		// ahora ya no hay alumnos sin pareja --> hay cambios
		
		assertFalse(l1.getListaIkasleakKurtso().badagoIkaslerikBikoterikGabe());
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));	
	}
	
	public void testAjustatuBikoteakPreferentzienArabera03()
	{
		// Todos quieren cambiar y es factible independientemente de la prioridad
		
		
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("55", "66");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("77", "88");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
	}
	
	public void testAjustatuBikoteakPreferentzienArabera04()
	{
		// Todos quieren cambiar y es factible, pero la de mas edad impone el cambio
		// y luego todo va en cascada
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "11");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("22", "11");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
	
	}

	public void testAjustatuBikoteakPreferentzienArabera05() //BEGIRATUUUUU
	{
		// No es posible el cambio porque nadie quiere a h3
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		
				
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("77", "88");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("44", "33");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));//peta
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));//peta
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));//peta
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));//peta
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
	}
	
	public void testAjustatuBikoteakPreferentzienArabera06()
	{
		// No es posible el cambio porque todas quieren a h2
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "33");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
				
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}

	public void testAjustatuBikoteakPreferentzienArabera07()
	{
		// No es posible el cambio porque nadie quiere a m2
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
		
	}
	

	public void testAjustatuBikoteakPreferentzienArabera08()
	{
		// No es posible el cambio porque todos quieren a m1
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "55");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}

	public void testAjustatuBikoteakPreferentzienArabera09()
	{
		// No es posible el cambio porque no hay acuerdo posible (ciclo)
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}
	
	public void testAjustatuBikoteakPreferentzienArabera10()
	{
		// No es posible el cambio porque no hay acuerdo posible (doble cruce)
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("22", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("44", "77");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "11");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("66", "55");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "33");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("88", "77");
		
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("11", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("33", "66");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "44");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("55", "88");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "22");
		KurtsoDantza.getKurtsoDantza().gehituPreferentzia("77", "88");
		
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("88", "77");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("11", "22");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("66", "55");
		KurtsoDantza.getKurtsoDantza().inskribatuBikotea("33", "44");
		
		KurtsoDantza.getKurtsoDantza().ajustatuBikoteakPreferentzienArabera();
		
		assertEquals(m1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h1));
		assertEquals(m2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h2));
		assertEquals(m3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h3));
		assertEquals(m4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(h4));
		assertEquals(h1, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m1));
		assertEquals(h2, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m2));
		assertEquals(h3, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m3));
		assertEquals(h4, ListaBikoteak.getListaBikoteak().lortuHonenBikotea(m4));
	}

}
