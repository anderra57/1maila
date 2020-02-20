package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ListaAkzioa{

	private ArrayList<Akzioa> lista;
	private static boolean kutxa=false;
	private static boolean eliza=false;
	private static boolean mugitu=false;
	private static boolean mugitu1=false;
	private static boolean pasatuSaloitikHilerrira=false;
	private static boolean pasatuHilerritikBanketxera=false;
	private static boolean pasatuBanketxetikAmaierara=false;
	
	public ListaAkzioa(){
		this.lista = new ArrayList<Akzioa>();
	}
	
	public void setKutxaT(){
		this.kutxa=true;
	}
	
	public void setElizaT(){
		this.eliza=true;
	}
	
	public void setMugitu(boolean pM){//Exception
		this.mugitu=pM;
	}
	
	public void setMugitu1(boolean pM){//Teklatua
		this.mugitu1=pM;
	}
	public boolean getKutxa(){
		return this.kutxa;
	}
	
	public boolean getEliza(){
		return this.eliza;
	}
	
	public boolean getMugitu(){
		return this.mugitu;
	}
	
	public boolean getMugitu1(){
		return this.mugitu1;
		}
	
	public void pasatuSaloitikHilerrira(){
		this.pasatuSaloitikHilerrira=true;
	}
	
	public void pasatuHilerritikBanketxera(){
		this.pasatuHilerritikBanketxera=true;
	}
	
	public void pasatuBanketxetikAmaierara(){
		this.pasatuBanketxetikAmaierara=true;
	}
	
	public boolean bukatutaSaloia(){
		return this.pasatuSaloitikHilerrira;
	}
	
	public boolean bukatutaHilerria(){
		return this.pasatuHilerritikBanketxera;
	}
	
	public boolean bukatutaBanketxea(){
		return this.pasatuBanketxetikAmaierara;
	}
	
	public void berrizHasieratuBanketxea(){
		this.pasatuBanketxetikAmaierara=false;
	}
	
	private Iterator<Akzioa> getIteradorea(){
		return this.lista.iterator();
	}
	
	public void printeatuAkzioa(){
		Akzioa akzioa = null;
		Iterator<Akzioa> itr = this.getIteradorea();
		while(itr.hasNext()){
			akzioa = itr.next();
			akzioa.akzioaInprimatu();
		}
	}
	
	public ListaAkzioa listaAkzioakSortu(int pEgoera){
		ListaAkzioa l=new ListaAkzioa();
		Akzioa a=null;
		if(pEgoera == 2){
			a=new Akzioa("Ehorzlearekin hitz egin",1);
			l.akzioaGehitu(a);
			a=new Akzioa("Apaizarekin hitz egin",2);
			l.akzioaGehitu(a);
			a=new Akzioa("Elizan sartu",3);
			l.akzioaGehitu(a);
		}
		else if(pEgoera == 1){
				a=new Akzioa("Tabernariarekin hitz egin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Prostitutarekin hitz egin",2);
				l.akzioaGehitu(a);
				a=new Akzioa("Gizon zaharrarekin",3);
				l.akzioaGehitu(a);
				a=new Akzioa("Kutxagogorrera hurbildu",4);
				l.akzioaGehitu(a);
		}
		else if (pEgoera==3){ //Banketxea
				a=new Akzioa("Tiro egin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Pitia erabili",2);
				l.akzioaGehitu(a);
				a=new Akzioa("Kapela erabili",3);
				l.akzioaGehitu(a);
				a=new Akzioa("Likorea erabili",4);
				l.akzioaGehitu(a);
				a=new Akzioa("Mugitu",5);
				l.akzioaGehitu(a);
		}
		
		return l;
	}
	
	public void akzioaAukeratuEtaBurutu(int pEgoera) throws FileNotFoundException, IOException{
		try{
			String izena=Protagonista.getNireProtagonista().getIzena();
			
			if(pEgoera==1){
				//this.lista.listaAkzioakSortu(1);
				System.out.println(izena + ", zer egin nahi duzu?");
				System.out.println("1) Tabernariarekin hitz egin");
				System.out.println("2) Prostitutarekin hitz egin");
				System.out.println("3) Gizon zaharrarekin hitz egin");
				if(this.kutxa){
					System.out.println("4) Kutxagogorrera joan");
				}
			}
			else if(pEgoera==2){
				//this.lista.listaAkzioakSortu(2); esto va en el main
				System.out.println(izena + ", zer egin nahi duzu?");
				System.out.println("1) Ehorzlearekin hitz egin");
				System.out.println("2) Apaizarekin hitz egin");
				
					System.out.println("3) Elizan sartu");
				
				
			}
			else if(pEgoera==3){
				//this.listaAkzioakSortu(3);
				System.out.println(izena + ", zer egin nahi duzu?");
				System.out.println("1) Tiro egin");
				System.out.println("2) Pitia erabili");
				System.out.println("3) Kapela erabili");
				System.out.println("4) Likorea erabili");
				System.out.println("5) Mugitu");
				
			}
			
			
			
			int lag=this.zenbakiaAukeratu(pEgoera);
		//	if(lag==0){
		//		ListaEtsaiak pL = Banketxea.getNireBanketxea().lortuEtsaiakBanketxetik();
		//		pL.etsaiakHilBETATESTER();//frogak egiteko
		//	}
			//int lag=Teklatua.getNireTeklatua().irakurriZenb();
			Akzioa a=null;
			boolean aurkitua=false;
			Iterator<Akzioa>itr=this.getIteradorea();
			while(itr.hasNext()&&!aurkitua){
				a=itr.next();
				if(a.getIdent()==lag){
					aurkitua=true;
				}
			}
			if(!aurkitua){
				System.out.println("Ez da aurkitu"); //testu hau agertzen da
				throw new NotZenbakiEgokia();
			}
			a.akzioaBurutu(pEgoera);
			//Darle al enter
		}
		catch(NotZenbakiEgokia lag){
			System.out.println("Mesedez, ez izan gringo eta sartu balio duen zenbaki bat...");
		}
		catch(NumberFormatException lag){
			if(this.mugitu){
				System.out.println("Badakizu nola diren zenbakiak?");
			}
			this.setMugitu(false);
			
		}
	}
	
	private void akzioaGehitu(Akzioa pAkzioa){
		this.lista.add(pAkzioa);
	}
	
	
	public void clear(){
		this.lista.clear();
	}
	
	private int zenbakiaAukeratu(int pEgoera) throws NotZenbakiEgokia{
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		
		if(pEgoera==1){
			if(!this.kutxa){
				if((lag<0)||(lag>3)){
					throw new NotZenbakiEgokia();
				}
			}
			
			if(this.kutxa){
				if((lag<0)||(lag>4)){
					throw new NotZenbakiEgokia();
				}
			}
		}
		else if(pEgoera==2){
			if((lag<0)||(lag>3)){
				throw new NotZenbakiEgokia();
			}
		}
		else if(pEgoera==3){
			if((lag<0)||(lag>5)){
				throw new NotZenbakiEgokia();
			}
		}
		
		
		if((lag<0)||(lag>5)){
			throw new NotZenbakiEgokia();
		}
		return lag;
	}
}