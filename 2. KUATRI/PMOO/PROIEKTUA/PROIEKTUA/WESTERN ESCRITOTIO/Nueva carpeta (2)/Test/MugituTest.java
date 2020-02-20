package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MugituTest {
	
	Mugitu m1,m2,m3;

	@Before
	public void setUp() throws Exception {
		m1=new Mugitu();
		m2=new Mugitu();
		m3=new Mugitu();
		Protagonista.hasieratuProtagonista("Proba");
		Protagonista.getNireProtagonista().hasierakoPosizioa(3); //Akzio hau bakarrik banketxean dago 
	} 

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMugitu() {
		assertNotNull(m1);
		assertNotNull(m2);
		assertNotNull(m3);
	}

	@Test
	public void testMugitu1() {
		
		//goruntz badoa 
		
		ListaAkzioa l = new ListaAkzioa();
		l.setMugitu(true);
		l.setMugitu1(true);
		int lag=1;  //Gora mugitu
		Protagonista p=Protagonista.getNireProtagonista();
		Banketxea banketxea = Banketxea.getNireBanketxea();
		int x=p.getX();
		int y=p.getY();
		if(lag==1){
			if(y+1<=18){
				if(y==17) {
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')){
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
						(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
						(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
						(banketxea.matrizekoBalioa(x, y+1)=='G')){
					p.posizioazAldatu(x,y);
				}
				else{
				p.posizioazAldatu(x,y+1);
				}
			}
		}
		else{
			if(lag==2){
				if(y-1>=1){
					if(y==2) {
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='%')||(banketxea.matrizekoBalioa(x, y-1)=='@')){
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
							(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
							(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
							(banketxea.matrizekoBalioa(x, y-1)=='G')){
						p.posizioazAldatu(x,y);
					}
					else{
					p.posizioazAldatu(x,y-1);
					}
				}
			}
			else{
				if(lag==3){
					if(x-1>=1){
						if(x==2) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='%')||(banketxea.matrizekoBalioa(x-1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
								(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
								(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
								(banketxea.matrizekoBalioa(x-1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x-1,y);
						}
					}
				}
				else{
					if(x+1<=18){
						if(x==17) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='%')||(banketxea.matrizekoBalioa(x+1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
								(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
								(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
								(banketxea.matrizekoBalioa(x+1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x+1,y);
						}
					}
				}
			}
		}
		
		assertEquals(Protagonista.getNireProtagonista().getY(),9);
		
		//Beheruntz badoa
		
		Protagonista.hasieratuProtagonista("Proba");
		lag=2;
		
		if(lag==1){
			if(y+1<=18){
				if(y==17) {
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')){
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
						(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
						(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
						(banketxea.matrizekoBalioa(x, y+1)=='G')){
					p.posizioazAldatu(x,y);
				}
				else{
				p.posizioazAldatu(x,y+1);
				}
			}
		}
		else{
			if(lag==2){
				if(y-1>=1){
					if(y==2) {
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='%')||(banketxea.matrizekoBalioa(x, y-1)=='@')){
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
							(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
							(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
							(banketxea.matrizekoBalioa(x, y-1)=='G')){
						p.posizioazAldatu(x,y);
					}
					else{
					p.posizioazAldatu(x,y-1);
					}
				}
			}
			else{
				if(lag==3){
					if(x-1>=1){
						if(x==2) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='%')||(banketxea.matrizekoBalioa(x-1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
								(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
								(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
								(banketxea.matrizekoBalioa(x-1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x-1,y);
						}
					}
				}
				else{
					if(x+1<=18){
						if(x==17) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='%')||(banketxea.matrizekoBalioa(x+1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
								(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
								(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
								(banketxea.matrizekoBalioa(x+1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x+1,y);
						}
					}
				}
			}
		}
		
		assertEquals(Protagonista.getNireProtagonista().getY(),7);
		
		//Ezkerrera badoa
		
		Protagonista.hasieratuProtagonista("Proba");
		lag=3;
		
		if(lag==1){
			if(y+1<=18){
				if(y==17) {
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')){
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
						(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
						(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
						(banketxea.matrizekoBalioa(x, y+1)=='G')){
					p.posizioazAldatu(x,y);
				}
				else{
				p.posizioazAldatu(x,y+1);
				}
			}
		}
		else{
			if(lag==2){
				if(y-1>=1){
					if(y==2) {
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='%')||(banketxea.matrizekoBalioa(x, y-1)=='@')){
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
							(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
							(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
							(banketxea.matrizekoBalioa(x, y-1)=='G')){
						p.posizioazAldatu(x,y);
					}
					else{
					p.posizioazAldatu(x,y-1);
					}
				}
			}
			else{
				if(lag==3){
					if(x-1>=1){
						if(x==2) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='%')||(banketxea.matrizekoBalioa(x-1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
								(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
								(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
								(banketxea.matrizekoBalioa(x-1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x-1,y);
						}
					}
				}
				else{
					if(x+1<=18){
						if(x==17) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='%')||(banketxea.matrizekoBalioa(x+1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
								(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
								(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
								(banketxea.matrizekoBalioa(x+1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x+1,y);
						}
					}
				}
			}
		}
		
		assertEquals(Protagonista.getNireProtagonista().getX(),17);
		
		//Eskumara badoa
		
		Protagonista.hasieratuProtagonista("Proba");
		lag=4;
		
		if(lag==1){
			if(y+1<=18){
				if(y==17) {
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')){
					p.posizioazAldatu(x,y);
				}
				else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
						(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
						(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
						(banketxea.matrizekoBalioa(x, y+1)=='G')){
					p.posizioazAldatu(x,y);
				}
				else{
				p.posizioazAldatu(x,y+1);
				}
			}
		}
		else{
			if(lag==2){
				if(y-1>=1){
					if(y==2) {
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='%')||(banketxea.matrizekoBalioa(x, y-1)=='@')){
						p.posizioazAldatu(x,y);
					}
					else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
							(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
							(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
							(banketxea.matrizekoBalioa(x, y-1)=='G')){
						p.posizioazAldatu(x,y);
					}
					else{
					p.posizioazAldatu(x,y-1);
					}
				}
			}
			else{
				if(lag==3){
					if(x-1>=1){
						if(x==2) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='%')||(banketxea.matrizekoBalioa(x-1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
								(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
								(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
								(banketxea.matrizekoBalioa(x-1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x-1,y);
						}
					}
				}
				else{
					if(x+1<=18){
						if(x==17) {
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='%')||(banketxea.matrizekoBalioa(x+1, y)=='@')){
							p.posizioazAldatu(x,y);
						}
						else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
								(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
								(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
								(banketxea.matrizekoBalioa(x+1, y)=='G')){
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x+1,y);
						}
					}
				}
			}
		}
		
		assertEquals(Protagonista.getNireProtagonista().getX(),17);
	}
}