package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEgoerak {
	private ArrayList<Egoera> lista;
	private ListaEgoerak nireListaEgoerak = null;
	
	private ListaEgoerak(){
		this.lista = new ArrayList<Egoera>();
	}
	public ListaEgoerak nireListaEgoerak(){
		if(nireListaEgoerak == null){
			nireListaEgoerak = new ListaEgoerak();
		}
		return nireListaEgoerak;
	}
	public Egoera egoeraZehaztu(){
		
	}
	private Iterator<Egoera> getIteradorea(){
		return this.lista.iterator();
	}
}
