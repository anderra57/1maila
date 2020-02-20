package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class Inbentarioa {
	private ArrayList<Objetua>lista;
	private static Inbentarioa nireInbentarioa = null;
	
	private Inbentarioa(){
		this.lista = new ArrayList<Objetua>();
	}
	public static Inbentarioa getNireInbentarioa(){
		if(nireInbentarioa==null){
			nireInbentarioa=new Inbentarioa();
		}
		return nireInbentarioa;
	}
	
	
	private Iterator<Objetua> getIteradorea(){
		return this.lista.iterator();
	}
	private void ObjetuaGehitu(Objetua pObjetua){
		this.lista.add(pObjetua);
	}
	
	public Inbentarioa inbentarioaSortu(){
		Inbentarioa inb = Inbentarioa.getNireInbentarioa();
		
		Kapela obj = new Kapela();
		inb.ObjetuaGehitu(obj);
		Pitia obj1 = new Pitia();
		inb.ObjetuaGehitu(obj1);
		Likorea obj2 = new Likorea();
		inb.ObjetuaGehitu(obj2);
		return inb;
	}
	
	private Objetua bilatuObjetuaIzenez(String pString){
		Iterator<Objetua>itr=this.getIteradorea();
		Objetua o=null;
		boolean topatuta=false;
		while(itr.hasNext() && !topatuta){
			o=itr.next();
			if(pString.equals(o.getIzena())){
				topatuta=true;
			}
		}
		return o;
	}
	
	public void objetuaErabili(String pObjetua){
		boolean aurkitua=false;
		Objetua objetua=this.bilatuObjetuaIzenez(pObjetua);
		if((objetua.getIzena().equals(pObjetua)) && (objetua instanceof Kapela)){
			aurkitua = true;
			Kapela kap=new Kapela();
			kap.objektuaErabili();
		}
		else if((objetua.getIzena().equals(pObjetua)) && (objetua instanceof Likorea)){
			aurkitua = true;
			Likorea lik=new Likorea();
			lik.objektuaErabili();
		}
		else if((objetua.getIzena().equals(pObjetua)) && (objetua instanceof Pitia)){
						aurkitua = true;
						Pitia piti=new Pitia();
						piti.objektuaErabili();
		}	
		else if(!aurkitua){
			System.out.println("Ez da zure objetua aurkitu inbentarioan");
		}
	}
	
	
	
	
}
