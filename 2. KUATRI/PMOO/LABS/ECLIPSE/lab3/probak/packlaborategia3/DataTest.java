package packlaborategia3;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataTest {
	
	Data data11, data1231, data229B, data229XB, data31B, data31XB, data228B, data228XB, 
	data6, datagaur, dataX, data21, data41, data51, data61, data71, data81, data91, data101, data111, data121, data2000;

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
		data21=new Data(2016,2,1);
		data41=new Data(2016,4,1);
		data51=new Data(2016,5,1);
		data61=new Data(2016,6,1);
		data71=new Data(2016,7,1);
		data81=new Data(2016,8,1);
		data91=new Data(2016,9,1);
		data101=new Data(2016,10,1);
		data111=new Data(2016,11,1);
		data121=new Data(2016,12,1);
		data2000=new Data(2000,3,1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		assertEquals(data11.toString(),"5000/01/01");
		assertEquals(data1231.toString(),"5000/12/31");
		assertEquals(data229B.toString(),"2016/02/29");
		assertEquals(data229XB.toString(),"2019/02/18");
		assertEquals(data31B.toString(),"2016/03/01");
		assertEquals(data31XB.toString(),"2017/03/01");
		assertEquals(data228B.toString(),"2016/02/28");
		assertEquals(data228XB.toString(),"2017/02/28");
		assertEquals(data6.toString(),"2017/06/06");
		assertEquals(datagaur.toString(),"2019/02/18");
		assertEquals(dataX.toString(),"2019/02/18");
		assertEquals(data21.toString(),"2016/02/01");
		assertEquals(data41.toString(),"2016/04/01");
		assertEquals(data51.toString(),"2016/05/01");
		assertEquals(data61.toString(),"2016/06/01");
		assertEquals(data71.toString(),"2016/07/01");
		assertEquals(data81.toString(),"2016/08/01");
		assertEquals(data91.toString(),"2016/09/01");
		assertEquals(data101.toString(),"2016/10/01");
		assertEquals(data111.toString(),"2016/11/01");
		assertEquals(data121.toString(),"2016/12/01");
		assertEquals(data2000.toString(),"2000/03/01");
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
		assertEquals(data229XB.toString(),"2019/02/19");
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
		assertEquals(datagaur.toString(),"2019/02/19");
		dataX.dataGehitu();
		assertEquals(dataX.toString(),"2019/02/19");
		
		
		data21.dataGehitu();
		assertEquals(data21.toString(),"2016/02/02");
		data41.dataGehitu();
		assertEquals(data41.toString(),"2016/04/02");
		data51.dataGehitu();
		assertEquals(data51.toString(),"2016/05/02");
		data61.dataGehitu();
		assertEquals(data61.toString(),"2016/06/02");		
		data71.dataGehitu();
		assertEquals(data71.toString(),"2016/07/02");
		data81.dataGehitu();
		assertEquals(data81.toString(),"2016/08/02");
		data91.dataGehitu();
		assertEquals(data91.toString(),"2016/09/02");
		data101.dataGehitu();
		assertEquals(data101.toString(),"2016/10/02");
		data111.dataGehitu();
		assertEquals(data111.toString(),"2016/11/02");
		data121.dataGehitu();
		assertEquals(data121.toString(),"2016/12/02");
		
		
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
		assertEquals(data229XB.toString(),"2019/02/17");
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
		assertEquals(datagaur.toString(),"2019/02/17");
		dataX.dataKendu();
		assertEquals(dataX.toString(),"2019/02/17");
		
		data21.dataKendu();
		assertEquals(data21.toString(),"2016/01/31");
		data41.dataKendu();
		assertEquals(data41.toString(),"2016/03/31");
		data51.dataKendu();
		assertEquals(data51.toString(),"2016/04/30");
		data61.dataKendu();
		assertEquals(data61.toString(),"2016/05/31");
		data71.dataKendu();
		assertEquals(data71.toString(),"2016/06/30");
		data81.dataKendu();
		assertEquals(data81.toString(),"2016/07/31");
		data91.dataKendu();
		assertEquals(data91.toString(),"2016/08/31");
		data101.dataKendu();
		assertEquals(data101.toString(),"2016/09/30");
		data111.dataKendu();
		assertEquals(data111.toString(),"2016/10/31");
		data121.dataKendu();
		assertEquals(data121.toString(),"2016/11/30");
		
		data2000.dataKendu();
		assertEquals(data2000.toString(),"2000/02/29");

	}

}
