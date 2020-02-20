package packlaborategia7;

import java.util.*;

/**
 * @author  aitziber
 */
public class ListaIkasleakKurtso
{
	/**
	 * @uml.property  name="lista"
	 */
	private ArrayList<Ikaslea> lista; 
	/**
	 * @uml.property  name="nireListaIkasleakKurtso"
	 * @uml.associationEnd  
	 */
	private static ListaIkasleakKurtso nireListaIkasleakKurtso = null;

	private ListaIkasleakKurtso(){
		this.lista = new ArrayList<Ikaslea>();
	}
			
	public static ListaIkasleakKurtso getListaIkasleakKurtso(){
		if(nireListaIkasleakKurtso == null){
			nireListaIkasleakKurtso = new ListaIkasleakKurtso();
		}
		return nireListaIkasleakKurtso;
	}

	/**
	 * @return
	 * @uml.property  name="lista"
	 */
			
	public void gehituIkasleaKurtsoan(Ikaslea pIkaslea)
	{
		this.lista.add(pIkaslea);
	}

	private Iterator<Ikaslea> getIteradorea()
	{
		return(this.lista.iterator());
	}

	public void erreseteatu()
	{
		this.lista.clear();
	}

	public Ikaslea bilatuIkasleaNANez(String pNAN)
	{
		Iterator<Ikaslea> itr = this.getIteradorea();
		Ikaslea ikasleBat = null;
		boolean badago = false;
		while(itr.hasNext() && !badago){
			ikasleBat = itr.next();
			if(ikasleBat.getNAN() == pNAN){
				badago = true;
			}
		}
		if(badago = false){
			ikasleBat = null;
		}		return ikasleBat;
		
	}
	
	public boolean badagoIkaslerikBikoterikGabe(){
		boolean badago = false;
		Ikaslea ikasle = null;
		Iterator<Ikaslea> itr = this.lista.iterator();
		while(itr.hasNext() && !badago){
			ikasle = itr.next();
			if(this.badagoIkaslerikBikoterikGabe()){
				badago = true;
			}
		}
		
		return badago;
	}
}
