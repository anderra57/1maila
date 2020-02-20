package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaEgoerak {
	private ArrayList<Egoera> lista;
	private static ListaEgoerak nireListaEgoerak = null;
	
	private ListaEgoerak(){
		this.lista = new ArrayList<Egoera>();
	}
	public static ListaEgoerak getNireListaEgoerak(){
		if(nireListaEgoerak == null){
			nireListaEgoerak = new ListaEgoerak();
		}
		return nireListaEgoerak;
	}
	public Egoera egoeraEguneratu(int pZenb){
		Egoera e=null;
		int lag=pZenb;
		Iterator<Egoera>itr=this.getIteradorea();
		while(itr.hasNext()&&lag>0){
			e=itr.next();
			lag--;
		}
		return e;
		
	}
	private Iterator<Egoera> getIteradorea(){
		return this.lista.iterator();
	}
	
	
	public void hasieratuEgoerak(){
		Iterator<Egoera>itr=this.getIteradorea();
		Egoera e=null;
		while(itr.hasNext()){
			e=itr.next();
			e.hasieratu();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException, BalioEzEgokia{
		/*
		  
		 * 		JOKOAREN BALIOAK HASIERATU
		 *     	
		 */
		    	int preX;
		    	int preY;
		    	ListaAkzioa listaAkz = new ListaAkzioa();
		    	Saloia saloia = Saloia.getNireSaloia();
		    	Hilerria hilerria = Hilerria.getNireHilerria();
		    	Banketxea banketxea = Banketxea.getNireBanketxea();
		    	Inbentarioa inb = Inbentarioa.getNireInbentarioa();
		    	saloia.jokoaHasieratu();           
		    	Protagonista p = Protagonista.getNireProtagonista(); 
		/*
		 * 
		 * 		SALOIA
		 * 
		 */		//SALOIKO BALIOAK HASIERATU
		    	
		    	saloia.eszenatokiaHasieratu();
		    	p.hasierakoPosizioa(1);
		    	ListaAkzioa listaAkzS=listaAkz.listaAkzioakSortu(1);
		    	
		    	//SALOIA EGOERA    
		    	while(!listaAkz.bukatutaSaloia()){
		    	saloia.eszenatokiaInprimatu();
		    	preX=p.getX();
		    	preY=p.getY();
		    	listaAkzS.akzioaAukeratuEtaBurutu(1);
		    	Teklatua.getNireTeklatua().emanEnter();
		    	saloia.deletePertsonaiaMatrizetik(preX, preY);
		    	saloia.setPertsonaiaMatrizean();
		    	}
		    	
		    	//EGOERAZ ALDATU
		    	saloia.eszenatokiaBukatu();
		    	Teklatua.getNireTeklatua().emanEnter();   	
		/*
		 * 
		 * 		HILERRIA
		 *     	
		 */
		    	hilerria.eszenatokiaHasieratu();
		    	 
		    	p.hasierakoPosizioa(2);
		    	ListaAkzioa listaAkzH=listaAkz.listaAkzioakSortu(2);
		    	
		        
		    	while(!listaAkz.bukatutaHilerria()){
		    	hilerria.eszenatokiaInprimatu();
		    	preX=p.getX();
		    	preY=p.getY();
		    	listaAkzH.akzioaAukeratuEtaBurutu(2);
		    	Teklatua.getNireTeklatua().emanEnter();
		    	hilerria.deletePertsonaiaMatrizetik(preX, preY);
		    	hilerria.setPertsonaiaMatrizean();
		    	}
		    	
		    	hilerria.eszenatokiaBukatu();
		    	banketxea();
	}
	
	 public static void banketxea() throws FileNotFoundException, IOException, InterruptedException, BalioEzEgokia{
			//BANKETXEA//
			int preX;
	    	int preY;
	    	ListaAkzioa listaAkz = new ListaAkzioa();
	    	Banketxea banketxea = Banketxea.getNireBanketxea();
	    	Inbentarioa inb = Inbentarioa.getNireInbentarioa();       
	    	Protagonista p = Protagonista.getNireProtagonista(); 
	    	
	    	
	    	ListaGordelekuak l1 = ListaGordelekuak.getNireListaGordelekuak();
	    	//Banketxearen balioak hasieratu//
	    	banketxea.eszenatokiaHasieratu();
	    	p.hasierakoPosizioa(3);
	    	ListaAkzioa listaAkzB=listaAkz.listaAkzioakSortu(3);
	    	l1.gordelekuakSortu();
	    	banketxea.gordelekuakInprimatu(l1);
	    	inb.inbentarioaSortu();
	    	ListaEtsaiak listae = new ListaEtsaiak();
	    	
	    	
	    	Teklatua.getNireTeklatua().emanEnter();
	    	
	    	listae.etsaiakSortu();
	    	banketxea.sartuEtsaiakBanketxean(listae);
	    	
	        
	    	while(!listaAkz.bukatutaBanketxea()){
	    		banketxea.eszenatokiaInprimatu();
	    		preX=p.getX();
	    		preY=p.getY();
	    		System.out.println("+++++ ETSAIEN TXANDA +++++");
	 
	    		listae.eraso();
	    		if(p.getPv()<=0){
	    			System.out.println("Hilda zaude.");
	    		}
	    		else{
	    		System.out.println("Etsaien erasoaren ondoren, zure bizitza "+ p.getPv() +" da");
	    		System.out.println();
	    		System.out.println("+++++ ZURE TXANDA +++++");
	    		listae.etsaienBizitzaInprimatu();
	    		System.out.println(" ");
	    		listaAkzB.akzioaAukeratuEtaBurutu(3);
	    		//if(!listaAkzB.getMugitu1()){
	    			Teklatua.getNireTeklatua().emanEnter();
	    		//}
	    		listaAkzB.setMugitu(false);
	    		banketxea.deletePertsonaiaMatrizetik(preX, preY);
	    		banketxea.setPertsonaiaMatrizean();
	    		}
	    		if((listae.etsaiaGuztiakHilda()) || (p.getPv()<=0)){
	    			listaAkz.pasatuBanketxetikAmaierara();
	    		}
	    	}
	    	if(p.getPv()>0){
	    		FitxeroakIrakurri.fitxeroaErakutsi("Amaiera.txt");
	    		Teklatua.getNireTeklatua().emanEnter();
	    		banketxea.eszenatokiaBukatuOndo();
	        	Teklatua.getNireTeklatua().emanEnter();
	    	}
	    	else{
	    		FitxeroakIrakurri.fitxeroaErakutsi("AmaieraTX.txt");
	    		Teklatua.getNireTeklatua().emanEnter();
	        	System.out.println("Banketxea mapa errepikatu nahi baduzu, B idatzi. Bestela, beste edozer idatzi");
	        	String s = Teklatua.getNireTeklatua().irakurriString();
	        	String b = "B";
	        	s.toUpperCase();
	        	if(s.equals(b)){
	        		listaAkz.berrizHasieratuBanketxea();
	        	     
	            	String izena = Protagonista.getNireProtagonista().getIzena();
	            	p=null;
	            	p=Protagonista.hasieratuProtagonista(izena);
	            	listae=null;
	        		banketxea();
	        	}
	        	banketxea.eszenatokiaBukatuTxarto();

	        	Teklatua.getNireTeklatua().emanEnter();
			}
	    }
}
