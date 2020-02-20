package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPertsonaiak {
	private ArrayList<Pertsonaia> lista;
	private static ListaPertsonaiak nireListaPertsonaiak = null;
	
	private ListaPertsonaiak(){
		this.lista = new ArrayList<Pertsonaia>();
	}
	public static ListaPertsonaiak nireListaPertsonaiak(){
		if(nireListaPertsonaiak == null){
			nireListaPertsonaiak = new ListaPertsonaiak();
		}
		return nireListaPertsonaiak;
	}
	private Iterator<Pertsonaia> getNireIteradorea(){
		return this.lista.iterator();
	}
	public Pertsonaia pertsonaiaZehaztu(){
		Pertsonaia pertsonaia = null;
		Iterator<Pertsonaia> itr = this.getNireIteradorea();
		while(itr.hasNext()){
			pertsonaia = itr.next();
		}
		return pertsonaia;
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	public boolean pertsonaiaBerdina(Pertsonaia pPertsonaia){
		boolean berdina = false;
		Iterator<Pertsonaia> itr = this.getNireIteradorea();
		Pertsonaia pertsonaia = null;
		while(itr.hasNext() && !berdina){
			pertsonaia = itr.next();
			if(pertsonaia == pPertsonaia){
				berdina = true;
			}
		}
		return berdina;
	}
	
	public boolean okupatutaDago(int pX, int pY){
		boolean okupatuta = false;
		Iterator<Pertsonaia> itr = this.getNireIteradorea();
		Pertsonaia perts = null;
		while(itr.hasNext() && !okupatuta){
			perts = itr.next();
			if(perts.getX() == pX && perts.getY() == pY){
				okupatuta = true;
			}
		}
		return okupatuta;
	}
}
