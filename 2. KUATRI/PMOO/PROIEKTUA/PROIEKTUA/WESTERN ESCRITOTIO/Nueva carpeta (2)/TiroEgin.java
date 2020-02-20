package packproiektua;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;



public class TiroEgin extends Akzioa {
	
	public TiroEgin(){
		super("Tiro Egin",1);
	}
	
	public void tiroEgin() throws FileNotFoundException, IOException{
		Protagonista p = Protagonista.getNireProtagonista();
		int erasoa=Protagonista.getNireProtagonista().getAtaq();
		int defentsa = Protagonista.getNireProtagonista().getDef();
		int bizitza = Protagonista.getNireProtagonista().getPv();
		ListaEtsaiak l1 = Banketxea.getNireBanketxea().lortuEtsaiakBanketxetik();
		ListaEtsaiak l2 = this.berdinakDira();
		ListaEtsaiak l3=l2.etsaiaHildaBadagoKendu();
		if(l3.luzera()!=0){
			System.out.println("Aukeratu ahal dituzun etsaiak hauek dira: ");
			l2.etsaiakInprimatu();
			System.out.println("Idatzi tirokatu nahi duzun etsaiaren letra");
			this.tiroketa(l2);
		}
		else if(l3.luzera()==0){
			System.out.println();
			System.out.println("Ezin duzu etsairik tirokatu momentu honetan. Egizu beste zeozer");
			System.out.println();
	    	ListaAkzioa listaAkz = new ListaAkzioa();
	    	ListaAkzioa listaAkzB=listaAkz.listaAkzioakSortu(3);
    		listaAkzB.akzioaAukeratuEtaBurutu(3);
		}	
	}
	
	private void tiroketa(ListaEtsaiak pLista){
		boolean kontrolpean;
		do{
			kontrolpean = true;
		
		try{
			String izena = Teklatua.getNireTeklatua().irakurriString();
			Etsaia e = pLista.etsaiaBilatuIzenez(izena);
			if(pLista.badago(e)){
				//Ataque del protagonista al etsaia
				e.setBizitza(0);
				System.out.println(e.getIzena() + " hilda dago");	
			}
			}
			catch(BalioEzEgokia lag){
				System.out.println("Gaizki sartu duzu etsaiaren izena, sartu berriz...");
				kontrolpean = false;
			}
		}
		while(!kontrolpean);
	}

}
