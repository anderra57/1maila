package packlaborategia5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaErabiltzaileak{
	// atributuak
	private ArrayList<Erabiltzailea> lista;
	private static ListaErabiltzaileak nireListaErabiltzaileak=null;
	
	// eraikitzailea
	
    private ListaErabiltzaileak(){ 
    	this.lista = new ArrayList<Erabiltzailea>();
    }
   	
    // beste metodoak
    
   	public static ListaErabiltzaileak getListaErabiltzaileak(){
   		if(nireListaErabiltzaileak == null){
   			nireListaErabiltzaileak = new ListaErabiltzaileak();
   		}
   		return nireListaErabiltzaileak;
   	}
   	
	public int erabiltzaileKopurua(){
		return this.lista.size();
   	}
   	
   	private Iterator<Erabiltzailea> getIteradorea(){
   		return this.lista.iterator();
   	}
    
   	public Erabiltzailea bilatuErabiltzaileaIdz(int pId){
   		boolean aurkitua = false;
   		Erabiltzailea erabil = null;
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   		while(itr.hasNext() && !aurkitua){
   			erabil = itr.next();
   			if(erabil.idHauDu(pId)){
   				aurkitua = true;
   			}}
   		if (!aurkitua){
   			System.out.println("ez da aurkitu erabiltzailea idz");
   			erabil=null;
   		}
   		else{System.out.println("aurkitu da");}
   		
   		return erabil;
   	}
   	
   	public boolean badagoIdBerdinekoErabiltzailerik(Erabiltzailea pErabiltzailea){
   		Erabiltzailea erab=null;
   		Iterator<Erabiltzailea> itr=this.getIteradorea();
   		boolean aurkitua=false;
   		while (itr.hasNext() && !aurkitua){ //o asi
   			erab=itr.next();
   			if (erab.idBerdinaDute(pErabiltzailea)){
   				aurkitua=true;
   			}
   		}
   		return aurkitua;
   	}
   	
   	
 	public void erabiltzaileariAltaEman(Erabiltzailea pErabiltzailea){   		
   		if (!this.badagoIdBerdinekoErabiltzailerik(pErabiltzailea)){
   			this.lista.add(pErabiltzailea);
   		}
   	}
   	
 	public void erabiltzaileaBajaEman(int pIdErabiltzailea){
		Erabiltzailea user= this.bilatuErabiltzaileaIdz(pIdErabiltzailea);
		if (user!=null){
			this.lista.remove(user);
		}
   	}
	
	public Erabiltzailea norkDaukaMaileguan(Liburua pLiburu){
   		Erabiltzailea nork=null;
   		Iterator<Erabiltzailea> itr=this.getIteradorea();
   		boolean aurkitua=false;
   		
   		while (itr.hasNext() && !aurkitua){
   			nork=itr.next();
   			if (nork.maileguanDu(pLiburu)){
   				aurkitua=true;
   			}
   		}
   		
   		if (!aurkitua){
   			nork=null;
   		}
   		return nork;
   	}
	
   	public void inprimatu(){	
   		Erabiltzailea erabilt = null;
   		Iterator<Erabiltzailea> itr = this.getIteradorea();
   	    System.out.println("Erabiltzaile kopurua: " +this.erabiltzaileKopurua());
   		while(itr.hasNext()){
   			erabilt = itr.next();
   			erabilt.inprimatu();
   		}
   	}
   
   	public void erreseteatu(){
   		this.lista.clear();
   	}
}
