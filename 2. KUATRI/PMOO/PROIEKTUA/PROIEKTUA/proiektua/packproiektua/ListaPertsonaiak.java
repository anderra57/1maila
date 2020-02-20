package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPertsonaiak {
	private ArrayList<Pertsonaia> lista;
	private ListaPertsonaiak nireListaPertsonaiak = null;
	
	private ListaPertsonaiak(){
		this.lista = new ArrayList<Pertsonaia>();
	}
	public ListaPertsonaiak nireListaPertsonaiak(){
		if(nireListaPertsonaiak == null){
			nireListaPertsonaiak = new ListaPertsonaiak();
		}
		return nireListaPertsonaiak;
	}
	private Iterator<Pertsonaia> getNireIteradorea(){
		return this.lista.iterator();
	}
	public Pertsonaia pertsonaiaZehaztu(){
		
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
}
