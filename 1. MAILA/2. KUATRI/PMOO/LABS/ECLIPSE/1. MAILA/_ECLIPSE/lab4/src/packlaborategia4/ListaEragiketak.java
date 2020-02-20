package packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEragiketak {

	//atributuak
	private ArrayList<Eragiketa> lista;
	private static ListaEragiketak nireEragiketak=null;
	// eraikitzailea
	private ListaEragiketak() {
		this.lista=new ArrayList<Eragiketa>();
	}

	// gainontzeko metodoak
	public static ListaEragiketak getListaEragiketak() {
		if (nireEragiketak==null){
			nireEragiketak=new ListaEragiketak();
		}
		return nireEragiketak;
	}

	private Iterator<Eragiketa> getIteradorea() {
		return this.lista.iterator();
	}

	public int eragiketaKopurua() {
		return this.lista.size();
	}

	public void gehituEragiketa(int pId, int pIdBezeroa, String pPasaHitza,
			double pDiruKop) {
		this.lista.add(new Eragiketa(pId, pIdBezeroa, pPasaHitza, pDiruKop));
	}

	public void erreseteatu() {
		this.lista.clear();
	}

	public void eragiketaGuztiakBurutu() {
		/*boolean aurkituta=false;
		Bezeroa bezeroBilatu=null;
		Iterator<Bezeroa> itr=this.getIteradorea();
		while(itr.hasNext() && !aurkituta){
			bezeroBilatu=itr.next();
			if (bezeroBilatu.idBerdinaDu(pBezId)){
				aurkituta=true;
			}
		}
		return bezeroBilatu;*/
		Iterator<Eragiketa> itr=this.getIteradorea();
		while(itr.hasNext()){
			Eragiketa eragiketaBurutu=itr.next();
			eragiketaBurutu.eragiketaBurutu();
		}
			
	}

	public Eragiketa bilatuEragiketaIdz(int pEragId) {
		// jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
		// horrelakorik, bestela null.
		
		boolean aurkituta=false;
		Eragiketa operazioBilatu=null;
		Iterator<Eragiketa> itr=this.getIteradorea();
		while(itr.hasNext() && !aurkituta){
			operazioBilatu=itr.next();
			if (operazioBilatu.idBerdinaDu(pEragId)){
				aurkituta=true;
			}
		}
		return operazioBilatu;
		
	}

}
