package packproiektua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Akzioa {
	private String izena;
	private int ident;
	private boolean kutxa;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public int getIdent(){
		return this.ident;
	}
	public boolean kutxa(){
		boolean kutxa_da=true;
		return kutxa_da;
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
					FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/Tabernaria_T.txt");
					ListaAkzioa listaAk = new ListaAkzioa();
					listaAk.setKutxaT();
					saloia.kutxaAgertu();
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/Tabernaria_F.txt");
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
					FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/Prostituta_T.txt");
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/Prostituta_F.txt");
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
				FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/GizonZaharra.txt");
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
					FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Saloia/Kutxagogorra.txt");
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
				FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Hilerria/Ehorzlea.txt");
			}
			else if(this.ident==2){

				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 15);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Hilerria/Apaiza.txt");
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
							FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Hilerria/Eliza_T.txt");
							//ListaEgoerak.getNireListaEgoerak().egoeraEguneratu(3); //hurrengo egoerara pasatuko da
							
							l.pasatuHilerritikBanketxera(); //hurrengo egoerara pasatuko da
						}
						else{
							FitxeroakIrakurri.fitxeroaErakutsi("./proiektua/fitxategiak/Hilerria/Eliza_F.txt");
						}
			}	
		}
		else if(pEgoera==3){

			if(this.ident==1){
				tiroEgin();
			}
			else if(this.ident==2){
				System.out.println("Pitia erabili duzu");
				p.objetuaErabili("Pitia");
			}
			else if(this.ident==3){
				System.out.println("Kapela erabili duzu");
				p.objetuaErabili("Kapela");
			}
			else if(this.ident==4){
				System.out.println("Likorea erabili duzu");
				p.objetuaErabili("Likorea");
			}
			else if(this.ident==5){
				mugitu();
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
		if(d.getGoikoAldea()>=2) {
			burutu=true;
		}
		return burutu;
	}
	private void tiroEgin(){
		int atq=Protagonista.getNireProtagonista().getAtaq();
		
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	public void mugitu(){
		try{
			int lag=noranzkoaLortu();
			Protagonista p=Protagonista.getNireProtagonista();
			Saloia saloia = Saloia.getNireSaloia();
			int x=p.getX();
			int y=p.getY();
			if(lag==1){
				if(y+1<=19){
					if(y==18) {
						System.out.println("Sartu duzun balioa ez da egokia...");
						p.posizioazAldatu(x,y);
					}
					else if(saloia.matrizekoBalioa(x, y+1)=='%'){
						System.out.println("Ezin zara hortik pasa...");
						p.posizioazAldatu(x,y);
					}
					else{
					p.posizioazAldatu(x,y+1);
					}
				}
			}
			else{
				if(lag==2){
					if(y-1>=0){
						if(y==1) {
							System.out.println("Sartu duzun balioa ez da egokia...");
							p.posizioazAldatu(x,y);
						}
						else if(saloia.matrizekoBalioa(x, y-1)=='%'){
							System.out.println("Ezin zara hortik pasa...");
							p.posizioazAldatu(x,y);
						}
						else{
						p.posizioazAldatu(x,y-1);
						}
					}
				}
				else{
					if(lag==3){
						if(x-1>=0){
							if(x==1) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
							}
							else if(saloia.matrizekoBalioa(x-1, y)=='%'){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
							}
							else{
							p.posizioazAldatu(x-1,y);
							}
						}
					}
					else{
						if(x+1<=19){
							if(x>=18) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
							}
							else if(saloia.matrizekoBalioa(x+1, y)=='%'){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
							}
							else{
							p.posizioazAldatu(x+1,y);
							}
						}
					}
				}
			}
		}
		catch(BalioEzEgokia lag){
			System.out.println("Sartu duzun balioa ez da egokia...");
			this.mugitu();
		}
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
	

	
	private int noranzkoaLortu() throws BalioEzEgokia{
		char lag=Teklatua.getNireTeklatua().irakurriChar();
		int emaitza=0;
		if((lag=='D')||(lag=='d')){
			emaitza=1;
		}
		else{
			if((lag=='A')||(lag=='a')){
				emaitza=2;
			}
			else{
				if((lag=='W')||(lag=='w')){
					emaitza=3;
				}
				else{
					if((lag=='S')||(lag=='s')){
						emaitza=4;
					}
					else {
						throw new BalioEzEgokia();
					}
				}
			}
		}
		return emaitza;
	}
}
