package packlaborategia4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaBezeroak {
	// atributuak
	
	private ArrayList<Bezeroa> lista;
	private static ListaBezeroak nireBezeroak=null;

	// eraikitzailea singleton patroia aplikatu
	private ListaBezeroak() {
		this.lista=new ArrayList<Bezeroa>();
	}

	public static ListaBezeroak getNireListaBezeroak() {
		if (nireBezeroak==null){
			nireBezeroak=new ListaBezeroak();
		}
		return nireBezeroak;
	}

	private Iterator<Bezeroa> getIteradorea() {
		return this.lista.iterator();
	}

	public Bezeroa bilatuBezeroaIdz(int pBezId) {
		// jasotzen duen Id duen bezero bat bueltatuko du, baldin badago
		// horrelakorik, bestela null.
		boolean aurkituta=false;
		Bezeroa bezeroBilatu=null;
		Iterator<Bezeroa> itr=this.getIteradorea();
		while(itr.hasNext() && !aurkituta){
			bezeroBilatu=itr.next();
			if (bezeroBilatu.idBerdinaDu(pBezId)){
				aurkituta=true;
			}
		}
		if (!aurkituta){bezeroBilatu=null;}
		return bezeroBilatu;
	}

	// gainontzeko metodoak
	public int bezeroKopurua() {
		return this.lista.size();
	}

	public void gehituBezero(int pIdBezero, String pIzenAbizena,
			String pPasahitza, double pSaldoa, boolean pBerezia) {
		// bezeroen zerrendan jasotzen duen bezero bat gehitzen du. Bezero hori
		// jadanik sartuta balego, mezu bat aterako du abisatzeko.
		if (this.bilatuBezeroaIdz(pIdBezero)==null){
			this.lista.add(new Bezeroa(pIdBezero, pIzenAbizena, pPasahitza, pSaldoa, pBerezia));
		}
	}

	public void erreseteatu() {
		this.lista.clear();
	}

}
