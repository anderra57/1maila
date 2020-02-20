package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaGordelekuak {

	private ArrayList<Gordelekua> lista;
	private static ListaGordelekuak nireListaGordelekuak = null;
	
	private ListaGordelekuak(){
		this.lista = new ArrayList<Gordelekua>();
	}
	
	public static ListaGordelekuak getNireListaGordelekuak(){
		if(nireListaGordelekuak == null){
			nireListaGordelekuak = new ListaGordelekuak();
		}
		return nireListaGordelekuak;
	}
	
	public Iterator<Gordelekua> getIteradorea(){
		return this.lista.iterator();
	}
	
	public boolean okupatutaDago(int pX, int pY){
		boolean okupatuta = false;
		Iterator<Gordelekua> itr = this.getIteradorea();
		Gordelekua gordelekua = null;
		while(itr.hasNext() && !okupatuta){
			gordelekua = itr.next();
			if(gordelekua.getX() == pX && gordelekua.getY() == pY){
				okupatuta = true;
			}
		}
		return okupatuta;
	}
	
	public ArrayList<Gordelekua> getListaGordelekuak(){
		return this.lista;
	}
	
}
