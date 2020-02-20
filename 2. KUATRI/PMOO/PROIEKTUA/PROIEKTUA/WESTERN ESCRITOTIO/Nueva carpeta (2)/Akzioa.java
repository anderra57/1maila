package packproiektua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Akzioa {
	protected String izena;
	protected int ident;
	protected boolean kutxa;
	protected static boolean objetuak1=false;
	protected static boolean objetuak2=false;
	protected static int kont = 0;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public int getIdent(){
		return this.ident;
	}
	
	public boolean getKutxa(){
		return this.kutxa;
	}
	public boolean kutxa(){
		boolean kutxa_da=true;
		return kutxa_da;
	}
	public void setObjetuak1(boolean pO){
		this.objetuak1=pO;
	}
	public void setObjetuak2(boolean pO){
		this.objetuak2=pO;
	}
	public void kont(){
		this.kont++;
	}
	
	public ListaEtsaiak berdinakDira(){
		int px = Protagonista.getNireProtagonista().getX();
		int py = Protagonista.getNireProtagonista().getY();
		Etsaia e = null;
		ListaEtsaiak l1 = Banketxea.getNireBanketxea().lortuEtsaiakBanketxetik();
		ListaEtsaiak l2 = new ListaEtsaiak();
		Iterator<Etsaia> itr = l1.getIteradorea();
		while(itr.hasNext()){
			e = itr.next();
			int ex = e.getX();
			int ey = e.getY();
			if((px==ex)||(py==ey)){
				l2.etsaiaGehitu(e);
			}
		}
		return l2;
	}
		
	public void akzioaBurutu(int pEgoera) throws FileNotFoundException, IOException{
		
		//int lag=Teklatua.getNireTeklatua().irakurriZenb();
		
		
		Boolean giltza=false; //Apaizarekin hitz egin eta gero true bihurtuko da
		Protagonista p=Protagonista.getNireProtagonista();
		Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	
		
		if(pEgoera==1){
			if(this.ident==1){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(12, 4);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Tabernariarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				if(dialogoaBurutu()){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Tabernaria_T.txt");
					ListaAkzioa listaAk = new ListaAkzioa();
					listaAk.setKutxaT();
					saloia.kutxaAgertu();
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Tabernaria_F.txt");
				}
			}
			else if(this.ident==2){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(4, 16);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Prostitutarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				if(dialogoaBurutu()){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Prostituta_T.txt");
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Prostituta_F.txt");
				}
			}
			else if(this.ident==3){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 7);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Gizon zaharrarenga hurbidu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Saloia/GizonZaharra.txt");
			}
			else if(this.ident==4){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(3, 3);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Kutxagogorrera hurbildu zara eta irekitzeko gako bat behar duela ikusten duzu...");
				int gakoa=zenbakiaLortu();
				//String kontra=Integer.toString(gakoa);
				//if(kontra=="1830"){
				if(gakoa==1830){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Kutxagogorra.txt");
					ListaAkzioa l = new ListaAkzioa();
					l.pasatuSaloitikHilerrira(); //hurrengo egoerara pasatuko da
				}
				else{
					System.out.println("Kutxagogorra irekitzen saiatu zara baina ez da ezer gertatu...");
				}
			}
		}
		else if(pEgoera==2){
			if(this.ident==1){
				
				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(8, 2);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				System.out.println("Ehorzlearengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Ehorzlea.txt");
			}
			else if(this.ident==2){

				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 15);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Apaiza.txt");
				giltza=true;
				ListaAkzioa l = new ListaAkzioa();
				l.setElizaT();
			}
			else if(this.ident==3){

				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 12);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				ListaAkzioa l = new ListaAkzioa();
						if(l.getEliza()){
							FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Eliza_T.txt");
							//ListaEgoerak.getNireListaEgoerak().egoeraEguneratu(3); //hurrengo egoerara pasatuko da
							
							l.pasatuHilerritikBanketxera(); //hurrengo egoerara pasatuko da
						}
						else{
							FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Eliza_F.txt");
						}
			}	
		}
		else if(pEgoera==3){
			
			if(this.ident==1){
				TiroEgin t=new TiroEgin();
				t.tiroEgin();
			}
			else if(this.ident==2){
				if(!objetuak1){
					System.out.println("Lehen zenuen bizitza hurrengoa da:");
					System.out.println("Bizitza: "+p.getPv());
					System.out.println("");
					p.objetuaErabili("Pitia");
					System.out.println("Pitia erabili duzu eta zure bizitza hurrengoa da:");
					System.out.println("Bizitza berria: "+p.getPv());
				this.setObjetuak1(true);
				}
				else{
					System.out.println("Pitia ez dago zure inbentarioan");
				}
			}
			else if(this.ident==3){
				if(!objetuak2){
					System.out.println("Lehen zenuen bizitza hurrengoa da:");
					System.out.println("Bizitza: "+p.getPv());
					System.out.println("");
					p.objetuaErabili("Kapela");
					System.out.println("Kapela erabili duzu eta zure bizitza hurrengoa da:");
					System.out.println("Bizitza berria: "+p.getPv());
					this.setObjetuak2(true);
					}
					else{
						System.out.println("Kapela ez dago zure inbentarioan");
					}
			}
			else if(this.ident==4){
				if(this.kont<=1){
					System.out.println("Lehen zenuen bizitza hurrengoa da:");
					System.out.println("Bizitza: "+p.getPv());
					System.out.println("");
					p.objetuaErabili("Likorea");
					System.out.println("Likorea erabili duzu eta zure bizitza hurrengoa da:");
					System.out.println("Bizitza berria: "+p.getPv());
					this.kont();
					}
					else{
						System.out.println("Likorea ez dago zure inbentarioan");
					}
			}

			else if(this.ident==5){
				System.out.println("Norantz nahi duzu mugitu?");
				System.out.println("> W < gorantz joateko");
				System.out.println("> A < ezkerrerantz joateko");
				System.out.println("> S < beherentzat joateko");
				System.out.println("> D < eskuineranz joateko");
				Mugitu m=new Mugitu();
				m.mugitu();
			}
		}
			
	}

	private boolean dialogoaBurutu(){
		Boolean burutu=false;
		Dadoa d=new Dadoa(6);
		d.bota();
		/*
		if(Protagonista.getNireProtagonista().getCar()+d.getGoikoAldea()>=6) {
			burutu=true;
		}*/
		if(d.getGoikoAldea()>=3) {
			burutu=true;
		}
		return burutu;
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	private int zenbakiaLortu(){
		boolean lortuta=false;
		try{
			int lag=Teklatua.getNireTeklatua().irakurriZenb();
			lortuta=true;
			return lag;
		}
		catch(NumberFormatException lag){
			System.out.println("Benetan badakizu zenbakiak nola diren?");
			return this.zenbakiaLortu();
		}
	}
}
