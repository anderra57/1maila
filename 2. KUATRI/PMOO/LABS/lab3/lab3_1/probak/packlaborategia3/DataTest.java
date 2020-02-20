package packlaborategia3;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTest {
	
	Data data11, data1231, data229B, data229XB, data31B, data31XB, data228B, data228XB, data6, datagaur, dataX;

	@Before
	public void setUp() throws Exception {
		
		/*public Data(int pUrtea, int pHilabetea, int pEguna){
			this.eguna = pEguna;
			this.hilabetea = pHilabetea;
			this.urtea = pUrtea;
			
			if (!this.dataZuzenaDa()){
				Calendar c = new GregorianCalendar();
				this.eguna = c.get(Calendar.DATE);
				this.hilabetea = c.get(Calendar.MONTH)+1;
				this.urtea = c.get(Calendar.YEAR);			
			}
			
		}*/
		
		data11=new Data(5000,1,1);
		data1231=new Data(5000,12,31);
		data229B=new Data(2016,2,29);
		data229XB=new Data(2017,2,29);
		data31B=new Data(2016,3,1);
		data31XB=new Data(2017,3,1);
		data228B=new Data(2016,2,28);
		data228XB=new Data(2017,2,28);
		data6=new Data(2017,6,6);
		datagaur=new Data(0,0,0);
		dataX=new Data(2018,45,37);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		assertEquals(data11.toString(),"5000/01/01");
		assertEquals(data1231.toString(),"5000/12/31");
		assertEquals(data229B.toString(),"2016/02/29");
		assertEquals(data229XB.toString(),"2019/02/14");
		assertEquals(data31B.toString(),"2016/03/01");
		assertEquals(data31XB.toString(),"2017/03/01");
		assertEquals(data228B.toString(),"2016/02/28");
		assertEquals(data228XB.toString(),"2017/02/28");
		assertEquals(data6.toString(),"2017/06/06");
		assertEquals(datagaur.toString(),"2019/02/14");
		assertEquals(dataX.toString(),"2019/02/14");
	}

	@Test
	public void testDataGehitu() {
		data11.dataGehitu();
		assertEquals(data11.toString(),"5000/01/02");
		data1231.dataGehitu();
		assertEquals(data1231.toString(),"5001/01/01");
		data229B.dataGehitu();
		assertEquals(data229B.toString(),"2016/03/01");
		data229XB.dataGehitu();
		assertEquals(data229XB.toString(),"2019/02/15");
		data31B.dataGehitu();
		assertEquals(data31B.toString(),"2016/03/02");
		data31XB.dataGehitu();
		assertEquals(data31XB.toString(),"2017/03/02");
		data228B.dataGehitu();
		assertEquals(data228B.toString(),"2016/02/29");
		data228XB.dataGehitu();
		assertEquals(data228XB.toString(),"2017/03/01");
		data6.dataGehitu();
		assertEquals(data6.toString(),"2017/06/07");
		
		datagaur.dataGehitu();
		assertEquals(datagaur.toString(),"2019/02/15");
		dataX.dataGehitu();
		assertEquals(dataX.toString(),"2019/02/15");
	}

	@Test
	public void testDataKendu() {
		data11.dataKendu();
		assertEquals(data11.toString(),"4999/12/31");
		data1231.dataKendu();
		assertEquals(data1231.toString(),"5000/12/30");
		data229B.dataKendu();
		assertEquals(data229B.toString(),"2016/02/28");
		data229XB.dataKendu();
		assertEquals(data229XB.toString(),"2019/02/13");
		data31B.dataKendu();
		assertEquals(data31B.toString(),"2016/02/29");
		data31XB.dataKendu();
		assertEquals(data31XB.toString(),"2017/02/28");
		data228B.dataKendu();
		assertEquals(data228B.toString(),"2016/02/27");
		data228XB.dataKendu();
		assertEquals(data228XB.toString(),"2017/02/27");
		data6.dataKendu();
		assertEquals(data6.toString(),"2017/06/05");
		
		datagaur.dataKendu();
		assertEquals(datagaur.toString(),"2019/02/13");
		dataX.dataKendu();
		assertEquals(dataX.toString(),"2019/02/13");

	}

}
