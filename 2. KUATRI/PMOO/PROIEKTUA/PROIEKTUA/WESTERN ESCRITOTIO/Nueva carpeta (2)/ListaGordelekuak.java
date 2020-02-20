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
	
	//public ArrayList<Gordelekua> getListaGordelekuak(){
		//return this.lista;
	//}
	private void gordelekuaGehitu(Gordelekua pGordelekua){
		this.lista.add(pGordelekua);
	}
	public ListaGordelekuak gordelekuakSortu(){
		ListaGordelekuak l1 = ListaGordelekuak.getNireListaGordelekuak();
		Gordelekua g1 = new Gordelekua(5,5);
		l1.gordelekuaGehitu(g1);
		Gordelekua g2 = new Gordelekua(5,6);
		l1.gordelekuaGehitu(g2);
		Gordelekua g3 = new Gordelekua(6,5);
		l1.gordelekuaGehitu(g3);
		Gordelekua g4 = new Gordelekua(6,6);
		l1.gordelekuaGehitu(g4);
		Gordelekua g5 = new Gordelekua(15,15);
		l1.gordelekuaGehitu(g5);
		Gordelekua g6 = new Gordelekua(15,16);
		l1.gordelekuaGehitu(g6);
		Gordelekua g7 = new Gordelekua(16,15);
		l1.gordelekuaGehitu(g7);
		Gordelekua g8 = new Gordelekua(16,16);
		l1.gordelekuaGehitu(g8);
		return l1;
	}
	
}
