package packlaborategia5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaLiburuak
{
   // atributuak
	private ArrayList<Liburua> lista;

	// eraikitzailea
	
	public ListaLiburuak(){
		this.lista = new ArrayList<Liburua>();	
	}

	// beste metodoak
	
	public int listarenTamaina(){  
		return this.lista.size();
	}
	 
	private Iterator<Liburua> getIteradorea(){
		return this.lista.iterator();
	}
  
	public Liburua bilatuLiburuaIdz(int pIdLiburua){
		Liburua liburu=null;
		Iterator<Liburua> itr = this.getIteradorea();
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua){
			liburu = itr.next();
			if(liburu.idHauDu(pIdLiburua)){
				aurkitua = true;
			}
		}
	
		return liburu;
			
	}
  
	public boolean badago(Liburua pLiburua){
	
		return this.lista.contains(pLiburua);
	}
	public boolean idBerdinekoLibururikBaAlDa(Liburua pLiburua){
		boolean idBerdina = false;
		Iterator<Liburua> itr = this.getIteradorea();
		Liburua liburu = null;
		while(itr.hasNext() && !idBerdina){
			liburu = itr.next();
			if(liburu.idBerdinaDute(pLiburua)){
				idBerdina = true;
			}
		}
		return idBerdina;
	}
	
	public void gehituLiburua(Liburua pLiburua){
		if(!this.badago(pLiburua)){
			this.lista.add(pLiburua);
		}
   }
	
	public void kenduLiburua(Liburua pLiburua){
		if(this.badago(pLiburua)){
			this.lista.remove(pLiburua);		
		}
	}
	
	public void inprimatu(){
		Iterator<Liburua> itr = this.getIteradorea();
		Liburua liburu = null;
		while(itr.hasNext()){
			liburu = itr.next();
			liburu.inprimatu();
		}
	}
 }
